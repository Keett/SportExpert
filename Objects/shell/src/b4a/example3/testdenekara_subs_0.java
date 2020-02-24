package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class testdenekara_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,33);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"DenekAraTestPage\")";
Debug.ShouldStop(4);
testdenekara.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DenekAraTestPage")),testdenekara.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(8);
testdenekara.mostCurrent._labelcarpi.runMethod(true,"setVisible",testdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 40;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.Visible = False";
Debug.ShouldStop(128);
testdenekara.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setVisible",testdenekara.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 41;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextColor";
Debug.ShouldStop(256);
testdenekara.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextColor",testdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 42;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
Debug.ShouldStop(512);
testdenekara.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 43;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
Debug.ShouldStop(1024);
_setdivider(testdenekara.mostCurrent._listview1,testdenekara.mostCurrent._color._acikmavi /*RemoteObject*/ ,testdenekara.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 45;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(4096);
testdenekara.mostCurrent._edittextara.runMethod(true,"setTextColor",testdenekara.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 46;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(8192);
testdenekara.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 47;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(16384);
testdenekara.mostCurrent._edittextara.runMethod(true,"setHintColor",testdenekara.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 48;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(32768);
testdenekara.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 49;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(65536);
testdenekara.mostCurrent._edittextara.runMethod(false,"setTypeface",testdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 51;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
Debug.ShouldStop(262144);
testdenekara.mostCurrent._buttontc.runMethod(true,"setTextColor",testdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 52;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(524288);
testdenekara.mostCurrent._buttontc.runMethod(false,"setTypeface",testdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 53;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(1048576);
testdenekara.mostCurrent._buttontc.runVoidMethod ("setSingleLine",testdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 54;BA.debugLine="ButtonTc.Text = \"TC\"";
Debug.ShouldStop(2097152);
testdenekara.mostCurrent._buttontc.runMethod(true,"setText",BA.ObjectToCharSequence("TC"));
 BA.debugLineNum = 55;BA.debugLine="ButtonTc.TextSize = 14";
Debug.ShouldStop(4194304);
testdenekara.mostCurrent._buttontc.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 57;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
Debug.ShouldStop(16777216);
testdenekara.mostCurrent._buttonisim.runMethod(true,"setTextColor",testdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 58;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(33554432);
testdenekara.mostCurrent._buttonisim.runMethod(false,"setTypeface",testdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 59;BA.debugLine="ButtonIsim.SingleLine = True";
Debug.ShouldStop(67108864);
testdenekara.mostCurrent._buttonisim.runVoidMethod ("setSingleLine",testdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 60;BA.debugLine="ButtonIsim.Text =\"İSİM\"";
Debug.ShouldStop(134217728);
testdenekara.mostCurrent._buttonisim.runMethod(true,"setText",BA.ObjectToCharSequence("İSİM"));
 BA.debugLineNum = 61;BA.debugLine="ButtonIsim.TextSize = 14";
Debug.ShouldStop(268435456);
testdenekara.mostCurrent._buttonisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 63;BA.debugLine="ButtonCinsiyet.TextColor = Color.koyuMavi";
Debug.ShouldStop(1073741824);
testdenekara.mostCurrent._buttoncinsiyet.runMethod(true,"setTextColor",testdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 64;BA.debugLine="ButtonCinsiyet.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(-2147483648);
testdenekara.mostCurrent._buttoncinsiyet.runMethod(false,"setTypeface",testdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 65;BA.debugLine="ButtonCinsiyet.SingleLine = True";
Debug.ShouldStop(1);
testdenekara.mostCurrent._buttoncinsiyet.runVoidMethod ("setSingleLine",testdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 66;BA.debugLine="ButtonCinsiyet.Text = \"CİNSİYET\"";
Debug.ShouldStop(2);
testdenekara.mostCurrent._buttoncinsiyet.runMethod(true,"setText",BA.ObjectToCharSequence("CİNSİYET"));
 BA.debugLineNum = 67;BA.debugLine="ButtonCinsiyet.TextSize = 14";
Debug.ShouldStop(4);
testdenekara.mostCurrent._buttoncinsiyet.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 69;BA.debugLine="ButtonDogumTarihi.TextColor = Color.koyuMavi";
Debug.ShouldStop(16);
testdenekara.mostCurrent._buttondogumtarihi.runMethod(true,"setTextColor",testdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 70;BA.debugLine="ButtonDogumTarihi.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(32);
testdenekara.mostCurrent._buttondogumtarihi.runMethod(false,"setTypeface",testdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 71;BA.debugLine="ButtonDogumTarihi.SingleLine = True";
Debug.ShouldStop(64);
testdenekara.mostCurrent._buttondogumtarihi.runVoidMethod ("setSingleLine",testdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 72;BA.debugLine="ButtonDogumTarihi.Text = \"DOĞUM TARİHİ\"";
Debug.ShouldStop(128);
testdenekara.mostCurrent._buttondogumtarihi.runMethod(true,"setText",BA.ObjectToCharSequence("DOĞUM TARİHİ"));
 BA.debugLineNum = 73;BA.debugLine="ButtonDogumTarihi.TextSize = 14";
Debug.ShouldStop(256);
testdenekara.mostCurrent._buttondogumtarihi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 75;BA.debugLine="ButtonDogumYeri.TextColor = Color.koyuMavi";
Debug.ShouldStop(1024);
testdenekara.mostCurrent._buttondogumyeri.runMethod(true,"setTextColor",testdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 76;BA.debugLine="ButtonDogumYeri.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2048);
testdenekara.mostCurrent._buttondogumyeri.runMethod(false,"setTypeface",testdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 77;BA.debugLine="ButtonDogumYeri.SingleLine = True";
Debug.ShouldStop(4096);
testdenekara.mostCurrent._buttondogumyeri.runVoidMethod ("setSingleLine",testdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 78;BA.debugLine="ButtonDogumYeri.Text = \"DOĞUM YERİ\"";
Debug.ShouldStop(8192);
testdenekara.mostCurrent._buttondogumyeri.runMethod(true,"setText",BA.ObjectToCharSequence("DOĞUM YERİ"));
 BA.debugLineNum = 79;BA.debugLine="ButtonDogumYeri.TextSize = 14";
Debug.ShouldStop(16384);
testdenekara.mostCurrent._buttondogumyeri.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 81;BA.debugLine="ButtonBabaAdi.TextColor = Color.koyuMavi";
Debug.ShouldStop(65536);
testdenekara.mostCurrent._buttonbabaadi.runMethod(true,"setTextColor",testdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 82;BA.debugLine="ButtonBabaAdi.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(131072);
testdenekara.mostCurrent._buttonbabaadi.runMethod(false,"setTypeface",testdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 83;BA.debugLine="ButtonBabaAdi.SingleLine = True";
Debug.ShouldStop(262144);
testdenekara.mostCurrent._buttonbabaadi.runVoidMethod ("setSingleLine",testdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 84;BA.debugLine="ButtonBabaAdi.Text = \"BABA ADI\"";
Debug.ShouldStop(524288);
testdenekara.mostCurrent._buttonbabaadi.runMethod(true,"setText",BA.ObjectToCharSequence("BABA ADI"));
 BA.debugLineNum = 85;BA.debugLine="ButtonBabaAdi.TextSize = 14";
Debug.ShouldStop(1048576);
testdenekara.mostCurrent._buttonbabaadi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 87;BA.debugLine="ButtonEngelDurumu.TextColor= Color.koyuMavi";
Debug.ShouldStop(4194304);
testdenekara.mostCurrent._buttonengeldurumu.runMethod(true,"setTextColor",testdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 88;BA.debugLine="ButtonEngelDurumu.Typeface= Typeface.DEFAULT_BOLD";
Debug.ShouldStop(8388608);
testdenekara.mostCurrent._buttonengeldurumu.runMethod(false,"setTypeface",testdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 89;BA.debugLine="ButtonEngelDurumu.SingleLine= True";
Debug.ShouldStop(16777216);
testdenekara.mostCurrent._buttonengeldurumu.runVoidMethod ("setSingleLine",testdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 90;BA.debugLine="ButtonEngelDurumu.Text= \"ENGEL DURUMU\"";
Debug.ShouldStop(33554432);
testdenekara.mostCurrent._buttonengeldurumu.runMethod(true,"setText",BA.ObjectToCharSequence("ENGEL DURUMU"));
 BA.debugLineNum = 91;BA.debugLine="ButtonEngelDurumu.TextSize= 14";
Debug.ShouldStop(67108864);
testdenekara.mostCurrent._buttonengeldurumu.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 93;BA.debugLine="ButtonTakimOkul.TextColor = Color.koyuMavi";
Debug.ShouldStop(268435456);
testdenekara.mostCurrent._buttontakimokul.runMethod(true,"setTextColor",testdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 94;BA.debugLine="ButtonTakimOkul.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(536870912);
testdenekara.mostCurrent._buttontakimokul.runMethod(false,"setTypeface",testdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 95;BA.debugLine="ButtonTakimOkul.SingleLine = True";
Debug.ShouldStop(1073741824);
testdenekara.mostCurrent._buttontakimokul.runVoidMethod ("setSingleLine",testdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 96;BA.debugLine="ButtonTakimOkul.Text = \"TAKIM/OKUL\"";
Debug.ShouldStop(-2147483648);
testdenekara.mostCurrent._buttontakimokul.runMethod(true,"setText",BA.ObjectToCharSequence("TAKIM/OKUL"));
 BA.debugLineNum = 97;BA.debugLine="ButtonTakimOkul.TextSize = 14";
Debug.ShouldStop(1);
testdenekara.mostCurrent._buttontakimokul.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 99;BA.debugLine="ButtonBransSinif.TextColor = Color.koyuMavi";
Debug.ShouldStop(4);
testdenekara.mostCurrent._buttonbranssinif.runMethod(true,"setTextColor",testdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 100;BA.debugLine="ButtonBransSinif.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(8);
testdenekara.mostCurrent._buttonbranssinif.runMethod(false,"setTypeface",testdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 101;BA.debugLine="ButtonBransSinif.SingleLine = True";
Debug.ShouldStop(16);
testdenekara.mostCurrent._buttonbranssinif.runVoidMethod ("setSingleLine",testdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 102;BA.debugLine="ButtonBransSinif.Text = \"BRANŞ/SINIF\"";
Debug.ShouldStop(32);
testdenekara.mostCurrent._buttonbranssinif.runMethod(true,"setText",BA.ObjectToCharSequence("BRANŞ/SINIF"));
 BA.debugLineNum = 103;BA.debugLine="ButtonBransSinif.TextSize = 14";
Debug.ShouldStop(64);
testdenekara.mostCurrent._buttonbranssinif.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 105;BA.debugLine="ButtonMevki.TextColor = Color.koyuMavi";
Debug.ShouldStop(256);
testdenekara.mostCurrent._buttonmevki.runMethod(true,"setTextColor",testdenekara.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 106;BA.debugLine="ButtonMevki.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(512);
testdenekara.mostCurrent._buttonmevki.runMethod(false,"setTypeface",testdenekara.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 107;BA.debugLine="ButtonMevki.SingleLine = True";
Debug.ShouldStop(1024);
testdenekara.mostCurrent._buttonmevki.runVoidMethod ("setSingleLine",testdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 108;BA.debugLine="ButtonMevki.Text = \"MEVKİ\"";
Debug.ShouldStop(2048);
testdenekara.mostCurrent._buttonmevki.runMethod(true,"setText",BA.ObjectToCharSequence("MEVKİ"));
 BA.debugLineNum = 109;BA.debugLine="ButtonMevki.TextSize = 14";
Debug.ShouldStop(4096);
testdenekara.mostCurrent._buttonmevki.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 113;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(65536);
_listviewgosterdb();
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Activity_Pause (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,121);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 121;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Resume (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,117);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","activity_resume");}
 BA.debugLineNum = 117;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1048576);
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
public static RemoteObject  _buttonbabaadi_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonBabaAdi_Click (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,238);
if (RapidSub.canDelegate("buttonbabaadi_click")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","buttonbabaadi_click");}
int _i = 0;
 BA.debugLineNum = 238;BA.debugLine="Sub ButtonBabaAdi_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 239;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(16384);
testdenekara.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 240;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(32768);
testdenekara.mostCurrent._rs.setObject(testdenekara.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_babaAdi LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ")))));
 BA.debugLineNum = 242;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(131072);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {testdenekara.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 243;BA.debugLine="rs.Position = i";
Debug.ShouldStop(262144);
testdenekara.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 244;BA.debugLine="VeriAl";
Debug.ShouldStop(524288);
_verial();
 BA.debugLineNum = 245;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek, $\"T";
Debug.ShouldStop(1048576);
testdenekara.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(testdenekara._secilendenek)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denektc))),RemoteObject.createImmutable(", // Baba Adı: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denekbaba))),RemoteObject.createImmutable(""))))),(Object)((testdenekara._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 247;BA.debugLine="rs.Close";
Debug.ShouldStop(4194304);
testdenekara.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonbranssinif_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonBransSinif_Click (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,274);
if (RapidSub.canDelegate("buttonbranssinif_click")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","buttonbranssinif_click");}
int _i = 0;
 BA.debugLineNum = 274;BA.debugLine="Sub ButtonBransSinif_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 275;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(262144);
testdenekara.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 276;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(524288);
testdenekara.mostCurrent._rs.setObject(testdenekara.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_bransSinif LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ")))));
 BA.debugLineNum = 278;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(2097152);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {testdenekara.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 279;BA.debugLine="rs.Position = i";
Debug.ShouldStop(4194304);
testdenekara.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 280;BA.debugLine="VeriAl";
Debug.ShouldStop(8388608);
_verial();
 BA.debugLineNum = 281;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek, $\"T";
Debug.ShouldStop(16777216);
testdenekara.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(testdenekara._secilendenek)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denektc))),RemoteObject.createImmutable(", // Branş/Sınıf: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denekbrans))),RemoteObject.createImmutable(""))))),(Object)((testdenekara._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 283;BA.debugLine="rs.Close";
Debug.ShouldStop(67108864);
testdenekara.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttoncinsiyet_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonCinsiyet_Click (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,202);
if (RapidSub.canDelegate("buttoncinsiyet_click")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","buttoncinsiyet_click");}
int _i = 0;
 BA.debugLineNum = 202;BA.debugLine="Sub ButtonCinsiyet_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 203;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(1024);
testdenekara.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 204;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(2048);
testdenekara.mostCurrent._rs.setObject(testdenekara.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE cinsiyet_adi LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ")))));
 BA.debugLineNum = 206;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(8192);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {testdenekara.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 207;BA.debugLine="rs.Position = i";
Debug.ShouldStop(16384);
testdenekara.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 208;BA.debugLine="VeriAl";
Debug.ShouldStop(32768);
_verial();
 BA.debugLineNum = 209;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek,$\"TC";
Debug.ShouldStop(65536);
testdenekara.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(testdenekara._secilendenek)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denektc))),RemoteObject.createImmutable(", // Cinsiyet: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denekcinsiyet))),RemoteObject.createImmutable(" "))))),(Object)((testdenekara._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 211;BA.debugLine="rs.Close";
Debug.ShouldStop(262144);
testdenekara.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondogumtarihi_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDogumTarihi_Click (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,214);
if (RapidSub.canDelegate("buttondogumtarihi_click")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","buttondogumtarihi_click");}
int _i = 0;
 BA.debugLineNum = 214;BA.debugLine="Sub ButtonDogumTarihi_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 215;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(4194304);
testdenekara.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 216;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(8388608);
testdenekara.mostCurrent._rs.setObject(testdenekara.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_dogumTarihi LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ")))));
 BA.debugLineNum = 218;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(33554432);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {testdenekara.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 219;BA.debugLine="rs.Position = i";
Debug.ShouldStop(67108864);
testdenekara.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 220;BA.debugLine="VeriAl";
Debug.ShouldStop(134217728);
_verial();
 BA.debugLineNum = 221;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek,$\"TC";
Debug.ShouldStop(268435456);
testdenekara.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(testdenekara._secilendenek)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denektc))),RemoteObject.createImmutable(", // Doğum Tarihi: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denekdogumtarihi))),RemoteObject.createImmutable(" "))))),(Object)((testdenekara._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 223;BA.debugLine="rs.Close";
Debug.ShouldStop(1073741824);
testdenekara.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondogumyeri_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDogumYeri_Click (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,226);
if (RapidSub.canDelegate("buttondogumyeri_click")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","buttondogumyeri_click");}
int _i = 0;
 BA.debugLineNum = 226;BA.debugLine="Sub ButtonDogumYeri_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 227;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(4);
testdenekara.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 228;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(8);
testdenekara.mostCurrent._rs.setObject(testdenekara.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE il_adi LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ")))));
 BA.debugLineNum = 230;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(32);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {testdenekara.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 231;BA.debugLine="rs.Position = i";
Debug.ShouldStop(64);
testdenekara.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 232;BA.debugLine="VeriAl";
Debug.ShouldStop(128);
_verial();
 BA.debugLineNum = 233;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek, $\"T";
Debug.ShouldStop(256);
testdenekara.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(testdenekara._secilendenek)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denektc))),RemoteObject.createImmutable(", // Doğum Yeri: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denekil))),RemoteObject.createImmutable(""))))),(Object)((testdenekara._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 235;BA.debugLine="rs.Close";
Debug.ShouldStop(1024);
testdenekara.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonengeldurumu_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonEngelDurumu_Click (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,250);
if (RapidSub.canDelegate("buttonengeldurumu_click")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","buttonengeldurumu_click");}
int _i = 0;
 BA.debugLineNum = 250;BA.debugLine="Sub ButtonEngelDurumu_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(67108864);
testdenekara.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 252;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(134217728);
testdenekara.mostCurrent._rs.setObject(testdenekara.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_engelDurumu LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ")))));
 BA.debugLineNum = 254;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(536870912);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {testdenekara.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 255;BA.debugLine="rs.Position = i";
Debug.ShouldStop(1073741824);
testdenekara.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 256;BA.debugLine="VeriAl";
Debug.ShouldStop(-2147483648);
_verial();
 BA.debugLineNum = 257;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek, $\"T";
Debug.ShouldStop(1);
testdenekara.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(testdenekara._secilendenek)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denektc))),RemoteObject.createImmutable(", // Engel Durumu: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denekengel))),RemoteObject.createImmutable(""))))),(Object)((testdenekara._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 259;BA.debugLine="rs.Close";
Debug.ShouldStop(4);
testdenekara.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonisim_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonIsim_Click (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,190);
if (RapidSub.canDelegate("buttonisim_click")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","buttonisim_click");}
int _i = 0;
 BA.debugLineNum = 190;BA.debugLine="Sub ButtonIsim_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 191;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(1073741824);
testdenekara.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 192;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(-2147483648);
testdenekara.mostCurrent._rs.setObject(testdenekara.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_isim LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ")))));
 BA.debugLineNum = 194;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(2);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {testdenekara.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 195;BA.debugLine="rs.Position = i";
Debug.ShouldStop(4);
testdenekara.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 196;BA.debugLine="VeriAl";
Debug.ShouldStop(8);
_verial();
 BA.debugLineNum = 197;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek,$\"Ad";
Debug.ShouldStop(16);
testdenekara.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(testdenekara._secilendenek)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Ad Soyad: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denekisim))),RemoteObject.createImmutable(" // TC: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denektc))),RemoteObject.createImmutable(""))))),(Object)((testdenekara._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 199;BA.debugLine="rs.Close";
Debug.ShouldStop(64);
testdenekara.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonmevki_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonMevki_Click (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,286);
if (RapidSub.canDelegate("buttonmevki_click")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","buttonmevki_click");}
int _i = 0;
 BA.debugLineNum = 286;BA.debugLine="Sub ButtonMevki_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 287;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(1073741824);
testdenekara.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 288;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(-2147483648);
testdenekara.mostCurrent._rs.setObject(testdenekara.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_mevki LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ")))));
 BA.debugLineNum = 290;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(2);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {testdenekara.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 291;BA.debugLine="rs.Position = i";
Debug.ShouldStop(4);
testdenekara.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 292;BA.debugLine="VeriAl";
Debug.ShouldStop(8);
_verial();
 BA.debugLineNum = 293;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek, $\"T";
Debug.ShouldStop(16);
testdenekara.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(testdenekara._secilendenek)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denektc))),RemoteObject.createImmutable(", // Mevki: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denekmevki))),RemoteObject.createImmutable(""))))),(Object)((testdenekara._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 295;BA.debugLine="rs.Close";
Debug.ShouldStop(64);
testdenekara.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 296;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttontakimokul_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTakimOkul_Click (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,262);
if (RapidSub.canDelegate("buttontakimokul_click")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","buttontakimokul_click");}
int _i = 0;
 BA.debugLineNum = 262;BA.debugLine="Sub ButtonTakimOkul_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 263;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(64);
testdenekara.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 264;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(128);
testdenekara.mostCurrent._rs.setObject(testdenekara.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_takimOkul LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ")))));
 BA.debugLineNum = 266;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(512);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {testdenekara.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 267;BA.debugLine="rs.Position = i";
Debug.ShouldStop(1024);
testdenekara.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 268;BA.debugLine="VeriAl";
Debug.ShouldStop(2048);
_verial();
 BA.debugLineNum = 269;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek, $\"T";
Debug.ShouldStop(4096);
testdenekara.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(testdenekara._secilendenek)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denektc))),RemoteObject.createImmutable(", // Takım/Okul: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denektakim))),RemoteObject.createImmutable(""))))),(Object)((testdenekara._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 271;BA.debugLine="rs.Close";
Debug.ShouldStop(16384);
testdenekara.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttontc_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTc_Click (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,178);
if (RapidSub.canDelegate("buttontc_click")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","buttontc_click");}
int _i = 0;
 BA.debugLineNum = 178;BA.debugLine="Sub ButtonTc_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 179;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(262144);
testdenekara.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 180;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(524288);
testdenekara.mostCurrent._rs.setObject(testdenekara.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_tc LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ")))));
 BA.debugLineNum = 182;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(2097152);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {testdenekara.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 183;BA.debugLine="rs.Position = i";
Debug.ShouldStop(4194304);
testdenekara.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 184;BA.debugLine="VeriAl";
Debug.ShouldStop(8388608);
_verial();
 BA.debugLineNum = 185;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek,$\"TC";
Debug.ShouldStop(16777216);
testdenekara.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(testdenekara._secilendenek)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denektc))),RemoteObject.createImmutable(""))))),(Object)((testdenekara._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 187;BA.debugLine="rs.Close";
Debug.ShouldStop(67108864);
testdenekara.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("EditTextAra_TextChanged (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,161);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","edittextara_textchanged", _old, _new);}
int _i = 0;
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 161;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(2);
testdenekara.mostCurrent._labelcarpi.runMethod(true,"setVisible",testdenekara.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 163;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(4);
testdenekara.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 164;BA.debugLine="rs = Main.sql.ExecQuery( \"SELECT * FROM Denek WHE";
Debug.ShouldStop(8);
testdenekara.mostCurrent._rs.setObject(testdenekara.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_tc LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_isim LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR cinsiyet_adi LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_dogumTarihi LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR il_adi LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_babaAdi LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_engelDurumu LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_takimOkul LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_bransSinif LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_mevki LIKE '%"),testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC")))));
 BA.debugLineNum = 166;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(32);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {testdenekara.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 167;BA.debugLine="rs.Position = i";
Debug.ShouldStop(64);
testdenekara.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 168;BA.debugLine="VeriAl";
Debug.ShouldStop(128);
_verial();
 BA.debugLineNum = 169;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek,$\"TC";
Debug.ShouldStop(256);
testdenekara.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(testdenekara._secilendenek)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denektc))),RemoteObject.createImmutable(" // Ad Soyad: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denekisim))),RemoteObject.createImmutable(" // Cinsiyet: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denekcinsiyet))),RemoteObject.createImmutable(""))))),(Object)((testdenekara._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 171;BA.debugLine="rs.Close";
Debug.ShouldStop(1024);
testdenekara.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 172;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",testdenekara.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 173;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(4096);
testdenekara.mostCurrent._labelcarpi.runMethod(true,"setVisible",testdenekara.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private EditTextAra As EditText";
testdenekara.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ButtonTc As Button";
testdenekara.mostCurrent._buttontc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonIsim As Button";
testdenekara.mostCurrent._buttonisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ButtonCinsiyet As Button";
testdenekara.mostCurrent._buttoncinsiyet = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ButtonDogumTarihi As Button";
testdenekara.mostCurrent._buttondogumtarihi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ButtonDogumYeri As Button";
testdenekara.mostCurrent._buttondogumyeri = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ButtonBabaAdi As Button";
testdenekara.mostCurrent._buttonbabaadi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonEngelDurumu As Button";
testdenekara.mostCurrent._buttonengeldurumu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ButtonTakimOkul As Button";
testdenekara.mostCurrent._buttontakimokul = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ButtonBransSinif As Button";
testdenekara.mostCurrent._buttonbranssinif = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ButtonMevki As Button";
testdenekara.mostCurrent._buttonmevki = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private ListView1 As ListView";
testdenekara.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim rs As ResultSet";
testdenekara.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private LabelCarpi As Label";
testdenekara.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _labelcarpi_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi_Click (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,354);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","labelcarpi_click");}
 BA.debugLineNum = 354;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 355;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(4);
testdenekara.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 356;BA.debugLine="EditTextAra.Text =\"\"";
Debug.ShouldStop(8);
testdenekara.mostCurrent._edittextara.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 357;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(16);
_listviewgosterdb();
 BA.debugLineNum = 358;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("ListView1_ItemClick (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,299);
if (RapidSub.canDelegate("listview1_itemclick")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","listview1_itemclick", _position, _value);}
int _i = 0;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 299;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 300;BA.debugLine="Dim rs As ResultSet";
Debug.ShouldStop(2048);
testdenekara.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 BA.debugLineNum = 301;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(4096);
testdenekara.mostCurrent._rs.setObject(testdenekara.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_id = '"),_value,RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 303;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(16384);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {testdenekara.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 304;BA.debugLine="rs.Position = i";
Debug.ShouldStop(32768);
testdenekara.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 305;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 306;BA.debugLine="VeriAl";
Debug.ShouldStop(131072);
_verial();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",testdenekara.processBA, e8.toString()); BA.debugLineNum = 308;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
testdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","220381705",BA.ObjectToString(testdenekara.mostCurrent.__c.runMethod(false,"LastException",testdenekara.mostCurrent.activityBA)),0);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 311;BA.debugLine="rs.Close";
Debug.ShouldStop(4194304);
testdenekara.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 314;BA.debugLine="Log(secilenDenek)";
Debug.ShouldStop(33554432);
testdenekara.mostCurrent.__c.runVoidMethod ("LogImpl","220381711",testdenekara._secilendenek,0);
 BA.debugLineNum = 316;BA.debugLine="If TestMenu.yapilacakTest = \"Antropometrik\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",testdenekara.mostCurrent._testmenu._yapilacaktest /*RemoteObject*/ ,BA.ObjectToString("Antropometrik"))) { 
 BA.debugLineNum = 317;BA.debugLine="StartActivity(AntropometrikEkle)";
Debug.ShouldStop(268435456);
testdenekara.mostCurrent.__c.runVoidMethod ("StartActivity",testdenekara.processBA,(Object)((testdenekara.mostCurrent._antropometrikekle.getObject())));
 }else 
{ BA.debugLineNum = 318;BA.debugLine="Else If TestMenu.yapilacakTest  =\"Biyokimyasal\" T";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",testdenekara.mostCurrent._testmenu._yapilacaktest /*RemoteObject*/ ,BA.ObjectToString("Biyokimyasal"))) { 
 BA.debugLineNum = 319;BA.debugLine="StartActivity(BiyokimyasalEkle)";
Debug.ShouldStop(1073741824);
testdenekara.mostCurrent.__c.runVoidMethod ("StartActivity",testdenekara.processBA,(Object)((testdenekara.mostCurrent._biyokimyasalekle.getObject())));
 }else 
{ BA.debugLineNum = 320;BA.debugLine="Else If TestMenu.yapilacakTest = \"Psikolojik\"  Th";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",testdenekara.mostCurrent._testmenu._yapilacaktest /*RemoteObject*/ ,BA.ObjectToString("Psikolojik"))) { 
 BA.debugLineNum = 321;BA.debugLine="StartActivity(PsikolojikEkle)";
Debug.ShouldStop(1);
testdenekara.mostCurrent.__c.runVoidMethod ("StartActivity",testdenekara.processBA,(Object)((testdenekara.mostCurrent._psikolojikekle.getObject())));
 }else 
{ BA.debugLineNum = 322;BA.debugLine="Else If TestMenu.yapilacakTest = \"MotorOzellik\" T";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",testdenekara.mostCurrent._testmenu._yapilacaktest /*RemoteObject*/ ,BA.ObjectToString("MotorOzellik"))) { 
 BA.debugLineNum = 323;BA.debugLine="If MotorOzellikMenu.yapilacakMotorOzellikTest =";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",testdenekara.mostCurrent._motorozellikmenu._yapilacakmotorozelliktest /*RemoteObject*/ ,BA.ObjectToString("SuratTest"))) { 
 BA.debugLineNum = 324;BA.debugLine="StartActivity(SuratTestAyar)";
Debug.ShouldStop(8);
testdenekara.mostCurrent.__c.runVoidMethod ("StartActivity",testdenekara.processBA,(Object)((testdenekara.mostCurrent._surattestayar.getObject())));
 }else 
{ BA.debugLineNum = 325;BA.debugLine="Else if MotorOzellikMenu.yapilacakMotorOzellikTe";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",testdenekara.mostCurrent._motorozellikmenu._yapilacakmotorozelliktest /*RemoteObject*/ ,BA.ObjectToString("DayaniklilikTest"))) { 
 }else 
{ BA.debugLineNum = 328;BA.debugLine="Else if MotorOzellikMenu.yapilacakMotorOzellikTe";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",testdenekara.mostCurrent._motorozellikmenu._yapilacakmotorozelliktest /*RemoteObject*/ ,BA.ObjectToString("DikeySicramaTest"))) { 
 }else 
{ BA.debugLineNum = 329;BA.debugLine="Else If MotorOzellikMenu.yapilacakMotorOzellikTe";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",testdenekara.mostCurrent._motorozellikmenu._yapilacakmotorozelliktest /*RemoteObject*/ ,BA.ObjectToString("DengeTest"))) { 
 }else 
{ BA.debugLineNum = 330;BA.debugLine="Else if MotorOzellikMenu.yapilacakMotorOzellikTe";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",testdenekara.mostCurrent._motorozellikmenu._yapilacakmotorozelliktest /*RemoteObject*/ ,BA.ObjectToString("KuvvetTest"))) { 
 }else 
{ BA.debugLineNum = 331;BA.debugLine="Else if MotorOzellikMenu.yapilacakMotorOzellikTe";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",testdenekara.mostCurrent._motorozellikmenu._yapilacakmotorozelliktest /*RemoteObject*/ ,BA.ObjectToString("ReaksiyonTest"))) { 
 }else {
 BA.debugLineNum = 333;BA.debugLine="ToastMessageShow(\"motor özellik testleri menüsü";
Debug.ShouldStop(4096);
testdenekara.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("motor özellik testleri menüsünden seçim yapılamadı")),(Object)(testdenekara.mostCurrent.__c.getField(true,"True")));
 }}}}}}
;
 }else 
{ BA.debugLineNum = 335;BA.debugLine="Else If TestMenu.yapilacakTest = \"AntranorGorusle";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",testdenekara.mostCurrent._testmenu._yapilacaktest /*RemoteObject*/ ,BA.ObjectToString("AntranorGorusleri"))) { 
 BA.debugLineNum = 336;BA.debugLine="StartActivity(AntranorGorusEkle)";
Debug.ShouldStop(32768);
testdenekara.mostCurrent.__c.runVoidMethod ("StartActivity",testdenekara.processBA,(Object)((testdenekara.mostCurrent._antranorgorusekle.getObject())));
 }else 
{ BA.debugLineNum = 337;BA.debugLine="Else If TestMenu.yapilacakTest = \"SaglikBilgileri";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",testdenekara.mostCurrent._testmenu._yapilacaktest /*RemoteObject*/ ,BA.ObjectToString("SaglikBilgileri"))) { 
 BA.debugLineNum = 338;BA.debugLine="StartActivity(SaglikBilgileriEkle)";
Debug.ShouldStop(131072);
testdenekara.mostCurrent.__c.runVoidMethod ("StartActivity",testdenekara.processBA,(Object)((testdenekara.mostCurrent._saglikbilgileriekle.getObject())));
 }else {
 BA.debugLineNum = 340;BA.debugLine="ToastMessageShow(\"Test menüsünden seçim yapılama";
Debug.ShouldStop(524288);
testdenekara.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Test menüsünden seçim yapılamadı")),(Object)(testdenekara.mostCurrent.__c.getField(true,"True")));
 }}}}}}
;
 BA.debugLineNum = 343;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("ListViewGosterDB (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,149);
if (RapidSub.canDelegate("listviewgosterdb")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","listviewgosterdb");}
int _i = 0;
 BA.debugLineNum = 149;BA.debugLine="Sub ListViewGosterDB";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(2097152);
testdenekara.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 151;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek\")";
Debug.ShouldStop(4194304);
testdenekara.mostCurrent._rs.setObject(testdenekara.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM Denek"))));
 BA.debugLineNum = 153;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(16777216);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {testdenekara.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 154;BA.debugLine="rs.Position = i";
Debug.ShouldStop(33554432);
testdenekara.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 155;BA.debugLine="VeriAl";
Debug.ShouldStop(67108864);
_verial();
 BA.debugLineNum = 156;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek,$\"TC";
Debug.ShouldStop(134217728);
testdenekara.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(testdenekara._secilendenek)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denektc))),RemoteObject.createImmutable(" // Ad Soyad: "),testdenekara.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((testdenekara._denekisim))),RemoteObject.createImmutable(""))))),(Object)((testdenekara._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 158;BA.debugLine="rs.Close";
Debug.ShouldStop(536870912);
testdenekara.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim denekImage() As Byte";
testdenekara._denekimage = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 10;BA.debugLine="Dim secilenDenek,denekTc,denekIsim,denekCinsiyet,";
testdenekara._secilendenek = RemoteObject.createImmutable("");
testdenekara._denektc = RemoteObject.createImmutable("");
testdenekara._denekisim = RemoteObject.createImmutable("");
testdenekara._denekcinsiyet = RemoteObject.createImmutable("");
testdenekara._denekdogumtarihi = RemoteObject.createImmutable("");
testdenekara._denekil = RemoteObject.createImmutable("");
testdenekara._denekbaba = RemoteObject.createImmutable("");
testdenekara._denekengel = RemoteObject.createImmutable("");
testdenekara._denektakim = RemoteObject.createImmutable("");
testdenekara._denekbrans = RemoteObject.createImmutable("");
testdenekara._denekmevki = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim bmp As Bitmap";
testdenekara._bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setdivider(RemoteObject _lv,RemoteObject _renk,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetDivider (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,345);
if (RapidSub.canDelegate("setdivider")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","setdivider", _lv, _renk, _height);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("lv", _lv);
Debug.locals.put("Renk", _renk);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 345;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 346;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(33554432);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 347;BA.debugLine="r.Target = lv";
Debug.ShouldStop(67108864);
_r.setField ("Target",(_lv.getObject()));
 BA.debugLineNum = 348;BA.debugLine="Dim CD As ColorDrawable";
Debug.ShouldStop(134217728);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("CD", _cd);
 BA.debugLineNum = 349;BA.debugLine="CD.Initialize(Renk, 0)";
Debug.ShouldStop(268435456);
_cd.runVoidMethod ("Initialize",(Object)(_renk),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 350;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
Debug.ShouldStop(536870912);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setDivider")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cd.getObject())})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("android.graphics.drawable.Drawable")})));
 BA.debugLineNum = 351;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
Debug.ShouldStop(1073741824);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setDividerHeight")),(Object)(BA.NumberToString(_height)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 352;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("VeriAl (testdenekara) ","testdenekara",13,testdenekara.mostCurrent.activityBA,testdenekara.mostCurrent,125);
if (RapidSub.canDelegate("verial")) { return b4a.example3.testdenekara.remoteMe.runUserSub(false, "testdenekara","verial");}
RemoteObject _inputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
 BA.debugLineNum = 125;BA.debugLine="Sub VeriAl";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="secilenDenek = rs.GetString(\"denek_id\")";
Debug.ShouldStop(536870912);
testdenekara._secilendenek = testdenekara.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_id")));
 BA.debugLineNum = 127;BA.debugLine="denekTc = rs.GetString(\"denek_tc\")";
Debug.ShouldStop(1073741824);
testdenekara._denektc = testdenekara.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_tc")));
 BA.debugLineNum = 128;BA.debugLine="denekIsim = rs.GetString(\"denek_isim\")";
Debug.ShouldStop(-2147483648);
testdenekara._denekisim = testdenekara.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_isim")));
 BA.debugLineNum = 129;BA.debugLine="denekCinsiyet= rs.GetString(\"cinsiyet_adi\")";
Debug.ShouldStop(1);
testdenekara._denekcinsiyet = testdenekara.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cinsiyet_adi")));
 BA.debugLineNum = 130;BA.debugLine="denekDogumTarihi = rs.GetString(\"denek_dogumTarih";
Debug.ShouldStop(2);
testdenekara._denekdogumtarihi = testdenekara.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_dogumTarihi")));
 BA.debugLineNum = 131;BA.debugLine="denekIl = rs.GetString(\"il_adi\")";
Debug.ShouldStop(4);
testdenekara._denekil = testdenekara.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("il_adi")));
 BA.debugLineNum = 132;BA.debugLine="denekBaba = rs.GetString(\"denek_babaAdi\")";
Debug.ShouldStop(8);
testdenekara._denekbaba = testdenekara.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_babaAdi")));
 BA.debugLineNum = 133;BA.debugLine="denekEngel = rs.GetString(\"denek_engelDurumu\")";
Debug.ShouldStop(16);
testdenekara._denekengel = testdenekara.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_engelDurumu")));
 BA.debugLineNum = 134;BA.debugLine="denekTakim = rs.GetString(\"denek_takimOkul\")";
Debug.ShouldStop(32);
testdenekara._denektakim = testdenekara.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_takimOkul")));
 BA.debugLineNum = 135;BA.debugLine="denekBrans = rs.GetString(\"denek_bransSinif\")";
Debug.ShouldStop(64);
testdenekara._denekbrans = testdenekara.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_bransSinif")));
 BA.debugLineNum = 136;BA.debugLine="denekMevki = rs.GetString(\"denek_mevki\")";
Debug.ShouldStop(128);
testdenekara._denekmevki = testdenekara.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_mevki")));
 BA.debugLineNum = 137;BA.debugLine="denekImage = rs.GetBlob(\"denek_image\")";
Debug.ShouldStop(256);
testdenekara._denekimage = testdenekara.mostCurrent._rs.runMethod(false,"GetBlob",(Object)(RemoteObject.createImmutable("denek_image")));
 BA.debugLineNum = 138;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 139;BA.debugLine="Dim inputStream As InputStream";
Debug.ShouldStop(1024);
_inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 140;BA.debugLine="inputStream.InitializeFromBytesArray(denekImage,";
Debug.ShouldStop(2048);
_inputstream.runVoidMethod ("InitializeFromBytesArray",(Object)(testdenekara._denekimage),(Object)(BA.numberCast(int.class, 0)),(Object)(testdenekara._denekimage.getField(true,"length")));
 BA.debugLineNum = 141;BA.debugLine="bmp.Initialize2(inputStream)";
Debug.ShouldStop(4096);
testdenekara._bmp.runVoidMethod ("Initialize2",(Object)((_inputstream.getObject())));
 BA.debugLineNum = 142;BA.debugLine="inputStream.Close";
Debug.ShouldStop(8192);
_inputstream.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e19) {
			BA.rdebugUtils.runVoidMethod("setLastException",testdenekara.processBA, e19.toString()); BA.debugLineNum = 144;BA.debugLine="bmp = LoadBitmap(File.DirAssets, \"FotoKisi.png\")";
Debug.ShouldStop(32768);
testdenekara._bmp = testdenekara.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(testdenekara.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("FotoKisi.png")));
 };
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}