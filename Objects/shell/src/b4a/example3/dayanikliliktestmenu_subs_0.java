package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dayanikliliktestmenu_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (dayanikliliktestmenu) ","dayanikliliktestmenu",15,dayanikliliktestmenu.mostCurrent.activityBA,dayanikliliktestmenu.mostCurrent,23);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.dayanikliliktestmenu.remoteMe.runUserSub(false, "dayanikliliktestmenu","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 23;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="Activity.LoadLayout(\"DayaniklilikTestMenuPage\")";
Debug.ShouldStop(16777216);
dayanikliliktestmenu.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DayaniklilikTestMenuPage")),dayanikliliktestmenu.mostCurrent.activityBA);
 BA.debugLineNum = 27;BA.debugLine="LabelDayaniklilikTest.Text = \"DAYANIKLILIK TEST\"";
Debug.ShouldStop(67108864);
dayanikliliktestmenu.mostCurrent._labeldayanikliliktest.runMethod(true,"setText",BA.ObjectToCharSequence("DAYANIKLILIK TEST"));
 BA.debugLineNum = 28;BA.debugLine="LabelDayaniklilikTest.TextColor = Colors.White";
Debug.ShouldStop(134217728);
dayanikliliktestmenu.mostCurrent._labeldayanikliliktest.runMethod(true,"setTextColor",dayanikliliktestmenu.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 29;BA.debugLine="LabelDayaniklilikTest.TextSize = 20";
Debug.ShouldStop(268435456);
dayanikliliktestmenu.mostCurrent._labeldayanikliliktest.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 30;BA.debugLine="LabelDayaniklilikTest.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(536870912);
dayanikliliktestmenu.mostCurrent._labeldayanikliliktest.runMethod(false,"setTypeface",dayanikliliktestmenu.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 32;BA.debugLine="LabelProgram.Text = \"PROGRAM\"";
Debug.ShouldStop(-2147483648);
dayanikliliktestmenu.mostCurrent._labelprogram.runMethod(true,"setText",BA.ObjectToCharSequence("PROGRAM"));
 BA.debugLineNum = 33;BA.debugLine="LabelProgram.TextColor = Colors.White";
Debug.ShouldStop(1);
dayanikliliktestmenu.mostCurrent._labelprogram.runMethod(true,"setTextColor",dayanikliliktestmenu.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 34;BA.debugLine="LabelProgram.TextSize = 20";
Debug.ShouldStop(2);
dayanikliliktestmenu.mostCurrent._labelprogram.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 35;BA.debugLine="LabelProgram.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4);
dayanikliliktestmenu.mostCurrent._labelprogram.runMethod(false,"setTypeface",dayanikliliktestmenu.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Pause (dayanikliliktestmenu) ","dayanikliliktestmenu",15,dayanikliliktestmenu.mostCurrent.activityBA,dayanikliliktestmenu.mostCurrent,43);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.dayanikliliktestmenu.remoteMe.runUserSub(false, "dayanikliliktestmenu","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Activity_Resume (dayanikliliktestmenu) ","dayanikliliktestmenu",15,dayanikliliktestmenu.mostCurrent.activityBA,dayanikliliktestmenu.mostCurrent,39);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.dayanikliliktestmenu.remoteMe.runUserSub(false, "dayanikliliktestmenu","activity_resume");}
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("ButtonAnasayfa_Click (dayanikliliktestmenu) ","dayanikliliktestmenu",15,dayanikliliktestmenu.mostCurrent.activityBA,dayanikliliktestmenu.mostCurrent,63);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.dayanikliliktestmenu.remoteMe.runUserSub(false, "dayanikliliktestmenu","buttonanasayfa_click");}
 BA.debugLineNum = 63;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(-2147483648);
dayanikliliktestmenu.mostCurrent.__c.runVoidMethod ("StartActivity",dayanikliliktestmenu.processBA,(Object)((dayanikliliktestmenu.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 65;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1);
dayanikliliktestmenu.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondayanikliliktest_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDayaniklilikTest_Click (dayanikliliktestmenu) ","dayanikliliktestmenu",15,dayanikliliktestmenu.mostCurrent.activityBA,dayanikliliktestmenu.mostCurrent,51);
if (RapidSub.canDelegate("buttondayanikliliktest_click")) { return b4a.example3.dayanikliliktestmenu.remoteMe.runUserSub(false, "dayanikliliktestmenu","buttondayanikliliktest_click");}
 BA.debugLineNum = 51;BA.debugLine="Sub ButtonDayaniklilikTest_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="StartActivity(DayaniklilikTestListele)";
Debug.ShouldStop(524288);
dayanikliliktestmenu.mostCurrent.__c.runVoidMethod ("StartActivity",dayanikliliktestmenu.processBA,(Object)((dayanikliliktestmenu.mostCurrent._dayanikliliktestlistele.getObject())));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonprogram_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonProgram_Click (dayanikliliktestmenu) ","dayanikliliktestmenu",15,dayanikliliktestmenu.mostCurrent.activityBA,dayanikliliktestmenu.mostCurrent,47);
if (RapidSub.canDelegate("buttonprogram_click")) { return b4a.example3.dayanikliliktestmenu.remoteMe.runUserSub(false, "dayanikliliktestmenu","buttonprogram_click");}
 BA.debugLineNum = 47;BA.debugLine="Sub ButtonProgram_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="StartActivity(ProgramListele)";
Debug.ShouldStop(32768);
dayanikliliktestmenu.mostCurrent.__c.runVoidMethod ("StartActivity",dayanikliliktestmenu.processBA,(Object)((dayanikliliktestmenu.mostCurrent._programlistele.getObject())));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
 //BA.debugLineNum = 16;BA.debugLine="Private ButtonProgram As Button";
dayanikliliktestmenu.mostCurrent._buttonprogram = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private LabelProgram As Label";
dayanikliliktestmenu.mostCurrent._labelprogram = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ButtonDayaniklilikTest As Button";
dayanikliliktestmenu.mostCurrent._buttondayanikliliktest = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private LabelDayaniklilikTest As Label";
dayanikliliktestmenu.mostCurrent._labeldayanikliliktest = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ButtonAnasayfa As Button";
dayanikliliktestmenu.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _labeldayanikliliktest_click() throws Exception{
try {
		Debug.PushSubsStack("LabelDayaniklilikTest_Click (dayanikliliktestmenu) ","dayanikliliktestmenu",15,dayanikliliktestmenu.mostCurrent.activityBA,dayanikliliktestmenu.mostCurrent,55);
if (RapidSub.canDelegate("labeldayanikliliktest_click")) { return b4a.example3.dayanikliliktestmenu.remoteMe.runUserSub(false, "dayanikliliktestmenu","labeldayanikliliktest_click");}
 BA.debugLineNum = 55;BA.debugLine="Sub LabelDayaniklilikTest_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="ButtonDayaniklilikTest_Click";
Debug.ShouldStop(8388608);
_buttondayanikliliktest_click();
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _labelprogram_click() throws Exception{
try {
		Debug.PushSubsStack("LabelProgram_Click (dayanikliliktestmenu) ","dayanikliliktestmenu",15,dayanikliliktestmenu.mostCurrent.activityBA,dayanikliliktestmenu.mostCurrent,59);
if (RapidSub.canDelegate("labelprogram_click")) { return b4a.example3.dayanikliliktestmenu.remoteMe.runUserSub(false, "dayanikliliktestmenu","labelprogram_click");}
 BA.debugLineNum = 59;BA.debugLine="Sub LabelProgram_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="ButtonProgram_Click";
Debug.ShouldStop(134217728);
_buttonprogram_click();
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}