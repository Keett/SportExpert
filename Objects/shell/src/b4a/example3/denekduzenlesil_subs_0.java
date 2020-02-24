package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class denekduzenlesil_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,39);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="Activity.LoadLayout(\"DenekDuzenleSilPage\")";
Debug.ShouldStop(256);
denekduzenlesil.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DenekDuzenleSilPage")),denekduzenlesil.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(512);
denekduzenlesil.mostCurrent._labelcarpi.runMethod(true,"setVisible",denekduzenlesil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 45;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.Visible = False";
Debug.ShouldStop(4096);
denekduzenlesil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setVisible",denekduzenlesil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 46;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextColor";
Debug.ShouldStop(8192);
denekduzenlesil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextColor",denekduzenlesil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 47;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
Debug.ShouldStop(16384);
denekduzenlesil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 48;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
Debug.ShouldStop(32768);
_setdivider(denekduzenlesil.mostCurrent._listview1,denekduzenlesil.mostCurrent._color._acikmavi /*RemoteObject*/ ,denekduzenlesil.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 50;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(131072);
denekduzenlesil.mostCurrent._edittextara.runMethod(true,"setTextColor",denekduzenlesil.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 51;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(262144);
denekduzenlesil.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 52;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(524288);
denekduzenlesil.mostCurrent._edittextara.runMethod(true,"setHintColor",denekduzenlesil.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 53;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(1048576);
denekduzenlesil.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 54;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2097152);
denekduzenlesil.mostCurrent._edittextara.runMethod(false,"setTypeface",denekduzenlesil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 56;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
Debug.ShouldStop(8388608);
denekduzenlesil.mostCurrent._buttontc.runMethod(true,"setTextColor",denekduzenlesil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 57;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16777216);
denekduzenlesil.mostCurrent._buttontc.runMethod(false,"setTypeface",denekduzenlesil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 58;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(33554432);
denekduzenlesil.mostCurrent._buttontc.runVoidMethod ("setSingleLine",denekduzenlesil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 59;BA.debugLine="ButtonTc.Text = \"TC\"";
Debug.ShouldStop(67108864);
denekduzenlesil.mostCurrent._buttontc.runMethod(true,"setText",BA.ObjectToCharSequence("TC"));
 BA.debugLineNum = 60;BA.debugLine="ButtonTc.TextSize = 14";
Debug.ShouldStop(134217728);
denekduzenlesil.mostCurrent._buttontc.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 62;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
Debug.ShouldStop(536870912);
denekduzenlesil.mostCurrent._buttonisim.runMethod(true,"setTextColor",denekduzenlesil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 63;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1073741824);
denekduzenlesil.mostCurrent._buttonisim.runMethod(false,"setTypeface",denekduzenlesil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 64;BA.debugLine="ButtonIsim.SingleLine = True";
Debug.ShouldStop(-2147483648);
denekduzenlesil.mostCurrent._buttonisim.runVoidMethod ("setSingleLine",denekduzenlesil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 65;BA.debugLine="ButtonIsim.Text =\"İSİM\"";
Debug.ShouldStop(1);
denekduzenlesil.mostCurrent._buttonisim.runMethod(true,"setText",BA.ObjectToCharSequence("İSİM"));
 BA.debugLineNum = 66;BA.debugLine="ButtonIsim.TextSize = 14";
Debug.ShouldStop(2);
denekduzenlesil.mostCurrent._buttonisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 68;BA.debugLine="ButtonCinsiyet.TextColor = Color.koyuMavi";
Debug.ShouldStop(8);
denekduzenlesil.mostCurrent._buttoncinsiyet.runMethod(true,"setTextColor",denekduzenlesil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 69;BA.debugLine="ButtonCinsiyet.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16);
denekduzenlesil.mostCurrent._buttoncinsiyet.runMethod(false,"setTypeface",denekduzenlesil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 70;BA.debugLine="ButtonCinsiyet.SingleLine = True";
Debug.ShouldStop(32);
denekduzenlesil.mostCurrent._buttoncinsiyet.runVoidMethod ("setSingleLine",denekduzenlesil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 71;BA.debugLine="ButtonCinsiyet.Text = \"CİNSİYET\"";
Debug.ShouldStop(64);
denekduzenlesil.mostCurrent._buttoncinsiyet.runMethod(true,"setText",BA.ObjectToCharSequence("CİNSİYET"));
 BA.debugLineNum = 72;BA.debugLine="ButtonCinsiyet.TextSize = 14";
Debug.ShouldStop(128);
denekduzenlesil.mostCurrent._buttoncinsiyet.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 74;BA.debugLine="ButtonDogumTarihi.TextColor = Color.koyuMavi";
Debug.ShouldStop(512);
denekduzenlesil.mostCurrent._buttondogumtarihi.runMethod(true,"setTextColor",denekduzenlesil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 75;BA.debugLine="ButtonDogumTarihi.Typeface = Typeface.DEFAULT_BOL";
Debug.ShouldStop(1024);
denekduzenlesil.mostCurrent._buttondogumtarihi.runMethod(false,"setTypeface",denekduzenlesil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 76;BA.debugLine="ButtonDogumTarihi.SingleLine = True";
Debug.ShouldStop(2048);
denekduzenlesil.mostCurrent._buttondogumtarihi.runVoidMethod ("setSingleLine",denekduzenlesil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 77;BA.debugLine="ButtonDogumTarihi.Text = \"DOĞUM TARİHİ\"";
Debug.ShouldStop(4096);
denekduzenlesil.mostCurrent._buttondogumtarihi.runMethod(true,"setText",BA.ObjectToCharSequence("DOĞUM TARİHİ"));
 BA.debugLineNum = 78;BA.debugLine="ButtonDogumTarihi.TextSize = 14";
Debug.ShouldStop(8192);
denekduzenlesil.mostCurrent._buttondogumtarihi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 80;BA.debugLine="ButtonDogumYeri.TextColor = Color.koyuMavi";
Debug.ShouldStop(32768);
denekduzenlesil.mostCurrent._buttondogumyeri.runMethod(true,"setTextColor",denekduzenlesil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 81;BA.debugLine="ButtonDogumYeri.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(65536);
denekduzenlesil.mostCurrent._buttondogumyeri.runMethod(false,"setTypeface",denekduzenlesil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 82;BA.debugLine="ButtonDogumYeri.SingleLine = True";
Debug.ShouldStop(131072);
denekduzenlesil.mostCurrent._buttondogumyeri.runVoidMethod ("setSingleLine",denekduzenlesil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 83;BA.debugLine="ButtonDogumYeri.Text = \"DOĞUM YERİ\"";
Debug.ShouldStop(262144);
denekduzenlesil.mostCurrent._buttondogumyeri.runMethod(true,"setText",BA.ObjectToCharSequence("DOĞUM YERİ"));
 BA.debugLineNum = 84;BA.debugLine="ButtonDogumYeri.TextSize = 14";
Debug.ShouldStop(524288);
denekduzenlesil.mostCurrent._buttondogumyeri.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 86;BA.debugLine="ButtonBabaAdi.TextColor = Color.koyuMavi";
Debug.ShouldStop(2097152);
denekduzenlesil.mostCurrent._buttonbabaadi.runMethod(true,"setTextColor",denekduzenlesil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 87;BA.debugLine="ButtonBabaAdi.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4194304);
denekduzenlesil.mostCurrent._buttonbabaadi.runMethod(false,"setTypeface",denekduzenlesil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 88;BA.debugLine="ButtonBabaAdi.SingleLine = True";
Debug.ShouldStop(8388608);
denekduzenlesil.mostCurrent._buttonbabaadi.runVoidMethod ("setSingleLine",denekduzenlesil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 89;BA.debugLine="ButtonBabaAdi.Text = \"BABA ADI\"";
Debug.ShouldStop(16777216);
denekduzenlesil.mostCurrent._buttonbabaadi.runMethod(true,"setText",BA.ObjectToCharSequence("BABA ADI"));
 BA.debugLineNum = 90;BA.debugLine="ButtonBabaAdi.TextSize = 14";
Debug.ShouldStop(33554432);
denekduzenlesil.mostCurrent._buttonbabaadi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 92;BA.debugLine="ButtonEngelDurumu.TextColor= Color.koyuMavi";
Debug.ShouldStop(134217728);
denekduzenlesil.mostCurrent._buttonengeldurumu.runMethod(true,"setTextColor",denekduzenlesil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 93;BA.debugLine="ButtonEngelDurumu.Typeface= Typeface.DEFAULT_BOLD";
Debug.ShouldStop(268435456);
denekduzenlesil.mostCurrent._buttonengeldurumu.runMethod(false,"setTypeface",denekduzenlesil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 94;BA.debugLine="ButtonEngelDurumu.SingleLine= True";
Debug.ShouldStop(536870912);
denekduzenlesil.mostCurrent._buttonengeldurumu.runVoidMethod ("setSingleLine",denekduzenlesil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 95;BA.debugLine="ButtonEngelDurumu.Text= \"ENGEL DURUMU\"";
Debug.ShouldStop(1073741824);
denekduzenlesil.mostCurrent._buttonengeldurumu.runMethod(true,"setText",BA.ObjectToCharSequence("ENGEL DURUMU"));
 BA.debugLineNum = 96;BA.debugLine="ButtonEngelDurumu.TextSize= 14";
Debug.ShouldStop(-2147483648);
denekduzenlesil.mostCurrent._buttonengeldurumu.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 98;BA.debugLine="ButtonTakimOkul.TextColor = Color.koyuMavi";
Debug.ShouldStop(2);
denekduzenlesil.mostCurrent._buttontakimokul.runMethod(true,"setTextColor",denekduzenlesil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 99;BA.debugLine="ButtonTakimOkul.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4);
denekduzenlesil.mostCurrent._buttontakimokul.runMethod(false,"setTypeface",denekduzenlesil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 100;BA.debugLine="ButtonTakimOkul.SingleLine = True";
Debug.ShouldStop(8);
denekduzenlesil.mostCurrent._buttontakimokul.runVoidMethod ("setSingleLine",denekduzenlesil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 101;BA.debugLine="ButtonTakimOkul.Text = \"TAKIM/OKUL\"";
Debug.ShouldStop(16);
denekduzenlesil.mostCurrent._buttontakimokul.runMethod(true,"setText",BA.ObjectToCharSequence("TAKIM/OKUL"));
 BA.debugLineNum = 102;BA.debugLine="ButtonTakimOkul.TextSize = 14";
Debug.ShouldStop(32);
denekduzenlesil.mostCurrent._buttontakimokul.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 104;BA.debugLine="ButtonBransSinif.TextColor = Color.koyuMavi";
Debug.ShouldStop(128);
denekduzenlesil.mostCurrent._buttonbranssinif.runMethod(true,"setTextColor",denekduzenlesil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 105;BA.debugLine="ButtonBransSinif.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(256);
denekduzenlesil.mostCurrent._buttonbranssinif.runMethod(false,"setTypeface",denekduzenlesil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 106;BA.debugLine="ButtonBransSinif.SingleLine = True";
Debug.ShouldStop(512);
denekduzenlesil.mostCurrent._buttonbranssinif.runVoidMethod ("setSingleLine",denekduzenlesil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 107;BA.debugLine="ButtonBransSinif.Text = \"BRANŞ/SINIF\"";
Debug.ShouldStop(1024);
denekduzenlesil.mostCurrent._buttonbranssinif.runMethod(true,"setText",BA.ObjectToCharSequence("BRANŞ/SINIF"));
 BA.debugLineNum = 108;BA.debugLine="ButtonBransSinif.TextSize = 14";
Debug.ShouldStop(2048);
denekduzenlesil.mostCurrent._buttonbranssinif.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 110;BA.debugLine="ButtonMevki.TextColor = Color.koyuMavi";
Debug.ShouldStop(8192);
denekduzenlesil.mostCurrent._buttonmevki.runMethod(true,"setTextColor",denekduzenlesil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 111;BA.debugLine="ButtonMevki.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16384);
denekduzenlesil.mostCurrent._buttonmevki.runMethod(false,"setTypeface",denekduzenlesil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 112;BA.debugLine="ButtonMevki.SingleLine = True";
Debug.ShouldStop(32768);
denekduzenlesil.mostCurrent._buttonmevki.runVoidMethod ("setSingleLine",denekduzenlesil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 113;BA.debugLine="ButtonMevki.Text = \"MEVKİ\"";
Debug.ShouldStop(65536);
denekduzenlesil.mostCurrent._buttonmevki.runMethod(true,"setText",BA.ObjectToCharSequence("MEVKİ"));
 BA.debugLineNum = 114;BA.debugLine="ButtonMevki.TextSize = 14";
Debug.ShouldStop(131072);
denekduzenlesil.mostCurrent._buttonmevki.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 119;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(4194304);
_listviewgosterdb();
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Pause (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,127);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 127;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_Resume (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,123);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","activity_resume");}
 BA.debugLineNum = 123;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
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
public static RemoteObject  _buttonanasayfa_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAnasayfa_Click (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,367);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","buttonanasayfa_click");}
 BA.debugLineNum = 367;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 368;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(32768);
denekduzenlesil.mostCurrent.__c.runVoidMethod ("StartActivity",denekduzenlesil.processBA,(Object)((denekduzenlesil.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 369;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
denekduzenlesil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 370;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("ButtonBabaAdi_Click (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,244);
if (RapidSub.canDelegate("buttonbabaadi_click")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","buttonbabaadi_click");}
int _i = 0;
 BA.debugLineNum = 244;BA.debugLine="Sub ButtonBabaAdi_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 245;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(1048576);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 246;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(2097152);
denekduzenlesil.mostCurrent._rs.setObject(denekduzenlesil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_babaAdi LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC")))));
 BA.debugLineNum = 248;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(8388608);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {denekduzenlesil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 249;BA.debugLine="rs.Position = i";
Debug.ShouldStop(16777216);
denekduzenlesil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 250;BA.debugLine="VeriAl";
Debug.ShouldStop(33554432);
_verial();
 BA.debugLineNum = 251;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc}, /";
Debug.ShouldStop(67108864);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(denekduzenlesil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._tc))),RemoteObject.createImmutable(", // Baba Adı: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._baba_adi))),RemoteObject.createImmutable(" "))))),(Object)((denekduzenlesil._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 253;BA.debugLine="rs.Close";
Debug.ShouldStop(268435456);
denekduzenlesil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("ButtonBransSinif_Click (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,280);
if (RapidSub.canDelegate("buttonbranssinif_click")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","buttonbranssinif_click");}
int _i = 0;
 BA.debugLineNum = 280;BA.debugLine="Sub ButtonBransSinif_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 281;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(16777216);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 282;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(33554432);
denekduzenlesil.mostCurrent._rs.setObject(denekduzenlesil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_bransSinif LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC")))));
 BA.debugLineNum = 284;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(134217728);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {denekduzenlesil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 285;BA.debugLine="rs.Position = i";
Debug.ShouldStop(268435456);
denekduzenlesil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 286;BA.debugLine="VeriAl";
Debug.ShouldStop(536870912);
_verial();
 BA.debugLineNum = 287;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc}, /";
Debug.ShouldStop(1073741824);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(denekduzenlesil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._tc))),RemoteObject.createImmutable(", // Doğum Tarihi: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._dogum_tarihi))),RemoteObject.createImmutable(" "))))),(Object)((denekduzenlesil._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 289;BA.debugLine="rs.Close";
Debug.ShouldStop(1);
denekduzenlesil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 290;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("ButtonCinsiyet_Click (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,208);
if (RapidSub.canDelegate("buttoncinsiyet_click")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","buttoncinsiyet_click");}
int _i = 0;
 BA.debugLineNum = 208;BA.debugLine="Sub ButtonCinsiyet_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 209;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(65536);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 210;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(131072);
denekduzenlesil.mostCurrent._rs.setObject(denekduzenlesil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE cinsiyet_adi LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC ")))));
 BA.debugLineNum = 212;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(524288);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {denekduzenlesil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 213;BA.debugLine="rs.Position = i";
Debug.ShouldStop(1048576);
denekduzenlesil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 214;BA.debugLine="VeriAl";
Debug.ShouldStop(2097152);
_verial();
 BA.debugLineNum = 215;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc}, /";
Debug.ShouldStop(4194304);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(denekduzenlesil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._tc))),RemoteObject.createImmutable(", // Cinsiyet: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._cinsiyet))),RemoteObject.createImmutable(" "))))),(Object)((denekduzenlesil._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 217;BA.debugLine="rs.Close";
Debug.ShouldStop(16777216);
denekduzenlesil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondenekekle_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDenekEkle_Click (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,311);
if (RapidSub.canDelegate("buttondenekekle_click")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","buttondenekekle_click");}
 BA.debugLineNum = 311;BA.debugLine="Sub ButtonDenekEkle_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 312;BA.debugLine="StartActivity(DenekEkleGuncelle)";
Debug.ShouldStop(8388608);
denekduzenlesil.mostCurrent.__c.runVoidMethod ("StartActivity",denekduzenlesil.processBA,(Object)((denekduzenlesil.mostCurrent._denekekleguncelle.getObject())));
 BA.debugLineNum = 313;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16777216);
denekduzenlesil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 314;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondenektabloveri_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDenekTabloVeri_Click (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,306);
if (RapidSub.canDelegate("buttondenektabloveri_click")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","buttondenektabloveri_click");}
 BA.debugLineNum = 306;BA.debugLine="Sub ButtonDenekTabloVeri_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 307;BA.debugLine="StartActivity(DenekListele)";
Debug.ShouldStop(262144);
denekduzenlesil.mostCurrent.__c.runVoidMethod ("StartActivity",denekduzenlesil.processBA,(Object)((denekduzenlesil.mostCurrent._deneklistele.getObject())));
 BA.debugLineNum = 308;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
denekduzenlesil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("ButtonDogumTarihi_Click (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,220);
if (RapidSub.canDelegate("buttondogumtarihi_click")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","buttondogumtarihi_click");}
int _i = 0;
 BA.debugLineNum = 220;BA.debugLine="Sub ButtonDogumTarihi_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 221;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(268435456);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 222;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(536870912);
denekduzenlesil.mostCurrent._rs.setObject(denekduzenlesil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_dogumTarihi LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC")))));
 BA.debugLineNum = 224;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(-2147483648);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {denekduzenlesil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 225;BA.debugLine="rs.Position = i";
Debug.ShouldStop(1);
denekduzenlesil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 226;BA.debugLine="VeriAl";
Debug.ShouldStop(2);
_verial();
 BA.debugLineNum = 227;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc}, /";
Debug.ShouldStop(4);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(denekduzenlesil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._tc))),RemoteObject.createImmutable(", // Doğum Tarihi: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._dogum_tarihi))),RemoteObject.createImmutable(" "))))),(Object)((denekduzenlesil._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 229;BA.debugLine="rs.Close";
Debug.ShouldStop(16);
denekduzenlesil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("ButtonDogumYeri_Click (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,232);
if (RapidSub.canDelegate("buttondogumyeri_click")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","buttondogumyeri_click");}
int _i = 0;
 BA.debugLineNum = 232;BA.debugLine="Sub ButtonDogumYeri_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(256);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 234;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(512);
denekduzenlesil.mostCurrent._rs.setObject(denekduzenlesil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE il_adi LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC")))));
 BA.debugLineNum = 236;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(2048);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {denekduzenlesil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 237;BA.debugLine="rs.Position = i";
Debug.ShouldStop(4096);
denekduzenlesil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 238;BA.debugLine="VeriAl";
Debug.ShouldStop(8192);
_verial();
 BA.debugLineNum = 239;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc}, /";
Debug.ShouldStop(16384);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(denekduzenlesil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._tc))),RemoteObject.createImmutable(", // Doğum Yeri: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._il))),RemoteObject.createImmutable(" "))))),(Object)((denekduzenlesil._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 241;BA.debugLine="rs.Close";
Debug.ShouldStop(65536);
denekduzenlesil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("ButtonEngelDurumu_Click (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,256);
if (RapidSub.canDelegate("buttonengeldurumu_click")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","buttonengeldurumu_click");}
int _i = 0;
 BA.debugLineNum = 256;BA.debugLine="Sub ButtonEngelDurumu_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 257;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(1);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 258;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(2);
denekduzenlesil.mostCurrent._rs.setObject(denekduzenlesil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_engelDurumu LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC")))));
 BA.debugLineNum = 260;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(8);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {denekduzenlesil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 261;BA.debugLine="rs.Position = i";
Debug.ShouldStop(16);
denekduzenlesil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 262;BA.debugLine="VeriAl";
Debug.ShouldStop(32);
_verial();
 BA.debugLineNum = 263;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc}, /";
Debug.ShouldStop(64);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(denekduzenlesil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._tc))),RemoteObject.createImmutable(", // Engel Durumu: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._engel_durumu))),RemoteObject.createImmutable(" "))))),(Object)((denekduzenlesil._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 265;BA.debugLine="rs.Close";
Debug.ShouldStop(256);
denekduzenlesil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("ButtonIsim_Click (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,196);
if (RapidSub.canDelegate("buttonisim_click")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","buttonisim_click");}
int _i = 0;
 BA.debugLineNum = 196;BA.debugLine="Sub ButtonIsim_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 197;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(16);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 198;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(32);
denekduzenlesil.mostCurrent._rs.setObject(denekduzenlesil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_isim LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC")))));
 BA.debugLineNum = 200;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(128);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {denekduzenlesil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 201;BA.debugLine="rs.Position = i";
Debug.ShouldStop(256);
denekduzenlesil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 202;BA.debugLine="VeriAl";
Debug.ShouldStop(512);
_verial();
 BA.debugLineNum = 203;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(1024);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(denekduzenlesil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._isim))),RemoteObject.createImmutable(""))))),(Object)((denekduzenlesil._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 205;BA.debugLine="rs.Close";
Debug.ShouldStop(4096);
denekduzenlesil.mostCurrent._rs.runVoidMethod ("Close");
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
public static RemoteObject  _buttonmevki_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonMevki_Click (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,292);
if (RapidSub.canDelegate("buttonmevki_click")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","buttonmevki_click");}
int _i = 0;
 BA.debugLineNum = 292;BA.debugLine="Sub ButtonMevki_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 293;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(16);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 294;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(32);
denekduzenlesil.mostCurrent._rs.setObject(denekduzenlesil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_mevki LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC")))));
 BA.debugLineNum = 296;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(128);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {denekduzenlesil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 297;BA.debugLine="rs.Position = i";
Debug.ShouldStop(256);
denekduzenlesil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 298;BA.debugLine="VeriAl";
Debug.ShouldStop(512);
_verial();
 BA.debugLineNum = 299;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc}, /";
Debug.ShouldStop(1024);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(denekduzenlesil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._tc))),RemoteObject.createImmutable(", // Mevki: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._mevki))),RemoteObject.createImmutable(" "))))),(Object)((denekduzenlesil._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 301;BA.debugLine="rs.Close";
Debug.ShouldStop(4096);
denekduzenlesil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 302;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("ButtonTakimOkul_Click (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,268);
if (RapidSub.canDelegate("buttontakimokul_click")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","buttontakimokul_click");}
int _i = 0;
 BA.debugLineNum = 268;BA.debugLine="Sub ButtonTakimOkul_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 269;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(4096);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 270;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(8192);
denekduzenlesil.mostCurrent._rs.setObject(denekduzenlesil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_takimOkul LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC")))));
 BA.debugLineNum = 272;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(32768);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {denekduzenlesil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 273;BA.debugLine="rs.Position = i";
Debug.ShouldStop(65536);
denekduzenlesil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 274;BA.debugLine="VeriAl";
Debug.ShouldStop(131072);
_verial();
 BA.debugLineNum = 275;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc}, /";
Debug.ShouldStop(262144);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(denekduzenlesil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._tc))),RemoteObject.createImmutable(", // Takım/Okul: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._takim_okul))),RemoteObject.createImmutable(" "))))),(Object)((denekduzenlesil._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 277;BA.debugLine="rs.Close";
Debug.ShouldStop(1048576);
denekduzenlesil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("ButtonTc_Click (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,184);
if (RapidSub.canDelegate("buttontc_click")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","buttontc_click");}
int _i = 0;
 BA.debugLineNum = 184;BA.debugLine="Sub ButtonTc_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(16777216);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 186;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(33554432);
denekduzenlesil.mostCurrent._rs.setObject(denekduzenlesil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_tc LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC ")))));
 BA.debugLineNum = 188;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(134217728);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {denekduzenlesil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 189;BA.debugLine="rs.Position = i";
Debug.ShouldStop(268435456);
denekduzenlesil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 190;BA.debugLine="VeriAl";
Debug.ShouldStop(536870912);
_verial();
 BA.debugLineNum = 191;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc}\"$,";
Debug.ShouldStop(1073741824);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(denekduzenlesil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._tc))),RemoteObject.createImmutable(""))))),(Object)((denekduzenlesil._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 193;BA.debugLine="rs.Close";
Debug.ShouldStop(1);
denekduzenlesil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("EditTextAra_TextChanged (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,168);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","edittextara_textchanged", _old, _new);}
int _i = 0;
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 168;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(128);
 BA.debugLineNum = 169;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(256);
denekduzenlesil.mostCurrent._labelcarpi.runMethod(true,"setVisible",denekduzenlesil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 170;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(512);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 171;BA.debugLine="rs = Main.sql.ExecQuery( \"SELECT * FROM Denek WHE";
Debug.ShouldStop(1024);
denekduzenlesil.mostCurrent._rs.setObject(denekduzenlesil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_tc LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_isim LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR cinsiyet_adi LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_dogumTarihi LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR il_adi LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_babaAdi LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_engelDurumu LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_takimOkul LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_bransSinif LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_mevki LIKE '%"),denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY denek_id DESC ")))));
 BA.debugLineNum = 172;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(2048);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {denekduzenlesil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 173;BA.debugLine="rs.Position = i";
Debug.ShouldStop(4096);
denekduzenlesil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 174;BA.debugLine="VeriAl";
Debug.ShouldStop(8192);
_verial();
 BA.debugLineNum = 175;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(16384);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(denekduzenlesil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._isim))),RemoteObject.createImmutable(" // Cinsiyet: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._cinsiyet))),RemoteObject.createImmutable(""))))),(Object)((denekduzenlesil._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 177;BA.debugLine="rs.Close";
Debug.ShouldStop(65536);
denekduzenlesil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 178;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",denekduzenlesil.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 179;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(262144);
denekduzenlesil.mostCurrent._labelcarpi.runMethod(true,"setVisible",denekduzenlesil.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
 //BA.debugLineNum = 18;BA.debugLine="Private EditTextAra As EditText";
denekduzenlesil.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ListView1 As ListView";
denekduzenlesil.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ButtonTc As Button";
denekduzenlesil.mostCurrent._buttontc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ButtonIsim As Button";
denekduzenlesil.mostCurrent._buttonisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ButtonCinsiyet As Button";
denekduzenlesil.mostCurrent._buttoncinsiyet = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ButtonDogumTarihi As Button";
denekduzenlesil.mostCurrent._buttondogumtarihi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonDogumYeri As Button";
denekduzenlesil.mostCurrent._buttondogumyeri = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ButtonBabaAdi As Button";
denekduzenlesil.mostCurrent._buttonbabaadi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ButtonEngelDurumu As Button";
denekduzenlesil.mostCurrent._buttonengeldurumu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ButtonTakimOkul As Button";
denekduzenlesil.mostCurrent._buttontakimokul = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private ButtonBransSinif As Button";
denekduzenlesil.mostCurrent._buttonbranssinif = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private ButtonMevki As Button";
denekduzenlesil.mostCurrent._buttonmevki = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Dim rs As ResultSet";
denekduzenlesil.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private ButtonDenekTabloVeri As Button";
denekduzenlesil.mostCurrent._buttondenektabloveri = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private ButtonDenekEkle As Button";
denekduzenlesil.mostCurrent._buttondenekekle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private Label1 As Label";
denekduzenlesil.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private ButtonAnasayfa As Button";
denekduzenlesil.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private LabelCarpi As Label";
denekduzenlesil.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _label1_click() throws Exception{
try {
		Debug.PushSubsStack("Label1_Click (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,363);
if (RapidSub.canDelegate("label1_click")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","label1_click");}
 BA.debugLineNum = 363;BA.debugLine="Sub Label1_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 364;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(2048);
_listviewgosterdb();
 BA.debugLineNum = 365;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _labelcarpi_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi_Click (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,372);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","labelcarpi_click");}
 BA.debugLineNum = 372;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 373;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(1048576);
denekduzenlesil.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 374;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(2097152);
_listviewgosterdb();
 BA.debugLineNum = 375;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("ListView1_ItemClick (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,317);
if (RapidSub.canDelegate("listview1_itemclick")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","listview1_itemclick", _position, _value);}
int _i = 0;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 317;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 318;BA.debugLine="Main.Status= \"U\"";
Debug.ShouldStop(536870912);
denekduzenlesil.mostCurrent._main._status /*RemoteObject*/  = BA.ObjectToString("U");
 BA.debugLineNum = 319;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
Debug.ShouldStop(1073741824);
denekduzenlesil.mostCurrent._rs.setObject(denekduzenlesil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM Denek WHERE denek_id = '"),_value,RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 321;BA.debugLine="For i=0 To rs.RowCount -1";
Debug.ShouldStop(1);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {denekduzenlesil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 322;BA.debugLine="rs.Position = i";
Debug.ShouldStop(2);
denekduzenlesil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 323;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 324;BA.debugLine="VeriAl";
Debug.ShouldStop(8);
_verial();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",denekduzenlesil.processBA, e8.toString()); BA.debugLineNum = 326;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
denekduzenlesil.mostCurrent.__c.runVoidMethod ("LogImpl","230801929",BA.ObjectToString(denekduzenlesil.mostCurrent.__c.runMethod(false,"LastException",denekduzenlesil.mostCurrent.activityBA)),0);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 329;BA.debugLine="rs.Close";
Debug.ShouldStop(256);
denekduzenlesil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 330;BA.debugLine="StartActivity(DenekEkleGuncelle)";
Debug.ShouldStop(512);
denekduzenlesil.mostCurrent.__c.runVoidMethod ("StartActivity",denekduzenlesil.processBA,(Object)((denekduzenlesil.mostCurrent._denekekleguncelle.getObject())));
 BA.debugLineNum = 331;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1024);
denekduzenlesil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 332;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listview1_itemlongclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView1_ItemLongClick (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,335);
if (RapidSub.canDelegate("listview1_itemlongclick")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","listview1_itemlongclick", _position, _value);}
int _i = 0;
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 335;BA.debugLine="Sub ListView1_ItemLongClick (Position As Int, Valu";
Debug.ShouldStop(16384);
 BA.debugLineNum = 336;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT denek_id FROM Den";
Debug.ShouldStop(32768);
denekduzenlesil.mostCurrent._rs.setObject(denekduzenlesil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_id FROM Denek WHERE denek_id = '"),_value,RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 338;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(131072);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {denekduzenlesil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 339;BA.debugLine="rs.Position = i";
Debug.ShouldStop(262144);
denekduzenlesil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 340;BA.debugLine="id=rs.GetString(\"denek_id\")";
Debug.ShouldStop(524288);
denekduzenlesil._id = denekduzenlesil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_id")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 342;BA.debugLine="rs.Close";
Debug.ShouldStop(2097152);
denekduzenlesil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 344;BA.debugLine="Dim result As Int";
Debug.ShouldStop(8388608);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 345;BA.debugLine="result = Msgbox2(\"Kişiyi silme istediğinizden emi";
Debug.ShouldStop(16777216);
_result = denekduzenlesil.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Kişiyi silme istediğinizden emin misiniz?:")),(Object)(BA.ObjectToCharSequence("Onay Mesajı")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Hayır")),(Object)((denekduzenlesil.mostCurrent.__c.getField(false,"Null"))),denekduzenlesil.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 346;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, denekduzenlesil.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 347;BA.debugLine="Main.sql.ExecNonQuery(\"DELETE FROM Denek WHERE d";
Debug.ShouldStop(67108864);
denekduzenlesil.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM Denek WHERE denek_id = '"),denekduzenlesil._id,RemoteObject.createImmutable("' "))));
 BA.debugLineNum = 348;BA.debugLine="ToastMessageShow(\"Denek silindi...\",False)";
Debug.ShouldStop(134217728);
denekduzenlesil.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Denek silindi...")),(Object)(denekduzenlesil.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 351;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(1073741824);
_listviewgosterdb();
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
public static RemoteObject  _listviewgosterdb() throws Exception{
try {
		Debug.PushSubsStack("ListViewGosterDB (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,156);
if (RapidSub.canDelegate("listviewgosterdb")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","listviewgosterdb");}
int _i = 0;
 BA.debugLineNum = 156;BA.debugLine="Sub ListViewGosterDB";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(268435456);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 158;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek ORDE";
Debug.ShouldStop(536870912);
denekduzenlesil.mostCurrent._rs.setObject(denekduzenlesil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM Denek ORDER BY denek_id DESC"))));
 BA.debugLineNum = 160;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(-2147483648);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {denekduzenlesil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 161;BA.debugLine="rs.Position = i";
Debug.ShouldStop(1);
denekduzenlesil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 162;BA.debugLine="VeriAl";
Debug.ShouldStop(2);
_verial();
 BA.debugLineNum = 163;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(4);
denekduzenlesil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(denekduzenlesil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._isim))),RemoteObject.createImmutable(" // Cinsiyet: "),denekduzenlesil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((denekduzenlesil._cinsiyet))),RemoteObject.createImmutable(""))))),(Object)((denekduzenlesil._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 165;BA.debugLine="rs.Close";
Debug.ShouldStop(16);
denekduzenlesil.mostCurrent._rs.runVoidMethod ("Close");
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim id,tc,isim,cinsiyet,dogum_tarihi,il,baba_adi,";
denekduzenlesil._id = RemoteObject.createImmutable("");
denekduzenlesil._tc = RemoteObject.createImmutable("");
denekduzenlesil._isim = RemoteObject.createImmutable("");
denekduzenlesil._cinsiyet = RemoteObject.createImmutable("");
denekduzenlesil._dogum_tarihi = RemoteObject.createImmutable("");
denekduzenlesil._il = RemoteObject.createImmutable("");
denekduzenlesil._baba_adi = RemoteObject.createImmutable("");
denekduzenlesil._engel_durumu = RemoteObject.createImmutable("");
denekduzenlesil._takim_okul = RemoteObject.createImmutable("");
denekduzenlesil._brans_sinif = RemoteObject.createImmutable("");
denekduzenlesil._mevki = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Dim resim() As Byte";
denekduzenlesil._resim = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 11;BA.debugLine="Dim bmp As Bitmap";
denekduzenlesil._bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setdivider(RemoteObject _lv,RemoteObject _renk,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetDivider (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,354);
if (RapidSub.canDelegate("setdivider")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","setdivider", _lv, _renk, _height);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("lv", _lv);
Debug.locals.put("Renk", _renk);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 354;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
Debug.ShouldStop(2);
 BA.debugLineNum = 355;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(4);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 356;BA.debugLine="r.Target = lv";
Debug.ShouldStop(8);
_r.setField ("Target",(_lv.getObject()));
 BA.debugLineNum = 357;BA.debugLine="Dim CD As ColorDrawable";
Debug.ShouldStop(16);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("CD", _cd);
 BA.debugLineNum = 358;BA.debugLine="CD.Initialize(Renk, 0)";
Debug.ShouldStop(32);
_cd.runVoidMethod ("Initialize",(Object)(_renk),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 359;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
Debug.ShouldStop(64);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setDivider")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cd.getObject())})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("android.graphics.drawable.Drawable")})));
 BA.debugLineNum = 360;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
Debug.ShouldStop(128);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setDividerHeight")),(Object)(BA.NumberToString(_height)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 361;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("VeriAl (denekduzenlesil) ","denekduzenlesil",22,denekduzenlesil.mostCurrent.activityBA,denekduzenlesil.mostCurrent,131);
if (RapidSub.canDelegate("verial")) { return b4a.example3.denekduzenlesil.remoteMe.runUserSub(false, "denekduzenlesil","verial");}
RemoteObject _inputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
 BA.debugLineNum = 131;BA.debugLine="Public Sub VeriAl";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="id = rs.GetString(\"denek_id\")";
Debug.ShouldStop(8);
denekduzenlesil._id = denekduzenlesil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_id")));
 BA.debugLineNum = 133;BA.debugLine="tc = rs.GetString(\"denek_tc\")";
Debug.ShouldStop(16);
denekduzenlesil._tc = denekduzenlesil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_tc")));
 BA.debugLineNum = 134;BA.debugLine="isim = rs.GetString(\"denek_isim\")";
Debug.ShouldStop(32);
denekduzenlesil._isim = denekduzenlesil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_isim")));
 BA.debugLineNum = 135;BA.debugLine="cinsiyet= rs.GetString(\"cinsiyet_adi\")";
Debug.ShouldStop(64);
denekduzenlesil._cinsiyet = denekduzenlesil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cinsiyet_adi")));
 BA.debugLineNum = 136;BA.debugLine="dogum_tarihi = rs.GetString(\"denek_dogumTarihi\")";
Debug.ShouldStop(128);
denekduzenlesil._dogum_tarihi = denekduzenlesil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_dogumTarihi")));
 BA.debugLineNum = 137;BA.debugLine="il = rs.GetString(\"il_adi\")";
Debug.ShouldStop(256);
denekduzenlesil._il = denekduzenlesil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("il_adi")));
 BA.debugLineNum = 138;BA.debugLine="baba_adi = rs.GetString(\"denek_babaAdi\")";
Debug.ShouldStop(512);
denekduzenlesil._baba_adi = denekduzenlesil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_babaAdi")));
 BA.debugLineNum = 139;BA.debugLine="engel_durumu = rs.GetString(\"denek_engelDurumu\")";
Debug.ShouldStop(1024);
denekduzenlesil._engel_durumu = denekduzenlesil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_engelDurumu")));
 BA.debugLineNum = 140;BA.debugLine="takim_okul = rs.GetString(\"denek_takimOkul\")";
Debug.ShouldStop(2048);
denekduzenlesil._takim_okul = denekduzenlesil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_takimOkul")));
 BA.debugLineNum = 141;BA.debugLine="brans_sinif = rs.GetString(\"denek_bransSinif\")";
Debug.ShouldStop(4096);
denekduzenlesil._brans_sinif = denekduzenlesil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_bransSinif")));
 BA.debugLineNum = 142;BA.debugLine="mevki = rs.GetString(\"denek_mevki\")";
Debug.ShouldStop(8192);
denekduzenlesil._mevki = denekduzenlesil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_mevki")));
 BA.debugLineNum = 143;BA.debugLine="resim = rs.GetBlob(\"denek_image\")";
Debug.ShouldStop(16384);
denekduzenlesil._resim = denekduzenlesil.mostCurrent._rs.runMethod(false,"GetBlob",(Object)(RemoteObject.createImmutable("denek_image")));
 BA.debugLineNum = 144;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 145;BA.debugLine="Dim inputStream As InputStream";
Debug.ShouldStop(65536);
_inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 146;BA.debugLine="inputStream.InitializeFromBytesArray(resim, 0, r";
Debug.ShouldStop(131072);
_inputstream.runVoidMethod ("InitializeFromBytesArray",(Object)(denekduzenlesil._resim),(Object)(BA.numberCast(int.class, 0)),(Object)(denekduzenlesil._resim.getField(true,"length")));
 BA.debugLineNum = 147;BA.debugLine="bmp.Initialize2(inputStream)";
Debug.ShouldStop(262144);
denekduzenlesil._bmp.runVoidMethod ("Initialize2",(Object)((_inputstream.getObject())));
 BA.debugLineNum = 148;BA.debugLine="inputStream.Close";
Debug.ShouldStop(524288);
_inputstream.runVoidMethod ("Close");
 BA.debugLineNum = 149;BA.debugLine="Log(\"try\")";
Debug.ShouldStop(1048576);
denekduzenlesil.mostCurrent.__c.runVoidMethod ("LogImpl","229818898",RemoteObject.createImmutable("try"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",denekduzenlesil.processBA, e20.toString()); BA.debugLineNum = 151;BA.debugLine="bmp = LoadBitmap(File.DirAssets, \"FotoKisi.png\")";
Debug.ShouldStop(4194304);
denekduzenlesil._bmp = denekduzenlesil.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(denekduzenlesil.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("FotoKisi.png")));
 BA.debugLineNum = 152;BA.debugLine="Log(\"catch\")";
Debug.ShouldStop(8388608);
denekduzenlesil.mostCurrent.__c.runVoidMethod ("LogImpl","229818901",RemoteObject.createImmutable("catch"),0);
 };
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
}