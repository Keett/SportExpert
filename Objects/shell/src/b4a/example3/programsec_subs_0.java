package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class programsec_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (programsec) ","programsec",46,programsec.mostCurrent.activityBA,programsec.mostCurrent,33);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.programsec.remoteMe.runUserSub(false, "programsec","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"ProgramSecPage\")";
Debug.ShouldStop(4);
programsec.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ProgramSecPage")),programsec.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(8);
programsec.mostCurrent._labelcarpi.runMethod(true,"setVisible",programsec.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 39;BA.debugLine="ListView1.TwoLinesLayout.Label.Visible = False";
Debug.ShouldStop(64);
programsec.mostCurrent._listview1.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setVisible",programsec.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 40;BA.debugLine="ListView1.TwoLinesLayout.SecondLabel.TextColor =";
Debug.ShouldStop(128);
programsec.mostCurrent._listview1.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(true,"setTextColor",programsec.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="ListView1.TwoLinesLayout.SecondLabel.TextSize = 2";
Debug.ShouldStop(256);
programsec.mostCurrent._listview1.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 42;BA.debugLine="SetDivider(ListView1, Color.acikMavi, 3dip)";
Debug.ShouldStop(512);
_setdivider(programsec.mostCurrent._listview1,programsec.mostCurrent._color._acikmavi /*RemoteObject*/ ,programsec.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 44;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(2048);
programsec.mostCurrent._edittextara.runMethod(true,"setTextColor",programsec.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 45;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(4096);
programsec.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 46;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(8192);
programsec.mostCurrent._edittextara.runMethod(true,"setHintColor",programsec.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 47;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(16384);
programsec.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 48;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(32768);
programsec.mostCurrent._edittextara.runMethod(false,"setTypeface",programsec.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 50;BA.debugLine="ButtonProgramAdi.TextColor = Color.koyuMavi";
Debug.ShouldStop(131072);
programsec.mostCurrent._buttonprogramadi.runMethod(true,"setTextColor",programsec.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 51;BA.debugLine="ButtonProgramAdi.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(262144);
programsec.mostCurrent._buttonprogramadi.runMethod(false,"setTypeface",programsec.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 52;BA.debugLine="ButtonProgramAdi.TextSize = 14";
Debug.ShouldStop(524288);
programsec.mostCurrent._buttonprogramadi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 53;BA.debugLine="ButtonProgramAdi.SingleLine = True";
Debug.ShouldStop(1048576);
programsec.mostCurrent._buttonprogramadi.runVoidMethod ("setSingleLine",programsec.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 54;BA.debugLine="ButtonTestTuru.TextColor = Color.koyuMavi";
Debug.ShouldStop(2097152);
programsec.mostCurrent._buttontestturu.runMethod(true,"setTextColor",programsec.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 55;BA.debugLine="ButtonTestTuru.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4194304);
programsec.mostCurrent._buttontestturu.runMethod(false,"setTypeface",programsec.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 56;BA.debugLine="ButtonTestTuru.TextSize = 14";
Debug.ShouldStop(8388608);
programsec.mostCurrent._buttontestturu.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 57;BA.debugLine="ButtonTestTuru.SingleLine = True";
Debug.ShouldStop(16777216);
programsec.mostCurrent._buttontestturu.runVoidMethod ("setSingleLine",programsec.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 59;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
Debug.ShouldStop(67108864);
programsec.mostCurrent._buttontarih.runMethod(true,"setTextColor",programsec.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 60;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(134217728);
programsec.mostCurrent._buttontarih.runMethod(false,"setTypeface",programsec.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 61;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
Debug.ShouldStop(268435456);
programsec.mostCurrent._buttontarih.runMethod(true,"setText",BA.ObjectToCharSequence("TARİH"));
 BA.debugLineNum = 62;BA.debugLine="ButtonTarih.TextSize = 14";
Debug.ShouldStop(536870912);
programsec.mostCurrent._buttontarih.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 63;BA.debugLine="ButtonTarih.SingleLine = True";
Debug.ShouldStop(1073741824);
programsec.mostCurrent._buttontarih.runVoidMethod ("setSingleLine",programsec.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 65;BA.debugLine="ButtonLevel.TextColor = Color.koyuMavi";
Debug.ShouldStop(1);
programsec.mostCurrent._buttonlevel.runMethod(true,"setTextColor",programsec.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 66;BA.debugLine="ButtonLevel.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2);
programsec.mostCurrent._buttonlevel.runMethod(false,"setTypeface",programsec.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 67;BA.debugLine="ButtonLevel.Text = \"LEVEL\"";
Debug.ShouldStop(4);
programsec.mostCurrent._buttonlevel.runMethod(true,"setText",BA.ObjectToCharSequence("LEVEL"));
 BA.debugLineNum = 68;BA.debugLine="ButtonLevel.TextSize = 14";
Debug.ShouldStop(8);
programsec.mostCurrent._buttonlevel.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 69;BA.debugLine="ButtonLevel.SingleLine = True";
Debug.ShouldStop(16);
programsec.mostCurrent._buttonlevel.runVoidMethod ("setSingleLine",programsec.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 71;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(64);
_listviewgosterdb();
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Activity_Pause (programsec) ","programsec",46,programsec.mostCurrent.activityBA,programsec.mostCurrent,78);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.programsec.remoteMe.runUserSub(false, "programsec","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 78;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Resume (programsec) ","programsec",46,programsec.mostCurrent.activityBA,programsec.mostCurrent,74);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.programsec.remoteMe.runUserSub(false, "programsec","activity_resume");}
 BA.debugLineNum = 74;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("ButtonAnasayfa_Click (programsec) ","programsec",46,programsec.mostCurrent.activityBA,programsec.mostCurrent,100);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.programsec.remoteMe.runUserSub(false, "programsec","buttonanasayfa_click");}
 BA.debugLineNum = 100;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(16);
programsec.mostCurrent.__c.runVoidMethod ("StartActivity",programsec.processBA,(Object)((programsec.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 102;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
programsec.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonlevel_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonLevel_Click (programsec) ","programsec",46,programsec.mostCurrent.activityBA,programsec.mostCurrent,168);
if (RapidSub.canDelegate("buttonlevel_click")) { return b4a.example3.programsec.remoteMe.runUserSub(false, "programsec","buttonlevel_click");}
int _i = 0;
 BA.debugLineNum = 168;BA.debugLine="Sub ButtonLevel_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 169;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(256);
programsec.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 170;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
Debug.ShouldStop(512);
programsec.mostCurrent._rs.setObject(programsec.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM DayaniklilikTestProgram WHERE level LIKE '%"),programsec.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY program_id DESC ")))));
 BA.debugLineNum = 172;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(2048);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {programsec.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 173;BA.debugLine="rs.Position = i";
Debug.ShouldStop(4096);
programsec.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 174;BA.debugLine="VeriAl";
Debug.ShouldStop(8192);
_verial();
 BA.debugLineNum = 175;BA.debugLine="ListView1.AddTwoLines(programId,$\"Level: ${level";
Debug.ShouldStop(16384);
programsec.mostCurrent._listview1.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(programsec._programid)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Level: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec._level))),RemoteObject.createImmutable(" // Program Adı: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec.mostCurrent._programadi))),RemoteObject.createImmutable(" // Test Türü: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec.mostCurrent._testturu))),RemoteObject.createImmutable(" //// Tarih: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec.mostCurrent._tarih))),RemoteObject.createImmutable(""))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 177;BA.debugLine="rs.Close";
Debug.ShouldStop(65536);
programsec.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonprogramadi_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonProgramAdi_Click (programsec) ","programsec",46,programsec.mostCurrent.activityBA,programsec.mostCurrent,132);
if (RapidSub.canDelegate("buttonprogramadi_click")) { return b4a.example3.programsec.remoteMe.runUserSub(false, "programsec","buttonprogramadi_click");}
int _i = 0;
 BA.debugLineNum = 132;BA.debugLine="Sub ButtonProgramAdi_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(16);
programsec.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 134;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
Debug.ShouldStop(32);
programsec.mostCurrent._rs.setObject(programsec.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM DayaniklilikTestProgram WHERE program_adi LIKE '%"),programsec.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY program_id DESC ")))));
 BA.debugLineNum = 136;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(128);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {programsec.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 137;BA.debugLine="rs.Position = i";
Debug.ShouldStop(256);
programsec.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 138;BA.debugLine="VeriAl";
Debug.ShouldStop(512);
_verial();
 BA.debugLineNum = 139;BA.debugLine="ListView1.AddTwoLines(programId,$\"Program Adı: $";
Debug.ShouldStop(1024);
programsec.mostCurrent._listview1.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(programsec._programid)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Program Adı: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec.mostCurrent._programadi))),RemoteObject.createImmutable(" // Test Türü: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec.mostCurrent._testturu))),RemoteObject.createImmutable(" // Level: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec._level))),RemoteObject.createImmutable(" // Tarih: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec.mostCurrent._tarih))),RemoteObject.createImmutable(""))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 141;BA.debugLine="rs.Close";
Debug.ShouldStop(4096);
programsec.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonprogramekle_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonProgramEkle_Click (programsec) ","programsec",46,programsec.mostCurrent.activityBA,programsec.mostCurrent,127);
if (RapidSub.canDelegate("buttonprogramekle_click")) { return b4a.example3.programsec.remoteMe.runUserSub(false, "programsec","buttonprogramekle_click");}
 BA.debugLineNum = 127;BA.debugLine="Sub ButtonProgramEkle_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="StartActivity(ProgramAyar)";
Debug.ShouldStop(-2147483648);
programsec.mostCurrent.__c.runVoidMethod ("StartActivity",programsec.processBA,(Object)((programsec.mostCurrent._programayar.getObject())));
 BA.debugLineNum = 129;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1);
programsec.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttontarih_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTarih_Click (programsec) ","programsec",46,programsec.mostCurrent.activityBA,programsec.mostCurrent,156);
if (RapidSub.canDelegate("buttontarih_click")) { return b4a.example3.programsec.remoteMe.runUserSub(false, "programsec","buttontarih_click");}
int _i = 0;
 BA.debugLineNum = 156;BA.debugLine="Sub ButtonTarih_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(268435456);
programsec.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 158;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
Debug.ShouldStop(536870912);
programsec.mostCurrent._rs.setObject(programsec.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM DayaniklilikTestProgram WHERE program_tarih LIKE '%"),programsec.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY program_id DESC ")))));
 BA.debugLineNum = 160;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(-2147483648);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {programsec.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 161;BA.debugLine="rs.Position = i";
Debug.ShouldStop(1);
programsec.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 162;BA.debugLine="VeriAl";
Debug.ShouldStop(2);
_verial();
 BA.debugLineNum = 163;BA.debugLine="ListView1.AddTwoLines(programId,$\"Tarih: ${tarih";
Debug.ShouldStop(4);
programsec.mostCurrent._listview1.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(programsec._programid)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Tarih: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec.mostCurrent._tarih))),RemoteObject.createImmutable(" // Level: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec._level))),RemoteObject.createImmutable(" // Program Adı: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec.mostCurrent._programadi))),RemoteObject.createImmutable(" // Test Türü: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec.mostCurrent._testturu))),RemoteObject.createImmutable(""))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 165;BA.debugLine="rs.Close";
Debug.ShouldStop(16);
programsec.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttontestturu_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTestTuru_Click (programsec) ","programsec",46,programsec.mostCurrent.activityBA,programsec.mostCurrent,144);
if (RapidSub.canDelegate("buttontestturu_click")) { return b4a.example3.programsec.remoteMe.runUserSub(false, "programsec","buttontestturu_click");}
int _i = 0;
 BA.debugLineNum = 144;BA.debugLine="Sub ButtonTestTuru_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(65536);
programsec.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 146;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
Debug.ShouldStop(131072);
programsec.mostCurrent._rs.setObject(programsec.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM DayaniklilikTestProgram WHERE program_testTuru LIKE '%"),programsec.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY program_id DESC ")))));
 BA.debugLineNum = 148;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(524288);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {programsec.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 149;BA.debugLine="rs.Position = i";
Debug.ShouldStop(1048576);
programsec.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 150;BA.debugLine="VeriAl";
Debug.ShouldStop(2097152);
_verial();
 BA.debugLineNum = 151;BA.debugLine="ListView1.AddTwoLines(programId,$\"Level: ${level";
Debug.ShouldStop(4194304);
programsec.mostCurrent._listview1.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(programsec._programid)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Level: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec._level))),RemoteObject.createImmutable(" // Program Adı: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec.mostCurrent._programadi))),RemoteObject.createImmutable(" // Test Türü: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec.mostCurrent._testturu))),RemoteObject.createImmutable(" // Tarih: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec.mostCurrent._tarih))),RemoteObject.createImmutable(""))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 153;BA.debugLine="rs.Close";
Debug.ShouldStop(16777216);
programsec.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextara_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextAra_TextChanged (programsec) ","programsec",46,programsec.mostCurrent.activityBA,programsec.mostCurrent,105);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.programsec.remoteMe.runUserSub(false, "programsec","edittextara_textchanged", _old, _new);}
int _i = 0;
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 105;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(512);
programsec.mostCurrent._labelcarpi.runMethod(true,"setVisible",programsec.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 107;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(1024);
programsec.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 108;BA.debugLine="rs = Main.sql.ExecQuery( \"SELECT * FROM Dayanikli";
Debug.ShouldStop(2048);
programsec.mostCurrent._rs.setObject(programsec.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM DayaniklilikTestProgram WHERE program_adi LIKE '%"),programsec.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR program_testTuru LIKE '%"),programsec.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR level LIKE '%"),programsec.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR program_tarih LIKE '%"),programsec.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY program_id DESC")))));
 BA.debugLineNum = 110;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(8192);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {programsec.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 111;BA.debugLine="rs.Position = i";
Debug.ShouldStop(16384);
programsec.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 112;BA.debugLine="VeriAl";
Debug.ShouldStop(32768);
_verial();
 BA.debugLineNum = 113;BA.debugLine="ListView1.AddTwoLines(programId,$\"Program Adı: $";
Debug.ShouldStop(65536);
programsec.mostCurrent._listview1.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(programsec._programid)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Program Adı: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec.mostCurrent._programadi))),RemoteObject.createImmutable(" // Test Türü: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec.mostCurrent._testturu))),RemoteObject.createImmutable(" // Level: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec._level))),RemoteObject.createImmutable(" // Tarih: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec.mostCurrent._tarih))),RemoteObject.createImmutable(""))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 115;BA.debugLine="rs.Close";
Debug.ShouldStop(262144);
programsec.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 116;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",programsec.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 117;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(1048576);
programsec.mostCurrent._labelcarpi.runMethod(true,"setVisible",programsec.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
 //BA.debugLineNum = 16;BA.debugLine="Private ButtonAnasayfa As Button";
programsec.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private EditTextAra As EditText";
programsec.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private LabelCarpi As Label";
programsec.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonProgramEkle As Button";
programsec.mostCurrent._buttonprogramekle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ButtonProgramAdi As Button";
programsec.mostCurrent._buttonprogramadi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ButtonTestTuru As Button";
programsec.mostCurrent._buttontestturu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ButtonTarih As Button";
programsec.mostCurrent._buttontarih = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ButtonLevel As Button";
programsec.mostCurrent._buttonlevel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ListView1 As ListView";
programsec.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim rs As ResultSet";
programsec.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim programId , level As Int";
programsec._programid = RemoteObject.createImmutable(0);
programsec._level = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 29;BA.debugLine="Dim programAdi ,testTuru, tarih As String";
programsec.mostCurrent._programadi = RemoteObject.createImmutable("");
programsec.mostCurrent._testturu = RemoteObject.createImmutable("");
programsec.mostCurrent._tarih = RemoteObject.createImmutable("");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _labelcarpi_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi_Click (programsec) ","programsec",46,programsec.mostCurrent.activityBA,programsec.mostCurrent,121);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.programsec.remoteMe.runUserSub(false, "programsec","labelcarpi_click");}
 BA.debugLineNum = 121;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(33554432);
programsec.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 123;BA.debugLine="EditTextAra.Text = \"\"";
Debug.ShouldStop(67108864);
programsec.mostCurrent._edittextara.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 124;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(134217728);
_listviewgosterdb();
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listview1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView1_ItemClick (programsec) ","programsec",46,programsec.mostCurrent.activityBA,programsec.mostCurrent,180);
if (RapidSub.canDelegate("listview1_itemclick")) { return b4a.example3.programsec.remoteMe.runUserSub(false, "programsec","listview1_itemclick", _position, _value);}
int _i = 0;
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 180;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(524288);
 BA.debugLineNum = 181;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
Debug.ShouldStop(1048576);
programsec.mostCurrent._rs.setObject(programsec.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM DayaniklilikTestProgram WHERE program_id = '"),_value,RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 183;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(4194304);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {programsec.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 184;BA.debugLine="rs.Position = i";
Debug.ShouldStop(8388608);
programsec.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 185;BA.debugLine="programId = rs.GetInt(\"program_id\")";
Debug.ShouldStop(16777216);
programsec._programid = programsec.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("program_id")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 187;BA.debugLine="rs.Close";
Debug.ShouldStop(67108864);
programsec.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 189;BA.debugLine="Dim result As Int";
Debug.ShouldStop(268435456);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 190;BA.debugLine="result = Msgbox2(\"Programı seçmek istediğinizden";
Debug.ShouldStop(536870912);
_result = programsec.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Programı seçmek istediğinizden emin misiniz?:")),(Object)(BA.ObjectToCharSequence("Onay Mesajı")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Hayır")),(Object)((programsec.mostCurrent.__c.getField(false,"Null"))),programsec.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 191;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, programsec.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 192;BA.debugLine="secilenProgramId = programId";
Debug.ShouldStop(-2147483648);
programsec._secilenprogramid = programsec._programid;
 BA.debugLineNum = 193;BA.debugLine="StartActivity(DayaniklilikTestEkle)";
Debug.ShouldStop(1);
programsec.mostCurrent.__c.runVoidMethod ("StartActivity",programsec.processBA,(Object)((programsec.mostCurrent._dayanikliliktestekle.getObject())));
 }else 
{ BA.debugLineNum = 194;BA.debugLine="Else if result = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, programsec.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
 BA.debugLineNum = 195;BA.debugLine="ToastMessageShow(\"Devam etmek için program seçme";
Debug.ShouldStop(4);
programsec.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Devam etmek için program seçmelisiniz")),(Object)(programsec.mostCurrent.__c.getField(true,"True")));
 }}
;
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listviewgosterdb() throws Exception{
try {
		Debug.PushSubsStack("ListViewGosterDB (programsec) ","programsec",46,programsec.mostCurrent.activityBA,programsec.mostCurrent,90);
if (RapidSub.canDelegate("listviewgosterdb")) { return b4a.example3.programsec.remoteMe.runUserSub(false, "programsec","listviewgosterdb");}
int _i = 0;
 BA.debugLineNum = 90;BA.debugLine="Sub ListViewGosterDB";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(67108864);
programsec.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 92;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
Debug.ShouldStop(134217728);
programsec.mostCurrent._rs.setObject(programsec.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM DayaniklilikTestProgram ORDER BY program_id DESC"))));
 BA.debugLineNum = 93;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(268435456);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {programsec.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 94;BA.debugLine="rs.Position = i";
Debug.ShouldStop(536870912);
programsec.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 95;BA.debugLine="VeriAl";
Debug.ShouldStop(1073741824);
_verial();
 BA.debugLineNum = 96;BA.debugLine="ListView1.AddTwoLines(programId,$\"Program Adı: $";
Debug.ShouldStop(-2147483648);
programsec.mostCurrent._listview1.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToCharSequence(programsec._programid)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Program Adı: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec.mostCurrent._programadi))),RemoteObject.createImmutable(" // Test Türü: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec.mostCurrent._testturu))),RemoteObject.createImmutable(" // Level: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec._level))),RemoteObject.createImmutable(" // Tarih: "),programsec.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((programsec.mostCurrent._tarih))),RemoteObject.createImmutable(" "))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim secilenProgramId As Int";
programsec._secilenprogramid = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setdivider(RemoteObject _lv,RemoteObject _renk,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetDivider (programsec) ","programsec",46,programsec.mostCurrent.activityBA,programsec.mostCurrent,199);
if (RapidSub.canDelegate("setdivider")) { return b4a.example3.programsec.remoteMe.runUserSub(false, "programsec","setdivider", _lv, _renk, _height);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("lv", _lv);
Debug.locals.put("Renk", _renk);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 199;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
Debug.ShouldStop(64);
 BA.debugLineNum = 200;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(128);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 201;BA.debugLine="r.Target = lv";
Debug.ShouldStop(256);
_r.setField ("Target",(_lv.getObject()));
 BA.debugLineNum = 202;BA.debugLine="Dim CD As ColorDrawable";
Debug.ShouldStop(512);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("CD", _cd);
 BA.debugLineNum = 203;BA.debugLine="CD.Initialize(Renk, 0)";
Debug.ShouldStop(1024);
_cd.runVoidMethod ("Initialize",(Object)(_renk),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 204;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
Debug.ShouldStop(2048);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setDivider")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cd.getObject())})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("android.graphics.drawable.Drawable")})));
 BA.debugLineNum = 205;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
Debug.ShouldStop(4096);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setDividerHeight")),(Object)(BA.NumberToString(_height)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _verial() throws Exception{
try {
		Debug.PushSubsStack("VeriAl (programsec) ","programsec",46,programsec.mostCurrent.activityBA,programsec.mostCurrent,82);
if (RapidSub.canDelegate("verial")) { return b4a.example3.programsec.remoteMe.runUserSub(false, "programsec","verial");}
 BA.debugLineNum = 82;BA.debugLine="Sub VeriAl";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="programId= rs.GetInt(\"program_id\")";
Debug.ShouldStop(262144);
programsec._programid = programsec.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("program_id")));
 BA.debugLineNum = 84;BA.debugLine="programAdi = rs.GetString(\"program_adi\")";
Debug.ShouldStop(524288);
programsec.mostCurrent._programadi = programsec.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("program_adi")));
 BA.debugLineNum = 85;BA.debugLine="testTuru = rs.GetString(\"program_testTuru\")";
Debug.ShouldStop(1048576);
programsec.mostCurrent._testturu = programsec.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("program_testTuru")));
 BA.debugLineNum = 86;BA.debugLine="level = rs.GetInt(\"level\")";
Debug.ShouldStop(2097152);
programsec._level = programsec.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("level")));
 BA.debugLineNum = 87;BA.debugLine="tarih = rs.GetString(\"program_tarih\")";
Debug.ShouldStop(4194304);
programsec.mostCurrent._tarih = programsec.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("program_tarih")));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}