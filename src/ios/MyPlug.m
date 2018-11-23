/********* MyPlug.m Cordova Plugin Implementation *******/

#import <Cordova/CDV.h>

@interface MyPlug : CDVPlugin {
  // Member variables go here.
}

- (void)add:(CDVInvokedUrlCommand*)command;
@end

@implementation MyPlug


- (void)add:(CDVInvokedUrlCommand*)command
{
    CDVPluginResult* pluginResult = nil;
    pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:@"iOS- You called add function"];
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
