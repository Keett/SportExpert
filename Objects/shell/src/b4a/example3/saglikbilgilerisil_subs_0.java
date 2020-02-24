package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class saglikbilgilerisil_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (saglikbilgilerisil) ","saglikbilgilerisil",24,saglikbilgilerisil.mostCurrent.activityBA,saglikbilgilerisil.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.saglikbilgilerisil.remoteMe.runUserSub(false, "saglikbilgilerisil","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="Activity.LoadLayout(\"SaglikBilgileriSilPage\")";
Debug.ShouldStop(8);
saglikbilgilerisil.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SaglikBilgileriSilPage")),saglikbilgilerisil.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(16);
saglikbilgilerisil.mostCurrent._webview1.runMethod(true,"setVisible",saglikbilgilerisil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 38;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(32);
saglikbilgilerisil.mostCurrent._labelcarpi.runMethod(true,"setVisible",saglikbilgilerisil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 41;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.Visible = False";
Debug.ShouldStop(256);
saglikbilgilerisil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setVisible",saglikbilgilerisil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 42;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextColor";
Debug.ShouldStop(512);
saglikbilgilerisil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextColor",saglikbilgilerisil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 43;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
Debug.ShouldStop(1024);
saglikbilgilerisil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 44;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
Debug.ShouldStop(2048);
_setdivider(saglikbilgilerisil.mostCurrent._listview1,saglikbilgilerisil.mostCurrent._color._acikmavi /*RemoteObject*/ ,saglikbilgilerisil.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 46;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(8192);
saglikbilgilerisil.mostCurrent._edittextara.runMethod(true,"setTextColor",saglikbilgilerisil.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 47;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(16384);
saglikbilgilerisil.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 48;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(32768);
saglikbilgilerisil.mostCurrent._edittextara.runMethod(true,"setHintColor",saglikbilgilerisil.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 49;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(65536);
saglikbilgilerisil.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 50;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(131072);
saglikbilgilerisil.mostCurrent._edittextara.runMethod(false,"setTypeface",saglikbilgilerisil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 52;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(524288);
saglikbilgilerisil.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",saglikbilgilerisil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 53;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(1048576);
saglikbilgilerisil.mostCurrent._webview1.runMethod(true,"setZoomEnabled",saglikbilgilerisil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 55;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
Debug.ShouldStop(4194304);
saglikbilgilerisil.mostCurrent._buttontc.runMethod(true,"setTextColor",saglikbilgilerisil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 56;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(8388608);
saglikbilgilerisil.mostCurrent._buttontc.runMethod(false,"setTypeface",saglikbilgilerisil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 57;BA.debugLine="ButtonTc.Text = \"TC\"";
Debug.ShouldStop(16777216);
saglikbilgilerisil.mostCurrent._buttontc.runMethod(true,"setText",BA.ObjectToCharSequence("TC"));
 BA.debugLineNum = 58;BA.debugLine="ButtonTc.TextSize = 14";
Debug.ShouldStop(33554432);
saglikbilgilerisil.mostCurrent._buttontc.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 59;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(67108864);
saglikbilgilerisil.mostCurrent._buttontc.runVoidMethod ("setSingleLine",saglikbilgilerisil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 61;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
Debug.ShouldStop(268435456);
saglikbilgilerisil.mostCurrent._buttonisim.runMethod(true,"setTextColor",saglikbilgilerisil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 62;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(536870912);
saglikbilgilerisil.mostCurrent._buttonisim.runMethod(false,"setTypeface",saglikbilgilerisil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 63;BA.debugLine="ButtonIsim.Text = \"İSİM\"";
Debug.ShouldStop(1073741824);
saglikbilgilerisil.mostCurrent._buttonisim.runMethod(true,"setText",BA.ObjectToCharSequence("İSİM"));
 BA.debugLineNum = 64;BA.debugLine="ButtonIsim.TextSize = 14";
Debug.ShouldStop(-2147483648);
saglikbilgilerisil.mostCurrent._buttonisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 65;BA.debugLine="ButtonIsim.SingleLine = True";
Debug.ShouldStop(1);
saglikbilgilerisil.mostCurrent._buttonisim.runVoidMethod ("setSingleLine",saglikbilgilerisil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 67;BA.debugLine="ButtonHastalikSaglik.TextColor = Color.koyuMavi";
Debug.ShouldStop(4);
saglikbilgilerisil.mostCurrent._buttonhastaliksaglik.runMethod(true,"setTextColor",saglikbilgilerisil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 68;BA.debugLine="ButtonHastalikSaglik.Typeface = Typeface.DEFAULT_";
Debug.ShouldStop(8);
saglikbilgilerisil.mostCurrent._buttonhastaliksaglik.runMethod(false,"setTypeface",saglikbilgilerisil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 69;BA.debugLine="ButtonHastalikSaglik.Text = \"HASTALIK/SAĞLIK\"";
Debug.ShouldStop(16);
saglikbilgilerisil.mostCurrent._buttonhastaliksaglik.runMethod(true,"setText",BA.ObjectToCharSequence("HASTALIK/SAĞLIK"));
 BA.debugLineNum = 70;BA.debugLine="ButtonHastalikSaglik.TextSize = 14";
Debug.ShouldStop(32);
saglikbilgilerisil.mostCurrent._buttonhastaliksaglik.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 71;BA.debugLine="ButtonHastalikSaglik.SingleLine = True";
Debug.ShouldStop(64);
saglikbilgilerisil.mostCurrent._buttonhastaliksaglik.runVoidMethod ("setSingleLine",saglikbilgilerisil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 73;BA.debugLine="ButtonSaglikBilgileriAciklama.TextColor = Color.k";
Debug.ShouldStop(256);
saglikbilgilerisil.mostCurrent._buttonsaglikbilgileriaciklama.runMethod(true,"setTextColor",saglikbilgilerisil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 74;BA.debugLine="ButtonSaglikBilgileriAciklama.Typeface = Typeface";
Debug.ShouldStop(512);
saglikbilgilerisil.mostCurrent._buttonsaglikbilgileriaciklama.runMethod(false,"setTypeface",saglikbilgilerisil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 75;BA.debugLine="ButtonSaglikBilgileriAciklama.Text = \"SAĞLIK BİLG";
Debug.ShouldStop(1024);
saglikbilgilerisil.mostCurrent._buttonsaglikbilgileriaciklama.runMethod(true,"setText",BA.ObjectToCharSequence("SAĞLIK BİLGİLERİ AÇIKLAMA"));
 BA.debugLineNum = 76;BA.debugLine="ButtonSaglikBilgileriAciklama.TextSize = 14";
Debug.ShouldStop(2048);
saglikbilgilerisil.mostCurrent._buttonsaglikbilgileriaciklama.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 77;BA.debugLine="ButtonSaglikBilgileriAciklama.SingleLine = True";
Debug.ShouldStop(4096);
saglikbilgilerisil.mostCurrent._buttonsaglikbilgileriaciklama.runVoidMethod ("setSingleLine",saglikbilgilerisil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 79;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
Debug.ShouldStop(16384);
saglikbilgilerisil.mostCurrent._buttontarih.runMethod(true,"setTextColor",saglikbilgilerisil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 80;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(32768);
saglikbilgilerisil.mostCurrent._buttontarih.runMethod(false,"setTypeface",saglikbilgilerisil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 81;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
Debug.ShouldStop(65536);
saglikbilgilerisil.mostCurrent._buttontarih.runMethod(true,"setText",BA.ObjectToCharSequence("TARİH"));
 BA.debugLineNum = 82;BA.debugLine="ButtonTarih.TextSize = 14";
Debug.ShouldStop(131072);
saglikbilgilerisil.mostCurrent._buttontarih.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 83;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(262144);
saglikbilgilerisil.mostCurrent._buttontc.runVoidMethod ("setSingleLine",saglikbilgilerisil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 87;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(4194304);
_listviewgosterdb();
 BA.debugLineNum = 89;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (saglikbilgilerisil) ","saglikbilgilerisil",24,saglikbilgilerisil.mostCurrent.activityBA,saglikbilgilerisil.mostCurrent,95);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.saglikbilgilerisil.remoteMe.runUserSub(false, "saglikbilgilerisil","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 95;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 97;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Resume (saglikbilgilerisil) ","saglikbilgilerisil",24,saglikbilgilerisil.mostCurrent.activityBA,saglikbilgilerisil.mostCurrent,91);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.saglikbilgilerisil.remoteMe.runUserSub(false, "saglikbilgilerisil","activity_resume");}
 BA.debugLineNum = 91;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 93;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ButtonAnasayfa_Click (saglikbilgilerisil) ","saglikbilgilerisil",24,saglikbilgilerisil.mostCurrent.activityBA,saglikbilgilerisil.mostCurrent,260);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.saglikbilgilerisil.remoteMe.runUserSub(false, "saglikbilgilerisil","buttonanasayfa_click");}
 BA.debugLineNum = 260;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 261;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(16);
saglikbilgilerisil.mostCurrent.__c.runVoidMethod ("StartActivity",saglikbilgilerisil.processBA,(Object)((saglikbilgilerisil.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 262;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
saglikbilgilerisil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonhastaliksaglik_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonHastalikSaglik_Click (saglikbilgilerisil) ","saglikbilgilerisil",24,saglikbilgilerisil.mostCurrent.activityBA,saglikbilgilerisil.mostCurrent,173);
if (RapidSub.canDelegate("buttonhastaliksaglik_click")) { return b4a.example3.saglikbilgilerisil.remoteMe.runUserSub(false, "saglikbilgilerisil","buttonhastaliksaglik_click");}
int _i = 0;
 BA.debugLineNum = 173;BA.debugLine="Sub ButtonHastalikSaglik_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(8192);
saglikbilgilerisil.mostCurrent._webview1.runMethod(true,"setVisible",saglikbilgilerisil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 175;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(16384);
saglikbilgilerisil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 176;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT saglikBilgileri_h";
Debug.ShouldStop(32768);
saglikbilgilerisil.mostCurrent._rs.setObject(saglikbilgilerisil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT saglikBilgileri_hastalikSakatlik ,saglikBilgileri_id FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_hastalikSakatlik LIKE '%"),saglikbilgilerisil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY saglikBilgileri_id DESC")))));
 BA.debugLineNum = 178;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(131072);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {saglikbilgilerisil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 179;BA.debugLine="rs.Position = i";
Debug.ShouldStop(262144);
saglikbilgilerisil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 180;BA.debugLine="VeriAl";
Debug.ShouldStop(524288);
_verial();
 BA.debugLineNum = 181;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(1048576);
saglikbilgilerisil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(saglikbilgilerisil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._saat))),RemoteObject.createImmutable(" // Hastalık/Sağlık: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._hastalik_saglik))),RemoteObject.createImmutable(""))))),(Object)((saglikbilgilerisil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 183;BA.debugLine="rs.Close";
Debug.ShouldStop(4194304);
saglikbilgilerisil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("ButtonIsim_Click (saglikbilgilerisil) ","saglikbilgilerisil",24,saglikbilgilerisil.mostCurrent.activityBA,saglikbilgilerisil.mostCurrent,199);
if (RapidSub.canDelegate("buttonisim_click")) { return b4a.example3.saglikbilgilerisil.remoteMe.runUserSub(false, "saglikbilgilerisil","buttonisim_click");}
int _i = 0;
 BA.debugLineNum = 199;BA.debugLine="Sub ButtonIsim_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 200;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(128);
saglikbilgilerisil.mostCurrent._webview1.runMethod(true,"setVisible",saglikbilgilerisil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 201;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(256);
saglikbilgilerisil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 202;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT denek_isim,saglik";
Debug.ShouldStop(512);
saglikbilgilerisil.mostCurrent._rs.setObject(saglikbilgilerisil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_isim,saglikBilgileri_id  FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND denek_isim LIKE '%"),saglikbilgilerisil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY saglikBilgileri_id DESC")))));
 BA.debugLineNum = 204;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(2048);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {saglikbilgilerisil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 205;BA.debugLine="rs.Position = i";
Debug.ShouldStop(4096);
saglikbilgilerisil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 206;BA.debugLine="VeriAl";
Debug.ShouldStop(8192);
_verial();
 BA.debugLineNum = 207;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(16384);
saglikbilgilerisil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(saglikbilgilerisil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._saat))),RemoteObject.createImmutable(""))))),(Object)((saglikbilgilerisil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 209;BA.debugLine="rs.Close";
Debug.ShouldStop(65536);
saglikbilgilerisil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonsaglikbilgileraciklama_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSaglikBilgilerAciklama_Click (saglikbilgilerisil) ","saglikbilgilerisil",24,saglikbilgilerisil.mostCurrent.activityBA,saglikbilgilerisil.mostCurrent,160);
if (RapidSub.canDelegate("buttonsaglikbilgileraciklama_click")) { return b4a.example3.saglikbilgilerisil.remoteMe.runUserSub(false, "saglikbilgilerisil","buttonsaglikbilgileraciklama_click");}
int _i = 0;
 BA.debugLineNum = 160;BA.debugLine="Sub ButtonSaglikBilgilerAciklama_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 161;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(1);
saglikbilgilerisil.mostCurrent._webview1.runMethod(true,"setVisible",saglikbilgilerisil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 162;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(2);
saglikbilgilerisil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 163;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT saglikBilgileri_a";
Debug.ShouldStop(4);
saglikbilgilerisil.mostCurrent._rs.setObject(saglikbilgilerisil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT saglikBilgileri_aciklama,saglikBilgileri_id FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_aciklama LIKE '%"),saglikbilgilerisil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY saglikBilgileri_id DESC ")))));
 BA.debugLineNum = 165;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(16);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {saglikbilgilerisil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 166;BA.debugLine="rs.Position = i";
Debug.ShouldStop(32);
saglikbilgilerisil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 167;BA.debugLine="VeriAl";
Debug.ShouldStop(64);
_verial();
 BA.debugLineNum = 168;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(128);
saglikbilgilerisil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(saglikbilgilerisil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._saat))),RemoteObject.createImmutable(" // Açıklama: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._aciklama))),RemoteObject.createImmutable(""))))),(Object)((saglikbilgilerisil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 170;BA.debugLine="rs.Close";
Debug.ShouldStop(512);
saglikbilgilerisil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonsaglikbilgileriekle_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSaglikBilgileriEkle_Click (saglikbilgilerisil) ","saglikbilgilerisil",24,saglikbilgilerisil.mostCurrent.activityBA,saglikbilgilerisil.mostCurrent,214);
if (RapidSub.canDelegate("buttonsaglikbilgileriekle_click")) { return b4a.example3.saglikbilgilerisil.remoteMe.runUserSub(false, "saglikbilgilerisil","buttonsaglikbilgileriekle_click");}
 BA.debugLineNum = 214;BA.debugLine="Sub ButtonSaglikBilgileriEkle_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 215;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(4194304);
saglikbilgilerisil.mostCurrent._webview1.runMethod(true,"setVisible",saglikbilgilerisil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 216;BA.debugLine="StartActivity(SaglikBilgileriEkle)";
Debug.ShouldStop(8388608);
saglikbilgilerisil.mostCurrent.__c.runVoidMethod ("StartActivity",saglikbilgilerisil.processBA,(Object)((saglikbilgilerisil.mostCurrent._saglikbilgileriekle.getObject())));
 BA.debugLineNum = 217;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16777216);
saglikbilgilerisil.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buttonsaglikbilgileritabloveri_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSaglikBilgileriTabloVeri_Click (saglikbilgilerisil) ","saglikbilgilerisil",24,saglikbilgilerisil.mostCurrent.activityBA,saglikbilgilerisil.mostCurrent,220);
if (RapidSub.canDelegate("buttonsaglikbilgileritabloveri_click")) { return b4a.example3.saglikbilgilerisil.remoteMe.runUserSub(false, "saglikbilgilerisil","buttonsaglikbilgileritabloveri_click");}
 BA.debugLineNum = 220;BA.debugLine="Sub ButtonSaglikBilgileriTabloVeri_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 221;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(268435456);
saglikbilgilerisil.mostCurrent._webview1.runMethod(true,"setVisible",saglikbilgilerisil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 222;BA.debugLine="StartActivity(SaglikBilgileriListele)";
Debug.ShouldStop(536870912);
saglikbilgilerisil.mostCurrent.__c.runVoidMethod ("StartActivity",saglikbilgilerisil.processBA,(Object)((saglikbilgilerisil.mostCurrent._saglikbilgilerilistele.getObject())));
 BA.debugLineNum = 223;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1073741824);
saglikbilgilerisil.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buttontarih_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTarih_Click (saglikbilgilerisil) ","saglikbilgilerisil",24,saglikbilgilerisil.mostCurrent.activityBA,saglikbilgilerisil.mostCurrent,147);
if (RapidSub.canDelegate("buttontarih_click")) { return b4a.example3.saglikbilgilerisil.remoteMe.runUserSub(false, "saglikbilgilerisil","buttontarih_click");}
int _i = 0;
 BA.debugLineNum = 147;BA.debugLine="Sub ButtonTarih_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(524288);
saglikbilgilerisil.mostCurrent._webview1.runMethod(true,"setVisible",saglikbilgilerisil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 149;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(1048576);
saglikbilgilerisil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 150;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT saglikBilgileri_t";
Debug.ShouldStop(2097152);
saglikbilgilerisil.mostCurrent._rs.setObject(saglikbilgilerisil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT saglikBilgileri_tarih ,saglikBilgileri_id  FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_tarih LIKE '%"),saglikbilgilerisil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY saglikBilgileri_id DESC ")))));
 BA.debugLineNum = 152;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(8388608);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {saglikbilgilerisil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 153;BA.debugLine="rs.Position = i";
Debug.ShouldStop(16777216);
saglikbilgilerisil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 154;BA.debugLine="VeriAl";
Debug.ShouldStop(33554432);
_verial();
 BA.debugLineNum = 155;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(67108864);
saglikbilgilerisil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(saglikbilgilerisil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._saat))),RemoteObject.createImmutable(""))))),(Object)((saglikbilgilerisil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 157;BA.debugLine="rs.Close";
Debug.ShouldStop(268435456);
saglikbilgilerisil.mostCurrent._rs.runVoidMethod ("Close");
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
public static RemoteObject  _buttontc_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTc_Click (saglikbilgilerisil) ","saglikbilgilerisil",24,saglikbilgilerisil.mostCurrent.activityBA,saglikbilgilerisil.mostCurrent,186);
if (RapidSub.canDelegate("buttontc_click")) { return b4a.example3.saglikbilgilerisil.remoteMe.runUserSub(false, "saglikbilgilerisil","buttontc_click");}
int _i = 0;
 BA.debugLineNum = 186;BA.debugLine="Sub ButtonTc_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(67108864);
saglikbilgilerisil.mostCurrent._webview1.runMethod(true,"setVisible",saglikbilgilerisil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 188;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(134217728);
saglikbilgilerisil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 189;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT denek_tc,saglikBi";
Debug.ShouldStop(268435456);
saglikbilgilerisil.mostCurrent._rs.setObject(saglikbilgilerisil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc,saglikBilgileri_id FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND denek_tc LIKE '%"),saglikbilgilerisil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY saglikBilgileri_id DESC")))));
 BA.debugLineNum = 191;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(1073741824);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {saglikbilgilerisil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 192;BA.debugLine="rs.Position = i";
Debug.ShouldStop(-2147483648);
saglikbilgilerisil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 193;BA.debugLine="VeriAl";
Debug.ShouldStop(1);
_verial();
 BA.debugLineNum = 194;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(2);
saglikbilgilerisil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(saglikbilgilerisil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._saat))),RemoteObject.createImmutable(" "))))),(Object)((saglikbilgilerisil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 196;BA.debugLine="rs.Close";
Debug.ShouldStop(8);
saglikbilgilerisil.mostCurrent._rs.runVoidMethod ("Close");
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
public static RemoteObject  _edittextara_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextAra_TextChanged (saglikbilgilerisil) ","saglikbilgilerisil",24,saglikbilgilerisil.mostCurrent.activityBA,saglikbilgilerisil.mostCurrent,129);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.saglikbilgilerisil.remoteMe.runUserSub(false, "saglikbilgilerisil","edittextara_textchanged", _old, _new);}
int _i = 0;
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 129;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(2);
saglikbilgilerisil.mostCurrent._labelcarpi.runMethod(true,"setVisible",saglikbilgilerisil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 131;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(4);
saglikbilgilerisil.mostCurrent._webview1.runMethod(true,"setVisible",saglikbilgilerisil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 132;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(8);
saglikbilgilerisil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 133;BA.debugLine="rs = Main.sql.ExecQuery( \"SELECT * FROM SaglikBil";
Debug.ShouldStop(16);
saglikbilgilerisil.mostCurrent._rs.setObject(saglikbilgilerisil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND (denek_tc LIKE '%"),saglikbilgilerisil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_isim LIKE '%"),saglikbilgilerisil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR saglikBilgileri_tarih LIKE '%"),saglikbilgilerisil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR saglikBilgileri_hastalikSakatlik LIKE '%"),saglikbilgilerisil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR saglikBilgileri_aciklama LIKE '%"),saglikbilgilerisil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%') ORDER BY saglikBilgileri_id DESC")))));
 BA.debugLineNum = 135;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(64);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {saglikbilgilerisil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 136;BA.debugLine="rs.Position = i";
Debug.ShouldStop(128);
saglikbilgilerisil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 137;BA.debugLine="VeriAl";
Debug.ShouldStop(256);
_verial();
 BA.debugLineNum = 138;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(512);
saglikbilgilerisil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(saglikbilgilerisil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._saat))),RemoteObject.createImmutable(" "))))),(Object)((saglikbilgilerisil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 140;BA.debugLine="rs.Close";
Debug.ShouldStop(2048);
saglikbilgilerisil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 141;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",saglikbilgilerisil.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 142;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(8192);
saglikbilgilerisil.mostCurrent._labelcarpi.runMethod(true,"setVisible",saglikbilgilerisil.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
 //BA.debugLineNum = 16;BA.debugLine="Private EditTextAra As EditText";
saglikbilgilerisil.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ListView1 As ListView";
saglikbilgilerisil.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private WebView1 As WebView";
saglikbilgilerisil.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim rs As ResultSet";
saglikbilgilerisil.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim id As Int";
saglikbilgilerisil._id = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 21;BA.debugLine="Private ButtonIsim As Button";
saglikbilgilerisil.mostCurrent._buttonisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ButtonTc As Button";
saglikbilgilerisil.mostCurrent._buttontc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ButtonHastalikSaglik As Button";
saglikbilgilerisil.mostCurrent._buttonhastaliksaglik = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonSaglikBilgileriAciklama As Button";
saglikbilgilerisil.mostCurrent._buttonsaglikbilgileriaciklama = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ButtonTarih As Button";
saglikbilgilerisil.mostCurrent._buttontarih = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim tc,tarih,isim, saat, hastalik_saglik, aciklam";
saglikbilgilerisil.mostCurrent._tc = RemoteObject.createImmutable("");
saglikbilgilerisil.mostCurrent._tarih = RemoteObject.createImmutable("");
saglikbilgilerisil.mostCurrent._isim = RemoteObject.createImmutable("");
saglikbilgilerisil.mostCurrent._saat = RemoteObject.createImmutable("");
saglikbilgilerisil.mostCurrent._hastalik_saglik = RemoteObject.createImmutable("");
saglikbilgilerisil.mostCurrent._aciklama = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="Dim resim() As Byte";
saglikbilgilerisil._resim = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 29;BA.debugLine="Dim bmp As Bitmap";
saglikbilgilerisil.mostCurrent._bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private ButtonAnasayfa As Button";
saglikbilgilerisil.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private LabelCarpi As Label";
saglikbilgilerisil.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _labelcarpi_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi_Click (saglikbilgilerisil) ","saglikbilgilerisil",24,saglikbilgilerisil.mostCurrent.activityBA,saglikbilgilerisil.mostCurrent,265);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.saglikbilgilerisil.remoteMe.runUserSub(false, "saglikbilgilerisil","labelcarpi_click");}
 BA.debugLineNum = 265;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 266;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(512);
saglikbilgilerisil.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 267;BA.debugLine="EditTextAra.Text = \"\"";
Debug.ShouldStop(1024);
saglikbilgilerisil.mostCurrent._edittextara.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 268;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(2048);
_listviewgosterdb();
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("ListView1_ItemClick (saglikbilgilerisil) ","saglikbilgilerisil",24,saglikbilgilerisil.mostCurrent.activityBA,saglikbilgilerisil.mostCurrent,226);
if (RapidSub.canDelegate("listview1_itemclick")) { return b4a.example3.saglikbilgilerisil.remoteMe.runUserSub(false, "saglikbilgilerisil","listview1_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 226;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(2);
 BA.debugLineNum = 227;BA.debugLine="WebView1.Visible = True";
Debug.ShouldStop(4);
saglikbilgilerisil.mostCurrent._webview1.runMethod(true,"setVisible",saglikbilgilerisil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 228;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(8);
saglikbilgilerisil.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(saglikbilgilerisil.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,saglikbilgilerisil.mostCurrent.activityBA,(Object)(saglikbilgilerisil.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM], saglikBilgileri_tarih As [TARİH],saglikBilgileri_saat As [SAAT], saglikBilgileri_hastalikSakatlik As [HASTALIK/SAKATLIK], saglikBilgileri_aciklama As [AÇIKLAMA] FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_id  = '"),_value,RemoteObject.createImmutable("' "))),(Object)((saglikbilgilerisil.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(saglikbilgilerisil.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 229;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return RemoteObject.createImmutable("");
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
public static RemoteObject  _listview1_itemlongclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView1_ItemLongClick (saglikbilgilerisil) ","saglikbilgilerisil",24,saglikbilgilerisil.mostCurrent.activityBA,saglikbilgilerisil.mostCurrent,232);
if (RapidSub.canDelegate("listview1_itemlongclick")) { return b4a.example3.saglikbilgilerisil.remoteMe.runUserSub(false, "saglikbilgilerisil","listview1_itemlongclick", _position, _value);}
int _i = 0;
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 232;BA.debugLine="Sub ListView1_ItemLongClick (Position As Int, Valu";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SaglikBilg";
Debug.ShouldStop(256);
saglikbilgilerisil.mostCurrent._rs.setObject(saglikbilgilerisil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM SaglikBilgileri WHERE saglikBilgileri_id = '"),_value,RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 235;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(1024);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {saglikbilgilerisil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 236;BA.debugLine="rs.Position = i";
Debug.ShouldStop(2048);
saglikbilgilerisil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 237;BA.debugLine="id = rs.GetInt(\"saglikBilgileri_id\")";
Debug.ShouldStop(4096);
saglikbilgilerisil._id = saglikbilgilerisil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("saglikBilgileri_id")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 239;BA.debugLine="rs.Close";
Debug.ShouldStop(16384);
saglikbilgilerisil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 241;BA.debugLine="Dim result As Int";
Debug.ShouldStop(65536);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 242;BA.debugLine="result = Msgbox2(\"Sağlık bilgilerini silmek isted";
Debug.ShouldStop(131072);
_result = saglikbilgilerisil.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Sağlık bilgilerini silmek istediğinizden emin misiniz?:")),(Object)(BA.ObjectToCharSequence("Onay Mesajı")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Hayır")),(Object)((saglikbilgilerisil.mostCurrent.__c.getField(false,"Null"))),saglikbilgilerisil.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 243;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, saglikbilgilerisil.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 244;BA.debugLine="Main.sql.ExecNonQuery(\"DELETE FROM SaglikBilgile";
Debug.ShouldStop(524288);
saglikbilgilerisil.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM SaglikBilgileri WHERE saglikBilgileri_id = '"),saglikbilgilerisil._id,RemoteObject.createImmutable("' "))));
 BA.debugLineNum = 245;BA.debugLine="ToastMessageShow(\"Sağlık bilgileri silindi...\",F";
Debug.ShouldStop(1048576);
saglikbilgilerisil.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Sağlık bilgileri silindi...")),(Object)(saglikbilgilerisil.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 247;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(4194304);
_listviewgosterdb();
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("ListViewGosterDB (saglikbilgilerisil) ","saglikbilgilerisil",24,saglikbilgilerisil.mostCurrent.activityBA,saglikbilgilerisil.mostCurrent,118);
if (RapidSub.canDelegate("listviewgosterdb")) { return b4a.example3.saglikbilgilerisil.remoteMe.runUserSub(false, "saglikbilgilerisil","listviewgosterdb");}
int _i = 0;
 BA.debugLineNum = 118;BA.debugLine="Sub ListViewGosterDB";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(4194304);
saglikbilgilerisil.mostCurrent._webview1.runMethod(true,"setVisible",saglikbilgilerisil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 120;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(8388608);
saglikbilgilerisil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 121;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SaglikBilg";
Debug.ShouldStop(16777216);
saglikbilgilerisil.mostCurrent._rs.setObject(saglikbilgilerisil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id ORDER BY saglikBilgileri_id DESC"))));
 BA.debugLineNum = 122;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(33554432);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {saglikbilgilerisil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 123;BA.debugLine="rs.Position = i";
Debug.ShouldStop(67108864);
saglikbilgilerisil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 124;BA.debugLine="VeriAl";
Debug.ShouldStop(134217728);
_verial();
 BA.debugLineNum = 125;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(268435456);
saglikbilgilerisil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(saglikbilgilerisil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._saat))),RemoteObject.createImmutable(" // Hastalık/Sağlık: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._hastalik_saglik))),RemoteObject.createImmutable(" // Açıklama: "),saglikbilgilerisil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((saglikbilgilerisil.mostCurrent._aciklama))),RemoteObject.createImmutable(""))))),(Object)((saglikbilgilerisil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 127;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setdivider(RemoteObject _lv,RemoteObject _renk,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetDivider (saglikbilgilerisil) ","saglikbilgilerisil",24,saglikbilgilerisil.mostCurrent.activityBA,saglikbilgilerisil.mostCurrent,251);
if (RapidSub.canDelegate("setdivider")) { return b4a.example3.saglikbilgilerisil.remoteMe.runUserSub(false, "saglikbilgilerisil","setdivider", _lv, _renk, _height);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("lv", _lv);
Debug.locals.put("Renk", _renk);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 251;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 252;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(134217728);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 253;BA.debugLine="r.Target = lv";
Debug.ShouldStop(268435456);
_r.setField ("Target",(_lv.getObject()));
 BA.debugLineNum = 254;BA.debugLine="Dim CD As ColorDrawable";
Debug.ShouldStop(536870912);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("CD", _cd);
 BA.debugLineNum = 255;BA.debugLine="CD.Initialize(Renk, 0)";
Debug.ShouldStop(1073741824);
_cd.runVoidMethod ("Initialize",(Object)(_renk),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 256;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
Debug.ShouldStop(-2147483648);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setDivider")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cd.getObject())})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("android.graphics.drawable.Drawable")})));
 BA.debugLineNum = 257;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
Debug.ShouldStop(1);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setDividerHeight")),(Object)(BA.NumberToString(_height)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("VeriAl (saglikbilgilerisil) ","saglikbilgilerisil",24,saglikbilgilerisil.mostCurrent.activityBA,saglikbilgilerisil.mostCurrent,99);
if (RapidSub.canDelegate("verial")) { return b4a.example3.saglikbilgilerisil.remoteMe.runUserSub(false, "saglikbilgilerisil","verial");}
RemoteObject _inputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
 BA.debugLineNum = 99;BA.debugLine="Public Sub VeriAl";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="id = rs.GetInt(\"saglikBilgileri_id\")";
Debug.ShouldStop(8);
saglikbilgilerisil._id = saglikbilgilerisil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("saglikBilgileri_id")));
 BA.debugLineNum = 101;BA.debugLine="tc = rs.GetString(\"denek_tc\")";
Debug.ShouldStop(16);
saglikbilgilerisil.mostCurrent._tc = saglikbilgilerisil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_tc")));
 BA.debugLineNum = 102;BA.debugLine="isim = rs.GetString(\"denek_isim\")";
Debug.ShouldStop(32);
saglikbilgilerisil.mostCurrent._isim = saglikbilgilerisil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_isim")));
 BA.debugLineNum = 103;BA.debugLine="tarih = rs.GetString(\"saglikBilgileri_tarih\")";
Debug.ShouldStop(64);
saglikbilgilerisil.mostCurrent._tarih = saglikbilgilerisil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("saglikBilgileri_tarih")));
 BA.debugLineNum = 104;BA.debugLine="saat = rs.GetString(\"saglikBilgileri_saat\")";
Debug.ShouldStop(128);
saglikbilgilerisil.mostCurrent._saat = saglikbilgilerisil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("saglikBilgileri_saat")));
 BA.debugLineNum = 105;BA.debugLine="hastalik_saglik = rs.GetInt(\"saglikBilgileri_hast";
Debug.ShouldStop(256);
saglikbilgilerisil.mostCurrent._hastalik_saglik = BA.NumberToString(saglikbilgilerisil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("saglikBilgileri_hastalikSakatlik"))));
 BA.debugLineNum = 106;BA.debugLine="aciklama = rs.GetInt(\"saglikBilgileri_aciklama\")";
Debug.ShouldStop(512);
saglikbilgilerisil.mostCurrent._aciklama = BA.NumberToString(saglikbilgilerisil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("saglikBilgileri_aciklama"))));
 BA.debugLineNum = 107;BA.debugLine="resim = rs.GetBlob(\"denek_image\")";
Debug.ShouldStop(1024);
saglikbilgilerisil._resim = saglikbilgilerisil.mostCurrent._rs.runMethod(false,"GetBlob",(Object)(RemoteObject.createImmutable("denek_image")));
 BA.debugLineNum = 108;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 109;BA.debugLine="Dim inputStream As InputStream";
Debug.ShouldStop(4096);
_inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 110;BA.debugLine="inputStream.InitializeFromBytesArray(resim, 0, r";
Debug.ShouldStop(8192);
_inputstream.runVoidMethod ("InitializeFromBytesArray",(Object)(saglikbilgilerisil._resim),(Object)(BA.numberCast(int.class, 0)),(Object)(saglikbilgilerisil._resim.getField(true,"length")));
 BA.debugLineNum = 111;BA.debugLine="bmp.Initialize2(inputStream)";
Debug.ShouldStop(16384);
saglikbilgilerisil.mostCurrent._bmp.runVoidMethod ("Initialize2",(Object)((_inputstream.getObject())));
 BA.debugLineNum = 112;BA.debugLine="inputStream.Close";
Debug.ShouldStop(32768);
_inputstream.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",saglikbilgilerisil.processBA, e15.toString()); BA.debugLineNum = 114;BA.debugLine="bmp = LoadBitmap(File.DirAssets, \"FotoKisi.png\")";
Debug.ShouldStop(131072);
saglikbilgilerisil.mostCurrent._bmp = saglikbilgilerisil.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(saglikbilgilerisil.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("FotoKisi.png")));
 };
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}