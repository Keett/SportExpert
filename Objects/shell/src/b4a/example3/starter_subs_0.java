package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class starter_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (starter) ","starter",40,starter.processBA,starter.mostCurrent,20);
if (RapidSub.canDelegate("application_error")) { return b4a.example3.starter.remoteMe.runUserSub(false, "starter","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 20;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Return True";
Debug.ShouldStop(1048576);
if (true) return starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Public rp As RuntimePermissions";
starter._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 8;BA.debugLine="Public provider As FileProvider";
starter._provider = RemoteObject.createNew ("b4a.example3.fileprovider");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (starter) ","starter",40,starter.processBA,starter.mostCurrent,11);
if (RapidSub.canDelegate("service_create")) { return b4a.example3.starter.remoteMe.runUserSub(false, "starter","service_create");}
 BA.debugLineNum = 11;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="provider.Initialize";
Debug.ShouldStop(2048);
starter._provider.runClassMethod (b4a.example3.fileprovider.class, "_initialize" /*RemoteObject*/ ,starter.processBA);
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (starter) ","starter",40,starter.processBA,starter.mostCurrent,24);
if (RapidSub.canDelegate("service_destroy")) { return b4a.example3.starter.remoteMe.runUserSub(false, "starter","service_destroy");}
 BA.debugLineNum = 24;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (starter) ","starter",40,starter.processBA,starter.mostCurrent,15);
if (RapidSub.canDelegate("service_start")) { return b4a.example3.starter.remoteMe.runUserSub(false, "starter","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 15;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}