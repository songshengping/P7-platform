function getWebRootPath(){
    var protocol = window.location.protocol;
    var hostAndPort = window.location.host;
    hostAndPort = "127.0.0.1:8080";
    var pathName = window.document.location.pathname;
    var projectName = pathName.substring(0,pathName.substr(1).indexOf('/')+1);
    return(protocol + "//" + hostAndPort + projectName);
}

function getRootPath(){
    var protocol = window.location.protocol;
    var hostAndPort = window.location.host;
    hostAndPort = "127.0.0.1:8088";
    var pathName = window.document.location.pathname;
    var projectName = pathName.substring(0,pathName.substr(1).indexOf('/')+1);
    return(protocol + "//" + hostAndPort + projectName);
}