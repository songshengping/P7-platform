package com.song.p7.platform.controller;

import com.song.p7.platform.bo.TestBO;
import com.song.p7.platform.exception.GeneralException;
import com.song.p7.platform.pojo.Test;
import com.song.p7.platform.service.TestService;
import com.song.p7.platform.transform.TestTransMapper;
import com.song.p7.platform.utils.APIErrorCode;
import com.song.p7.platform.utils.APIResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description 测试的接口地址
 * @Date 2020/5/10 20:34
 * @Created by Jeremy
 */
@RestController
@Api(tags = {"给我老婆测试的接口地址"})
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping(value = "/test/{id}")
    @ApiOperation(value = "在路径上,填写参数ID值,根据ID值查询TEST表中的数据", notes = "在路径参数上,填写ID,根据ID值查询TEST表中的数据")
    public APIResponse<Test> getTestInfoById(@PathVariable Integer id) throws GeneralException {
        Test test = testService.getTest(id);
        if(test == null){
            throw new GeneralException(APIErrorCode.TEST_NOT_EXIST);
        }
        return new APIResponse<>(test);
    }

    @GetMapping(value = "/tests")
    @ApiOperation(value = "查询所有TEST中的内容", notes = "查询所有TEST中的内容")
    public APIResponse<List<Test>> getAllTest() {
        return new APIResponse<>(testService.getAllTest());
    }

//    @GetMapping(value = "/test/{name}")
//    @ApiOperation(value = "按照名称模糊匹配查询TEST表中的记录", notes = "按照名称模糊匹配查询TEST表中的记录")
//    public APIResponse<List<Test>> getTestByName(@PathVariable(value = "name", name = "name")
//                                                 @ApiParam(value = "查询的名称", name = "查询的名称") String name) {
//        return new APIResponse<>(testService.getTestByName(name));
//    }

//    @GetMapping(value = "/test")
//    @ApiOperation(value = "通过RequestBody传参查询TEST数据", notes = "通过RequestBody传参查询TEST数据")
//    public APIResponse<List<Test>> getTestByBO(@RequestBody TestBO testBO) {
//        return new APIResponse<>(testService.getTestByBO(testBO));
//    }

    @GetMapping(value = "/test")
    @ApiOperation(value = "通过路径参数传参查询TEST表中数据")
    public APIResponse<List<Test>> getTestByParam(@RequestParam(value = "id", name = "id", required = false)
                                                  @ApiParam(value = "查询的主键", name = "id")
                                                          Integer id,
                                                  @RequestParam(value = "name", name = "name", required = false)
                                                  @ApiParam(value = "模糊查询Test表中的name字段", name = "name")
                                                          String name) {
        return new APIResponse<>(testService.getTestByParam(id, name));
    }

    @PostMapping(value = "/test")
    @ApiOperation(value = "新增Test表字段,通过路径传参")
    public APIResponse<Boolean> addTest(@ApiParam(name = "name", value = "新增的name的值")
                                            @RequestParam(value = "name", name = "name")
                                                    String name){
        return new APIResponse<>(testService.addTest(name) > 0);
    }

    @PutMapping(value = "/test")
    @ApiOperation(value = "通过RequestBody传参修改Test表记录")
    public APIResponse<Boolean> modifyTest(@RequestBody TestBO testBO) throws GeneralException {
        Test test = testService.getTest(testBO.getId());
        if(test == null){
            throw new GeneralException(APIErrorCode.TEST_NOT_EXIST);
        }
        TestTransMapper.INSTANCE.toModelTaget(test, testBO);
        return new APIResponse<>(testService.modifyByParam(test) > 0);
    }

    @PutMapping(value = "/test/by_param")
    @ApiOperation(value = "通过URL路径传参修改Test表记录")
    public APIResponse<Boolean> modifyTest(@RequestParam(value = "id", name = "id")
                                               @ApiParam(value = "查询的主键", name = "id")
                                                       Integer id,
                                           @RequestParam(value = "name", name = "name")
                                               @ApiParam(value = "模糊查询Test表中的name字段", name = "name")
                                                       String name) throws GeneralException {
        Test test = testService.getTest(id);
        if(test == null){
            throw new GeneralException(APIErrorCode.TEST_NOT_EXIST);
        }
        // 临时处理
        test.setName(name);
        return new APIResponse<>(testService.modifyByParam(test) > 0);
    }

    @DeleteMapping(value = "/test/{id}")
    @ApiOperation(value = "删除Test表中记录")
    public APIResponse<Boolean> deleteTestById(@ApiParam(name="id",value = "路径中的参数主键ID")@PathVariable(value = "id", name = "id")
   Integer id) throws GeneralException {
        if(testService.getTest(id) == null){
            throw new GeneralException(APIErrorCode.TEST_NOT_EXIST);
        }
        return new APIResponse<>(testService.deleteTestById(id) > 0);
    }

}
