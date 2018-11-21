var exec = require("cordova/exec");

// Here "add" is the method in quotes
// success and erros are callbacks
// "MyPlug" is plugin name
module.exports.add = function(arg0, success, error) {
  exec(success, error, "MyPlug", "add", [arg0]);
};
