package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class anamenu_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (anamenu) ","anamenu",31,anamenu.mostCurrent.activityBA,anamenu.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.anamenu.remoteMe.runUserSub(false, "anamenu","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"AnasayfaPage\")";
Debug.ShouldStop(536870912);
anamenu.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("AnasayfaPage")),anamenu.mostCurrent.activityBA);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (anamenu) ","anamenu",31,anamenu.mostCurrent.activityBA,anamenu.mostCurrent,38);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.anamenu.remoteMe.runUserSub(false, "anamenu","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (anamenu) ","anamenu",31,anamenu.mostCurrent.activityBA,anamenu.mostCurrent,34);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.anamenu.remoteMe.runUserSub(false, "anamenu","activity_resume");}
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonanasayfa_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAnasayfa_Click (anamenu) ","anamenu",31,anamenu.mostCurrent.activityBA,anamenu.mostCurrent,62);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.anamenu.remoteMe.runUserSub(false, "anamenu","buttonanasayfa_click");}
 BA.debugLineNum = 62;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonayarlar_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAyarlar_Click (anamenu) ","anamenu",31,anamenu.mostCurrent.activityBA,anamenu.mostCurrent,54);
if (RapidSub.canDelegate("buttonayarlar_click")) { return b4a.example3.anamenu.remoteMe.runUserSub(false, "anamenu","buttonayarlar_click");}
 BA.debugLineNum = 54;BA.debugLine="Sub ButtonAyarlar_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondenek_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDenek_Click (anamenu) ","anamenu",31,anamenu.mostCurrent.activityBA,anamenu.mostCurrent,42);
if (RapidSub.canDelegate("buttondenek_click")) { return b4a.example3.anamenu.remoteMe.runUserSub(false, "anamenu","buttondenek_click");}
 BA.debugLineNum = 42;BA.debugLine="Sub ButtonDenek_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="StartActivity(DenekListele)";
Debug.ShouldStop(1024);
anamenu.mostCurrent.__c.runVoidMethod ("StartActivity",anamenu.processBA,(Object)((anamenu.mostCurrent._deneklistele.getObject())));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonraporlama_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonRaporlama_Click (anamenu) ","anamenu",31,anamenu.mostCurrent.activityBA,anamenu.mostCurrent,50);
if (RapidSub.canDelegate("buttonraporlama_click")) { return b4a.example3.anamenu.remoteMe.runUserSub(false, "anamenu","buttonraporlama_click");}
 BA.debugLineNum = 50;BA.debugLine="Sub ButtonRaporlama_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttontest_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTest_Click (anamenu) ","anamenu",31,anamenu.mostCurrent.activityBA,anamenu.mostCurrent,46);
if (RapidSub.canDelegate("buttontest_click")) { return b4a.example3.anamenu.remoteMe.runUserSub(false, "anamenu","buttontest_click");}
 BA.debugLineNum = 46;BA.debugLine="Sub ButtonTest_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="StartActivity(TestMenu)";
Debug.ShouldStop(16384);
anamenu.mostCurrent.__c.runVoidMethod ("StartActivity",anamenu.processBA,(Object)((anamenu.mostCurrent._testmenu.getObject())));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonyardimklavuzu_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonYardimKlavuzu_Click (anamenu) ","anamenu",31,anamenu.mostCurrent.activityBA,anamenu.mostCurrent,58);
if (RapidSub.canDelegate("buttonyardimklavuzu_click")) { return b4a.example3.anamenu.remoteMe.runUserSub(false, "anamenu","buttonyardimklavuzu_click");}
 BA.debugLineNum = 58;BA.debugLine="Sub ButtonYardimKlavuzu_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private ButtonDenek As Button";
anamenu.mostCurrent._buttondenek = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private LabelDenek As Label";
anamenu.mostCurrent._labeldenek = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ButtonTest As Button";
anamenu.mostCurrent._buttontest = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private LabelTest As Label";
anamenu.mostCurrent._labeltest = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private LabelRaporlama As Label";
anamenu.mostCurrent._labelraporlama = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private LabelAyarlar As Label";
anamenu.mostCurrent._labelayarlar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private LabelYardimKlavuzu As Label";
anamenu.mostCurrent._labelyardimklavuzu = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ButtonAyarlar As Button";
anamenu.mostCurrent._buttonayarlar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ButtonYardimKlavuzu As Button";
anamenu.mostCurrent._buttonyardimklavuzu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonAnasayfa As Button";
anamenu.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}