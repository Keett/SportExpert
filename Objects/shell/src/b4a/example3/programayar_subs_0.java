package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class programayar_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (programayar) ","programayar",7,programayar.mostCurrent.activityBA,programayar.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.programayar.remoteMe.runUserSub(false, "programayar","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"ProgramAyarPage\")";
Debug.ShouldStop(-2147483648);
programayar.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ProgramAyarPage")),programayar.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="SpinnerLevel.DropdownBackgroundColor = Colors.Whi";
Debug.ShouldStop(4);
programayar.mostCurrent._spinnerlevel.runMethod(true,"setDropdownBackgroundColor",programayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 36;BA.debugLine="SpinnerLevel.DropdownTextColor = Color.koyuMavi";
Debug.ShouldStop(8);
programayar.mostCurrent._spinnerlevel.runMethod(true,"setDropdownTextColor",programayar.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 37;BA.debugLine="SpinnerLevel.TextColor = Colors.White";
Debug.ShouldStop(16);
programayar.mostCurrent._spinnerlevel.runMethod(true,"setTextColor",programayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 38;BA.debugLine="SpinnerLevel.TextSize = 20";
Debug.ShouldStop(32);
programayar.mostCurrent._spinnerlevel.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 40;BA.debugLine="LabelLevel.TextColor = Colors.White";
Debug.ShouldStop(128);
programayar.mostCurrent._labellevel.runMethod(true,"setTextColor",programayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 41;BA.debugLine="LabelLevel.Text = \"LEVEL\"";
Debug.ShouldStop(256);
programayar.mostCurrent._labellevel.runMethod(true,"setText",BA.ObjectToCharSequence("LEVEL"));
 BA.debugLineNum = 42;BA.debugLine="LabelLevel.TextSize = 20";
Debug.ShouldStop(512);
programayar.mostCurrent._labellevel.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 43;BA.debugLine="LabelLevel.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1024);
programayar.mostCurrent._labellevel.runMethod(false,"setTypeface",programayar.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 45;BA.debugLine="LabelTestTuru.TextColor = Colors.White";
Debug.ShouldStop(4096);
programayar.mostCurrent._labeltestturu.runMethod(true,"setTextColor",programayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 46;BA.debugLine="LabelTestTuru.Text = \"LEVEL\"";
Debug.ShouldStop(8192);
programayar.mostCurrent._labeltestturu.runMethod(true,"setText",BA.ObjectToCharSequence("LEVEL"));
 BA.debugLineNum = 47;BA.debugLine="LabelTestTuru.TextSize = 20";
Debug.ShouldStop(16384);
programayar.mostCurrent._labeltestturu.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 48;BA.debugLine="LabelTestTuru.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(32768);
programayar.mostCurrent._labeltestturu.runMethod(false,"setTypeface",programayar.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 50;BA.debugLine="SpinnerTestTuru.DropdownBackgroundColor = Colors.";
Debug.ShouldStop(131072);
programayar.mostCurrent._spinnertestturu.runMethod(true,"setDropdownBackgroundColor",programayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 51;BA.debugLine="SpinnerTestTuru.DropdownTextColor = Color.koyuMav";
Debug.ShouldStop(262144);
programayar.mostCurrent._spinnertestturu.runMethod(true,"setDropdownTextColor",programayar.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 52;BA.debugLine="SpinnerTestTuru.TextColor = Colors.White";
Debug.ShouldStop(524288);
programayar.mostCurrent._spinnertestturu.runMethod(true,"setTextColor",programayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 53;BA.debugLine="SpinnerTestTuru.TextSize = 20";
Debug.ShouldStop(1048576);
programayar.mostCurrent._spinnertestturu.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 55;BA.debugLine="LabelProgramAdi.TextColor = Colors.White";
Debug.ShouldStop(4194304);
programayar.mostCurrent._labelprogramadi.runMethod(true,"setTextColor",programayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 56;BA.debugLine="LabelProgramAdi.Text = \"PROGRAM ADI\"";
Debug.ShouldStop(8388608);
programayar.mostCurrent._labelprogramadi.runMethod(true,"setText",BA.ObjectToCharSequence("PROGRAM ADI"));
 BA.debugLineNum = 57;BA.debugLine="LabelProgramAdi.TextSize = 20";
Debug.ShouldStop(16777216);
programayar.mostCurrent._labelprogramadi.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 58;BA.debugLine="LabelProgramAdi.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(33554432);
programayar.mostCurrent._labelprogramadi.runMethod(false,"setTypeface",programayar.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 60;BA.debugLine="EditTextProgramAdi.TextColor = Colors.White";
Debug.ShouldStop(134217728);
programayar.mostCurrent._edittextprogramadi.runMethod(true,"setTextColor",programayar.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 61;BA.debugLine="EditTextProgramAdi.Hint = \"Program adını buraya y";
Debug.ShouldStop(268435456);
programayar.mostCurrent._edittextprogramadi.runMethod(true,"setHint",BA.ObjectToString("Program adını buraya yazmalısınız.."));
 BA.debugLineNum = 62;BA.debugLine="EditTextProgramAdi.HintColor = Color.hintColor";
Debug.ShouldStop(536870912);
programayar.mostCurrent._edittextprogramadi.runMethod(true,"setHintColor",programayar.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 63;BA.debugLine="EditTextProgramAdi.TextSize = 20";
Debug.ShouldStop(1073741824);
programayar.mostCurrent._edittextprogramadi.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 64;BA.debugLine="EditTextProgramAdi.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(-2147483648);
programayar.mostCurrent._edittextprogramadi.runMethod(false,"setTypeface",programayar.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 68;BA.debugLine="SpinnerLevel.AddAll(Array As Int(1,2,3,4,5,6,7,8,";
Debug.ShouldStop(8);
programayar.mostCurrent._spinnerlevel.runVoidMethod ("AddAll",(Object)(programayar.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("int",new int[] {25},new Object[] {BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12),BA.numberCast(int.class, 13),BA.numberCast(int.class, 14),BA.numberCast(int.class, 15),BA.numberCast(int.class, 16),BA.numberCast(int.class, 17),BA.numberCast(int.class, 18),BA.numberCast(int.class, 19),BA.numberCast(int.class, 20),BA.numberCast(int.class, 21),BA.numberCast(int.class, 22),BA.numberCast(int.class, 23),BA.numberCast(int.class, 24),BA.numberCast(int.class, 25)})))));
 BA.debugLineNum = 69;BA.debugLine="SpinnerTestTuru.AddAll(Array As String(\"Shuttle R";
Debug.ShouldStop(16);
programayar.mostCurrent._spinnertestturu.runVoidMethod ("AddAll",(Object)(programayar.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Shuttle Run"),RemoteObject.createImmutable("Conconi")})))));
 BA.debugLineNum = 71;BA.debugLine="secilenLevel = 1";
Debug.ShouldStop(64);
programayar._secilenlevel = BA.numberCast(int.class, 1);
 BA.debugLineNum = 72;BA.debugLine="secilenTestTuru = \"Shuttle Run\"";
Debug.ShouldStop(128);
programayar._secilentestturu = BA.ObjectToString("Shuttle Run");
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Pause (programayar) ","programayar",7,programayar.mostCurrent.activityBA,programayar.mostCurrent,79);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.programayar.remoteMe.runUserSub(false, "programayar","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 79;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Resume (programayar) ","programayar",7,programayar.mostCurrent.activityBA,programayar.mostCurrent,75);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.programayar.remoteMe.runUserSub(false, "programayar","activity_resume");}
 BA.debugLineNum = 75;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1024);
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttongec_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonGec_Click (programayar) ","programayar",7,programayar.mostCurrent.activityBA,programayar.mostCurrent,93);
if (RapidSub.canDelegate("buttongec_click")) { return b4a.example3.programayar.remoteMe.runUserSub(false, "programayar","buttongec_click");}
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 BA.debugLineNum = 93;BA.debugLine="Sub ButtonGec_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="If EditTextProgramAdi.Text.Length == 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",programayar.mostCurrent._edittextprogramadi.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 95;BA.debugLine="ToastMessageShow(\"Program adını girmelisiniz\", T";
Debug.ShouldStop(1073741824);
programayar.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Program adını girmelisiniz")),(Object)(programayar.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 96;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 99;BA.debugLine="Dim rs As ResultSet = Main.sql.ExecQuery(\"SELECT";
Debug.ShouldStop(4);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_rs.setObject(programayar.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM DayaniklilikTestProgram  WHERE program_adi  = '"),programayar.mostCurrent._edittextprogramadi.runMethod(true,"getText"),RemoteObject.createImmutable("' ")))));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 100;BA.debugLine="If rs.RowCount >0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_rs.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 101;BA.debugLine="Msgbox(\"Bu program adı kaydedildi\",\"\")";
Debug.ShouldStop(16);
programayar.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Bu program adı kaydedildi")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),programayar.mostCurrent.activityBA);
 BA.debugLineNum = 102;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 104;BA.debugLine="rs.Close";
Debug.ShouldStop(128);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 106;BA.debugLine="programAdi = EditTextProgramAdi.Text";
Debug.ShouldStop(512);
programayar._programadi = programayar.mostCurrent._edittextprogramadi.runMethod(true,"getText");
 BA.debugLineNum = 107;BA.debugLine="StartActivity(ProgramVeri)";
Debug.ShouldStop(1024);
programayar.mostCurrent.__c.runVoidMethod ("StartActivity",programayar.processBA,(Object)((programayar.mostCurrent._programveri.getObject())));
 BA.debugLineNum = 108;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
programayar.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private LabelLevel As Label";
programayar.mostCurrent._labellevel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private SpinnerLevel As Spinner";
programayar.mostCurrent._spinnerlevel = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private LabelTestTuru As Label";
programayar.mostCurrent._labeltestturu = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private SpinnerTestTuru As Spinner";
programayar.mostCurrent._spinnertestturu = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonGec As Button";
programayar.mostCurrent._buttongec = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private LabelProgramAdi As Label";
programayar.mostCurrent._labelprogramadi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private EditTextProgramAdi As EditText";
programayar.mostCurrent._edittextprogramadi = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Dim secilenLevel As Int";
programayar._secilenlevel = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="Dim secilenTestTuru As String";
programayar._secilentestturu = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim programAdi As String";
programayar._programadi = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spinnerlevel_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinnerLevel_ItemClick (programayar) ","programayar",7,programayar.mostCurrent.activityBA,programayar.mostCurrent,84);
if (RapidSub.canDelegate("spinnerlevel_itemclick")) { return b4a.example3.programayar.remoteMe.runUserSub(false, "programayar","spinnerlevel_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 84;BA.debugLine="Sub SpinnerLevel_ItemClick (Position As Int, Value";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="secilenLevel= Value";
Debug.ShouldStop(1048576);
programayar._secilenlevel = BA.numberCast(int.class, _value);
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinnertestturu_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinnerTestTuru_ItemClick (programayar) ","programayar",7,programayar.mostCurrent.activityBA,programayar.mostCurrent,89);
if (RapidSub.canDelegate("spinnertestturu_itemclick")) { return b4a.example3.programayar.remoteMe.runUserSub(false, "programayar","spinnertestturu_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 89;BA.debugLine="Sub SpinnerTestTuru_ItemClick (Position As Int, Va";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="secilenTestTuru = Value";
Debug.ShouldStop(33554432);
programayar._secilentestturu = BA.ObjectToString(_value);
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}