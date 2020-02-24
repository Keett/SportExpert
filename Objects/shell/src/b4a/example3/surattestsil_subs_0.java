package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class surattestsil_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,39);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="Activity.LoadLayout(\"SuratTestSilPage\")";
Debug.ShouldStop(256);
surattestsil.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SuratTestSilPage")),surattestsil.mostCurrent.activityBA);
 BA.debugLineNum = 44;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.Visible = False";
Debug.ShouldStop(2048);
surattestsil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setVisible",surattestsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 45;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextColor";
Debug.ShouldStop(4096);
surattestsil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextColor",surattestsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 46;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
Debug.ShouldStop(8192);
surattestsil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 47;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
Debug.ShouldStop(16384);
_setdivider(surattestsil.mostCurrent._listview1,surattestsil.mostCurrent._color._acikmavi /*RemoteObject*/ ,surattestsil.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 49;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(65536);
surattestsil.mostCurrent._edittextara.runMethod(true,"setTextColor",surattestsil.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 50;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(131072);
surattestsil.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 51;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(262144);
surattestsil.mostCurrent._edittextara.runMethod(true,"setHintColor",surattestsil.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 52;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(524288);
surattestsil.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 53;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1048576);
surattestsil.mostCurrent._edittextara.runMethod(false,"setTypeface",surattestsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 55;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(4194304);
surattestsil.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",surattestsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 56;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(8388608);
surattestsil.mostCurrent._webview1.runMethod(true,"setZoomEnabled",surattestsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 58;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
Debug.ShouldStop(33554432);
surattestsil.mostCurrent._buttontc.runMethod(true,"setTextColor",surattestsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 59;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(67108864);
surattestsil.mostCurrent._buttontc.runMethod(false,"setTypeface",surattestsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 60;BA.debugLine="ButtonTc.Text = \"TC\"";
Debug.ShouldStop(134217728);
surattestsil.mostCurrent._buttontc.runMethod(true,"setText",BA.ObjectToCharSequence("TC"));
 BA.debugLineNum = 61;BA.debugLine="ButtonTc.TextSize = 14";
Debug.ShouldStop(268435456);
surattestsil.mostCurrent._buttontc.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 62;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(536870912);
surattestsil.mostCurrent._buttontc.runVoidMethod ("setSingleLine",surattestsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 64;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
Debug.ShouldStop(-2147483648);
surattestsil.mostCurrent._buttonisim.runMethod(true,"setTextColor",surattestsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 65;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1);
surattestsil.mostCurrent._buttonisim.runMethod(false,"setTypeface",surattestsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 66;BA.debugLine="ButtonIsim.Text = \"İSİM\"";
Debug.ShouldStop(2);
surattestsil.mostCurrent._buttonisim.runMethod(true,"setText",BA.ObjectToCharSequence("İSİM"));
 BA.debugLineNum = 67;BA.debugLine="ButtonIsim.TextSize = 14";
Debug.ShouldStop(4);
surattestsil.mostCurrent._buttonisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 68;BA.debugLine="ButtonIsim.SingleLine = True";
Debug.ShouldStop(8);
surattestsil.mostCurrent._buttonisim.runVoidMethod ("setSingleLine",surattestsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 70;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
Debug.ShouldStop(32);
surattestsil.mostCurrent._buttontarih.runMethod(true,"setTextColor",surattestsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 71;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(64);
surattestsil.mostCurrent._buttontarih.runMethod(false,"setTypeface",surattestsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 72;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
Debug.ShouldStop(128);
surattestsil.mostCurrent._buttontarih.runMethod(true,"setText",BA.ObjectToCharSequence("TARİH"));
 BA.debugLineNum = 73;BA.debugLine="ButtonTarih.TextSize = 14";
Debug.ShouldStop(256);
surattestsil.mostCurrent._buttontarih.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 74;BA.debugLine="ButtonTarih.SingleLine = True";
Debug.ShouldStop(512);
surattestsil.mostCurrent._buttontarih.runVoidMethod ("setSingleLine",surattestsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 76;BA.debugLine="ButtonMod.TextColor = Color.koyuMavi";
Debug.ShouldStop(2048);
surattestsil.mostCurrent._buttonmod.runMethod(true,"setTextColor",surattestsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 77;BA.debugLine="ButtonMod.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4096);
surattestsil.mostCurrent._buttonmod.runMethod(false,"setTypeface",surattestsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 78;BA.debugLine="ButtonMod.Text = \"MOD\"";
Debug.ShouldStop(8192);
surattestsil.mostCurrent._buttonmod.runMethod(true,"setText",BA.ObjectToCharSequence("MOD"));
 BA.debugLineNum = 79;BA.debugLine="ButtonMod.TextSize = 14";
Debug.ShouldStop(16384);
surattestsil.mostCurrent._buttonmod.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 80;BA.debugLine="ButtonMod.SingleLine = True";
Debug.ShouldStop(32768);
surattestsil.mostCurrent._buttonmod.runVoidMethod ("setSingleLine",surattestsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 82;BA.debugLine="ButtonGateSayisi.TextColor = Color.koyuMavi";
Debug.ShouldStop(131072);
surattestsil.mostCurrent._buttongatesayisi.runMethod(true,"setTextColor",surattestsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 83;BA.debugLine="ButtonGateSayisi.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(262144);
surattestsil.mostCurrent._buttongatesayisi.runMethod(false,"setTypeface",surattestsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 84;BA.debugLine="ButtonGateSayisi.Text = \"GATE SAYISI\"";
Debug.ShouldStop(524288);
surattestsil.mostCurrent._buttongatesayisi.runMethod(true,"setText",BA.ObjectToCharSequence("GATE SAYISI"));
 BA.debugLineNum = 85;BA.debugLine="ButtonGateSayisi.TextSize = 14";
Debug.ShouldStop(1048576);
surattestsil.mostCurrent._buttongatesayisi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 86;BA.debugLine="ButtonGateSayisi.SingleLine = True";
Debug.ShouldStop(2097152);
surattestsil.mostCurrent._buttongatesayisi.runVoidMethod ("setSingleLine",surattestsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 88;BA.debugLine="ButtonSetSayisi.TextColor = Color.koyuMavi";
Debug.ShouldStop(8388608);
surattestsil.mostCurrent._buttonsetsayisi.runMethod(true,"setTextColor",surattestsil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 89;BA.debugLine="ButtonSetSayisi.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16777216);
surattestsil.mostCurrent._buttonsetsayisi.runMethod(false,"setTypeface",surattestsil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 90;BA.debugLine="ButtonSetSayisi.Text = \"SET SAYISI\"";
Debug.ShouldStop(33554432);
surattestsil.mostCurrent._buttonsetsayisi.runMethod(true,"setText",BA.ObjectToCharSequence("SET SAYISI"));
 BA.debugLineNum = 91;BA.debugLine="ButtonSetSayisi.TextSize = 14";
Debug.ShouldStop(67108864);
surattestsil.mostCurrent._buttonsetsayisi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 92;BA.debugLine="ButtonSetSayisi.SingleLine = True";
Debug.ShouldStop(134217728);
surattestsil.mostCurrent._buttonsetsayisi.runVoidMethod ("setSingleLine",surattestsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 95;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(1073741824);
_listviewgosterdb();
 BA.debugLineNum = 96;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,102);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 102;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 104;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Resume (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,98);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","activity_resume");}
 BA.debugLineNum = 98;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 100;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ButtonAnasayfa_Click (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,127);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","buttonanasayfa_click");}
 BA.debugLineNum = 127;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(-2147483648);
surattestsil.mostCurrent.__c.runVoidMethod ("StartActivity",surattestsil.processBA,(Object)((surattestsil.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 129;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1);
surattestsil.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buttongatesayisi_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonGateSayisi_Click (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,204);
if (RapidSub.canDelegate("buttongatesayisi_click")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","buttongatesayisi_click");}
int _i = 0;
 BA.debugLineNum = 204;BA.debugLine="Sub ButtonGateSayisi_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 205;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(4096);
surattestsil.mostCurrent._webview1.runMethod(true,"setVisible",surattestsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 206;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(8192);
surattestsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 207;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SuratTest,";
Debug.ShouldStop(16384);
surattestsil.mostCurrent._rs.setObject(surattestsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND gateSayisi LIKE '%"),surattestsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY surat_id DESC")))));
 BA.debugLineNum = 209;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(65536);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {surattestsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 210;BA.debugLine="rs.Position = i";
Debug.ShouldStop(131072);
surattestsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 211;BA.debugLine="VeriAl";
Debug.ShouldStop(262144);
_verial();
 BA.debugLineNum = 212;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(524288);
surattestsil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(surattestsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._saat))),RemoteObject.createImmutable(" // Gate Sayısı: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil._gate_sayisi))),RemoteObject.createImmutable(""))))),(Object)((surattestsil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 214;BA.debugLine="rs.Close";
Debug.ShouldStop(2097152);
surattestsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("ButtonIsim_Click (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,174);
if (RapidSub.canDelegate("buttonisim_click")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","buttonisim_click");}
int _i = 0;
 BA.debugLineNum = 174;BA.debugLine="Sub ButtonIsim_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 175;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(16384);
surattestsil.mostCurrent._webview1.runMethod(true,"setVisible",surattestsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 176;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(32768);
surattestsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 177;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SuratTest,";
Debug.ShouldStop(65536);
surattestsil.mostCurrent._rs.setObject(surattestsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND denek_isim LIKE '%"),surattestsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY surat_id DESC")))));
 BA.debugLineNum = 179;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(262144);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {surattestsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 180;BA.debugLine="rs.Position = i";
Debug.ShouldStop(524288);
surattestsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 181;BA.debugLine="VeriAl";
Debug.ShouldStop(1048576);
_verial();
 BA.debugLineNum = 182;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(2097152);
surattestsil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(surattestsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._saat))),RemoteObject.createImmutable(""))))),(Object)((surattestsil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 184;BA.debugLine="rs.Close";
Debug.ShouldStop(8388608);
surattestsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonmod_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonMod_Click (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,187);
if (RapidSub.canDelegate("buttonmod_click")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","buttonmod_click");}
int _i = 0;
 BA.debugLineNum = 187;BA.debugLine="Sub ButtonMod_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 188;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(134217728);
surattestsil.mostCurrent._webview1.runMethod(true,"setVisible",surattestsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 189;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(268435456);
surattestsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 190;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SuratTest,";
Debug.ShouldStop(536870912);
surattestsil.mostCurrent._rs.setObject(surattestsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND mod LIKE '%"),surattestsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY surat_id DESC")))));
 BA.debugLineNum = 192;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(-2147483648);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {surattestsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 193;BA.debugLine="rs.Position = i";
Debug.ShouldStop(1);
surattestsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 194;BA.debugLine="VeriAl";
Debug.ShouldStop(2);
_verial();
 BA.debugLineNum = 195;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(4);
surattestsil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(surattestsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._saat))),RemoteObject.createImmutable(" // Mod: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._moddeger))),RemoteObject.createImmutable(""))))),(Object)((surattestsil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 197;BA.debugLine="rs.Close";
Debug.ShouldStop(16);
surattestsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonsetsayisi_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSetSayisi_Click (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,217);
if (RapidSub.canDelegate("buttonsetsayisi_click")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","buttonsetsayisi_click");}
int _i = 0;
 BA.debugLineNum = 217;BA.debugLine="Sub ButtonSetSayisi_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 218;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(33554432);
surattestsil.mostCurrent._webview1.runMethod(true,"setVisible",surattestsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 219;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(67108864);
surattestsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 220;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SuratTest,";
Debug.ShouldStop(134217728);
surattestsil.mostCurrent._rs.setObject(surattestsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND setSayisi LIKE '%"),surattestsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY surat_id DESC")))));
 BA.debugLineNum = 222;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(536870912);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {surattestsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 223;BA.debugLine="rs.Position = i";
Debug.ShouldStop(1073741824);
surattestsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 224;BA.debugLine="VeriAl";
Debug.ShouldStop(-2147483648);
_verial();
 BA.debugLineNum = 225;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(1);
surattestsil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(surattestsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._saat))),RemoteObject.createImmutable(" // Set sayısı: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil._set_sayisi))),RemoteObject.createImmutable(""))))),(Object)((surattestsil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 227;BA.debugLine="rs.Close";
Debug.ShouldStop(4);
surattestsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonsurattestekle_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSuratTestEkle_Click (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,237);
if (RapidSub.canDelegate("buttonsurattestekle_click")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","buttonsurattestekle_click");}
 BA.debugLineNum = 237;BA.debugLine="Sub ButtonSuratTestEkle_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 238;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(8192);
surattestsil.mostCurrent._webview1.runMethod(true,"setVisible",surattestsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 239;BA.debugLine="StartActivity(TestDenekAra)";
Debug.ShouldStop(16384);
surattestsil.mostCurrent.__c.runVoidMethod ("StartActivity",surattestsil.processBA,(Object)((surattestsil.mostCurrent._testdenekara.getObject())));
 BA.debugLineNum = 240;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
surattestsil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttontablodagoster_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTablodaGoster_Click (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,243);
if (RapidSub.canDelegate("buttontablodagoster_click")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","buttontablodagoster_click");}
 BA.debugLineNum = 243;BA.debugLine="Sub ButtonTablodaGoster_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 244;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(524288);
surattestsil.mostCurrent._webview1.runMethod(true,"setVisible",surattestsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 245;BA.debugLine="StartActivity(SuratTestListele)";
Debug.ShouldStop(1048576);
surattestsil.mostCurrent.__c.runVoidMethod ("StartActivity",surattestsil.processBA,(Object)((surattestsil.mostCurrent._surattestlistele.getObject())));
 BA.debugLineNum = 246;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2097152);
surattestsil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 247;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("ButtonTarih_Click (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,200);
if (RapidSub.canDelegate("buttontarih_click")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","buttontarih_click");}
 BA.debugLineNum = 200;BA.debugLine="Sub ButtonTarih_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="ButtonTc_Click";
Debug.ShouldStop(256);
_buttontc_click();
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("ButtonTc_Click (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,161);
if (RapidSub.canDelegate("buttontc_click")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","buttontc_click");}
int _i = 0;
 BA.debugLineNum = 161;BA.debugLine="Sub ButtonTc_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(2);
surattestsil.mostCurrent._webview1.runMethod(true,"setVisible",surattestsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 163;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(4);
surattestsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 164;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SuratTest,";
Debug.ShouldStop(8);
surattestsil.mostCurrent._rs.setObject(surattestsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND denek_Tc LIKE '%"),surattestsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY surat_id DESC")))));
 BA.debugLineNum = 166;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(32);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {surattestsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 167;BA.debugLine="rs.Position = i";
Debug.ShouldStop(64);
surattestsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 168;BA.debugLine="VeriAl";
Debug.ShouldStop(128);
_verial();
 BA.debugLineNum = 169;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(256);
surattestsil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(surattestsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._saat))),RemoteObject.createImmutable(""))))),(Object)((surattestsil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 171;BA.debugLine="rs.Close";
Debug.ShouldStop(1024);
surattestsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("EditTextAra_TextChanged (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,143);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","edittextara_textchanged", _old, _new);}
int _i = 0;
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 143;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(32768);
surattestsil.mostCurrent._webview1.runMethod(true,"setVisible",surattestsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 145;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(65536);
surattestsil.mostCurrent._labelcarpi.runMethod(true,"setVisible",surattestsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 146;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(131072);
surattestsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 147;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SuratTest,";
Debug.ShouldStop(262144);
surattestsil.mostCurrent._rs.setObject(surattestsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND (denek_tc LIKE '%"),surattestsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_isim LIKE '%"),surattestsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR mod LIKE '%"),surattestsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR surat_tarih LIKE '%"),surattestsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR gateSayisi LIKE '%"),surattestsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR setSayisi LIKE '%"),surattestsil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%') ORDER BY surat_id DESC")))));
 BA.debugLineNum = 149;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(1048576);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {surattestsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 150;BA.debugLine="rs.Position = i";
Debug.ShouldStop(2097152);
surattestsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 151;BA.debugLine="VeriAl";
Debug.ShouldStop(4194304);
_verial();
 BA.debugLineNum = 152;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(8388608);
surattestsil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(surattestsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._saat))),RemoteObject.createImmutable(" // Mod: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._moddeger))),RemoteObject.createImmutable(" // Gate Sayısı: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil._gate_sayisi))),RemoteObject.createImmutable(" // Set Sayısı: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil._set_sayisi))),RemoteObject.createImmutable(""))))),(Object)((surattestsil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 154;BA.debugLine="rs.Close";
Debug.ShouldStop(33554432);
surattestsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 155;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",surattestsil.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 156;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(134217728);
surattestsil.mostCurrent._labelcarpi.runMethod(true,"setVisible",surattestsil.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
 //BA.debugLineNum = 15;BA.debugLine="Dim rs As ResultSet";
surattestsil.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Dim tc,tarih,isim,saat,modDeger As String";
surattestsil.mostCurrent._tc = RemoteObject.createImmutable("");
surattestsil.mostCurrent._tarih = RemoteObject.createImmutable("");
surattestsil.mostCurrent._isim = RemoteObject.createImmutable("");
surattestsil.mostCurrent._saat = RemoteObject.createImmutable("");
surattestsil.mostCurrent._moddeger = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Dim id, gate_sayisi, set_sayisi As Int";
surattestsil._id = RemoteObject.createImmutable(0);
surattestsil._gate_sayisi = RemoteObject.createImmutable(0);
surattestsil._set_sayisi = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 18;BA.debugLine="Dim resim() As Byte";
surattestsil._resim = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 19;BA.debugLine="Dim bmp As Bitmap";
surattestsil.mostCurrent._bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ButtonAnasayfa As Button";
surattestsil.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private LabelCarpi As Label";
surattestsil.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ButtonSuratTestEkle As Button";
surattestsil.mostCurrent._buttonsurattestekle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonTablodaGoster As Button";
surattestsil.mostCurrent._buttontablodagoster = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ListView1 As ListView";
surattestsil.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private WebView1 As WebView";
surattestsil.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private EditTextAra As EditText";
surattestsil.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private ButtonTc As Button";
surattestsil.mostCurrent._buttontc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private ButtonIsim As Button";
surattestsil.mostCurrent._buttonisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private ButtonMod As Button";
surattestsil.mostCurrent._buttonmod = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private ButtonTarih As Button";
surattestsil.mostCurrent._buttontarih = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private ButtonGateSayisi As Button";
surattestsil.mostCurrent._buttongatesayisi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private ButtonSetSayisi As Button";
surattestsil.mostCurrent._buttonsetsayisi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _labelcarpi_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi_Click (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,231);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","labelcarpi_click");}
 BA.debugLineNum = 231;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 232;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(128);
surattestsil.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 233;BA.debugLine="EditTextAra.Text = \"\"";
Debug.ShouldStop(256);
surattestsil.mostCurrent._edittextara.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 234;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(512);
_listviewgosterdb();
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("ListView1_ItemClick (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,250);
if (RapidSub.canDelegate("listview1_itemclick")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","listview1_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 250;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="WebView1.Visible = True";
Debug.ShouldStop(67108864);
surattestsil.mostCurrent._webview1.runMethod(true,"setVisible",surattestsil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 252;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(134217728);
surattestsil.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(surattestsil.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,surattestsil.mostCurrent.activityBA,(Object)(surattestsil.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] , mod As [SEÇİLEN MOD], surat_tarih As [TARİH], surat_saat As [SAAT], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , gateSayisi As [BAĞLI GATE SAYISI] ,setSayisi As [SET SAYISI], veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP], veri4 As [LAP], veri5 As [LAP], veri6 As [LAP],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND surat_id = '"),_value,RemoteObject.createImmutable("'"))),(Object)((surattestsil.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(surattestsil.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 253;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
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
public static RemoteObject  _listview1_itemlongclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView1_ItemLongClick (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,256);
if (RapidSub.canDelegate("listview1_itemlongclick")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","listview1_itemlongclick", _position, _value);}
int _i = 0;
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 256;BA.debugLine="Sub ListView1_ItemLongClick (Position As Int, Valu";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 257;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(1);
surattestsil.mostCurrent._webview1.runMethod(true,"setVisible",surattestsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 258;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SuratTest";
Debug.ShouldStop(2);
surattestsil.mostCurrent._rs.setObject(surattestsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM SuratTest WHERE surat_id = '"),_value,RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 260;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(8);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {surattestsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 261;BA.debugLine="rs.Position = i";
Debug.ShouldStop(16);
surattestsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 263;BA.debugLine="id = rs.GetInt(\"surat_id\")";
Debug.ShouldStop(64);
surattestsil._id = surattestsil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("surat_id")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 265;BA.debugLine="rs.Close";
Debug.ShouldStop(256);
surattestsil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 267;BA.debugLine="Dim result As Int";
Debug.ShouldStop(1024);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 268;BA.debugLine="result = Msgbox2(\"Sürat test bilgisini silmek ist";
Debug.ShouldStop(2048);
_result = surattestsil.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Sürat test bilgisini silmek istediğinizden emin misiniz?:")),(Object)(BA.ObjectToCharSequence("Onay Mesajı")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Hayır")),(Object)((surattestsil.mostCurrent.__c.getField(false,"Null"))),surattestsil.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 269;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, surattestsil.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 270;BA.debugLine="Main.sql.ExecNonQuery(\"DELETE FROM SuratTest WHE";
Debug.ShouldStop(8192);
surattestsil.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM SuratTest WHERE surat_id = '"),surattestsil._id,RemoteObject.createImmutable("' "))));
 BA.debugLineNum = 271;BA.debugLine="ToastMessageShow(\"Sürat test bilgisini silindi..";
Debug.ShouldStop(16384);
surattestsil.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Sürat test bilgisini silindi...")),(Object)(surattestsil.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 273;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(65536);
_listviewgosterdb();
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("ListViewGosterDB (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,132);
if (RapidSub.canDelegate("listviewgosterdb")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","listviewgosterdb");}
int _i = 0;
 BA.debugLineNum = 132;BA.debugLine="Sub ListViewGosterDB";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(16);
surattestsil.mostCurrent._webview1.runMethod(true,"setVisible",surattestsil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 134;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(32);
surattestsil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 135;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SuratTest,";
Debug.ShouldStop(64);
surattestsil.mostCurrent._rs.setObject(surattestsil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id ORDER BY surat_id  DESC"))));
 BA.debugLineNum = 136;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(128);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {surattestsil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 137;BA.debugLine="rs.Position = i";
Debug.ShouldStop(256);
surattestsil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 138;BA.debugLine="VeriAl";
Debug.ShouldStop(512);
_verial();
 BA.debugLineNum = 139;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(1024);
surattestsil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(surattestsil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._saat))),RemoteObject.createImmutable(" // Mod: "),surattestsil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestsil.mostCurrent._moddeger))),RemoteObject.createImmutable(""))))),(Object)((surattestsil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
public static RemoteObject  _setdivider(RemoteObject _lv,RemoteObject _renk,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetDivider (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,276);
if (RapidSub.canDelegate("setdivider")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","setdivider", _lv, _renk, _height);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("lv", _lv);
Debug.locals.put("Renk", _renk);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 276;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
Debug.ShouldStop(524288);
 BA.debugLineNum = 277;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(1048576);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 278;BA.debugLine="r.Target = lv";
Debug.ShouldStop(2097152);
_r.setField ("Target",(_lv.getObject()));
 BA.debugLineNum = 279;BA.debugLine="Dim CD As ColorDrawable";
Debug.ShouldStop(4194304);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("CD", _cd);
 BA.debugLineNum = 280;BA.debugLine="CD.Initialize(Renk, 0)";
Debug.ShouldStop(8388608);
_cd.runVoidMethod ("Initialize",(Object)(_renk),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 281;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
Debug.ShouldStop(16777216);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setDivider")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cd.getObject())})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("android.graphics.drawable.Drawable")})));
 BA.debugLineNum = 282;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
Debug.ShouldStop(33554432);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setDividerHeight")),(Object)(BA.NumberToString(_height)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 283;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("VeriAl (surattestsil) ","surattestsil",20,surattestsil.mostCurrent.activityBA,surattestsil.mostCurrent,106);
if (RapidSub.canDelegate("verial")) { return b4a.example3.surattestsil.remoteMe.runUserSub(false, "surattestsil","verial");}
RemoteObject _inputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
 BA.debugLineNum = 106;BA.debugLine="Public Sub VeriAl";
Debug.ShouldStop(512);
 BA.debugLineNum = 108;BA.debugLine="id = rs.GetInt(\"surat_id\")";
Debug.ShouldStop(2048);
surattestsil._id = surattestsil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("surat_id")));
 BA.debugLineNum = 109;BA.debugLine="tc = rs.GetString(\"denek_tc\")";
Debug.ShouldStop(4096);
surattestsil.mostCurrent._tc = surattestsil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_tc")));
 BA.debugLineNum = 110;BA.debugLine="isim = rs.GetString(\"denek_isim\")";
Debug.ShouldStop(8192);
surattestsil.mostCurrent._isim = surattestsil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_isim")));
 BA.debugLineNum = 111;BA.debugLine="tarih = rs.GetString(\"surat_tarih\")";
Debug.ShouldStop(16384);
surattestsil.mostCurrent._tarih = surattestsil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("surat_tarih")));
 BA.debugLineNum = 112;BA.debugLine="saat = rs.GetString(\"surat_saat\")";
Debug.ShouldStop(32768);
surattestsil.mostCurrent._saat = surattestsil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("surat_saat")));
 BA.debugLineNum = 113;BA.debugLine="modDeger = rs.GetString(\"mod\")";
Debug.ShouldStop(65536);
surattestsil.mostCurrent._moddeger = surattestsil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("mod")));
 BA.debugLineNum = 114;BA.debugLine="gate_sayisi = rs.GetInt(\"gateSayisi\")";
Debug.ShouldStop(131072);
surattestsil._gate_sayisi = surattestsil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("gateSayisi")));
 BA.debugLineNum = 115;BA.debugLine="set_sayisi = rs.GetInt(\"setSayisi\")";
Debug.ShouldStop(262144);
surattestsil._set_sayisi = surattestsil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("setSayisi")));
 BA.debugLineNum = 116;BA.debugLine="resim = rs.GetBlob(\"denek_image\")";
Debug.ShouldStop(524288);
surattestsil._resim = surattestsil.mostCurrent._rs.runMethod(false,"GetBlob",(Object)(RemoteObject.createImmutable("denek_image")));
 BA.debugLineNum = 117;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 118;BA.debugLine="Dim inputStream As InputStream";
Debug.ShouldStop(2097152);
_inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 119;BA.debugLine="inputStream.InitializeFromBytesArray(resim, 0, r";
Debug.ShouldStop(4194304);
_inputstream.runVoidMethod ("InitializeFromBytesArray",(Object)(surattestsil._resim),(Object)(BA.numberCast(int.class, 0)),(Object)(surattestsil._resim.getField(true,"length")));
 BA.debugLineNum = 120;BA.debugLine="bmp.Initialize2(inputStream)";
Debug.ShouldStop(8388608);
surattestsil.mostCurrent._bmp.runVoidMethod ("Initialize2",(Object)((_inputstream.getObject())));
 BA.debugLineNum = 121;BA.debugLine="inputStream.Close";
Debug.ShouldStop(16777216);
_inputstream.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",surattestsil.processBA, e16.toString()); BA.debugLineNum = 123;BA.debugLine="bmp = LoadBitmap(File.DirAssets, \"FotoKisi.png\")";
Debug.ShouldStop(67108864);
surattestsil.mostCurrent._bmp = surattestsil.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(surattestsil.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("FotoKisi.png")));
 };
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
}