package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class sesservice_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim mp As MediaPlayer";
sesservice._mp = RemoteObject.createNew ("anywheresoftware.b4a.objects.MediaPlayerWrapper");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (sesservice) ","sesservice",21,sesservice.processBA,sesservice.mostCurrent,13);
if (RapidSub.canDelegate("service_create")) { return b4a.example3.sesservice.remoteMe.runUserSub(false, "sesservice","service_create");}
 BA.debugLineNum = 13;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(4096);
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Service_Destroy (sesservice) ","sesservice",21,sesservice.processBA,sesservice.mostCurrent,24);
if (RapidSub.canDelegate("service_destroy")) { return b4a.example3.sesservice.remoteMe.runUserSub(false, "sesservice","service_destroy");}
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
		Debug.PushSubsStack("Service_Start (sesservice) ","sesservice",21,sesservice.processBA,sesservice.mostCurrent,17);
if (RapidSub.canDelegate("service_start")) { return b4a.example3.sesservice.remoteMe.runUserSub(false, "sesservice","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 17;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Service.StopAutomaticForeground 'Call this when t";
Debug.ShouldStop(131072);
sesservice.mostCurrent._service.runVoidMethod ("StopAutomaticForeground");
 BA.debugLineNum = 19;BA.debugLine="mp.Initialize";
Debug.ShouldStop(262144);
sesservice._mp.runVoidMethod ("Initialize");
 BA.debugLineNum = 20;BA.debugLine="mp.Load(File.DirAssets, \"sound1.mp3\")";
Debug.ShouldStop(524288);
sesservice._mp.runVoidMethod ("Load",(Object)(sesservice.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("sound1.mp3")));
 BA.debugLineNum = 21;BA.debugLine="mp.Play";
Debug.ShouldStop(1048576);
sesservice._mp.runVoidMethod ("Play");
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}