package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class antranorgorussil_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (antranorgorussil) ","antranorgorussil",1,antranorgorussil.mostCurrent.activityBA,antranorgorussil.mostCurrent,36);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.antranorgorussil.remoteMe.runUserSub(false, "antranorgorussil","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="Activity.LoadLayout(\"AntranorGorusleriSilPage\")";
Debug.ShouldStop(32);
antranorgorussil.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("AntranorGorusleriSilPage")),antranorgorussil.mostCurrent.activityBA);
 BA.debugLineNum = 39;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(64);
antranorgorussil.mostCurrent._webview1.runMethod(true,"setVisible",antranorgorussil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 40;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(128);
antranorgorussil.mostCurrent._labelcarpi.runMethod(true,"setVisible",antranorgorussil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 43;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.Visible = False";
Debug.ShouldStop(1024);
antranorgorussil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setVisible",antranorgorussil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 44;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextColor";
Debug.ShouldStop(2048);
antranorgorussil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextColor",antranorgorussil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 45;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
Debug.ShouldStop(4096);
antranorgorussil.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 46;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
Debug.ShouldStop(8192);
_setdivider(antranorgorussil.mostCurrent._listview1,antranorgorussil.mostCurrent._color._acikmavi /*RemoteObject*/ ,antranorgorussil.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 48;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(32768);
antranorgorussil.mostCurrent._edittextara.runMethod(true,"setTextColor",antranorgorussil.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 49;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(65536);
antranorgorussil.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 50;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(131072);
antranorgorussil.mostCurrent._edittextara.runMethod(true,"setHintColor",antranorgorussil.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 51;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(262144);
antranorgorussil.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 52;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(524288);
antranorgorussil.mostCurrent._edittextara.runMethod(false,"setTypeface",antranorgorussil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 54;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
Debug.ShouldStop(2097152);
antranorgorussil.mostCurrent._buttontc.runMethod(true,"setTextColor",antranorgorussil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 55;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4194304);
antranorgorussil.mostCurrent._buttontc.runMethod(false,"setTypeface",antranorgorussil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 56;BA.debugLine="ButtonTc.Text = \"TC\"";
Debug.ShouldStop(8388608);
antranorgorussil.mostCurrent._buttontc.runMethod(true,"setText",BA.ObjectToCharSequence("TC"));
 BA.debugLineNum = 57;BA.debugLine="ButtonTc.TextSize = 14";
Debug.ShouldStop(16777216);
antranorgorussil.mostCurrent._buttontc.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 58;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(33554432);
antranorgorussil.mostCurrent._buttontc.runVoidMethod ("setSingleLine",antranorgorussil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 60;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
Debug.ShouldStop(134217728);
antranorgorussil.mostCurrent._buttonisim.runMethod(true,"setTextColor",antranorgorussil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 61;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(268435456);
antranorgorussil.mostCurrent._buttonisim.runMethod(false,"setTypeface",antranorgorussil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 62;BA.debugLine="ButtonIsim.Text = \"İSİM\"";
Debug.ShouldStop(536870912);
antranorgorussil.mostCurrent._buttonisim.runMethod(true,"setText",BA.ObjectToCharSequence("İSİM"));
 BA.debugLineNum = 63;BA.debugLine="ButtonIsim.TextSize = 14";
Debug.ShouldStop(1073741824);
antranorgorussil.mostCurrent._buttonisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 64;BA.debugLine="ButtonIsim.SingleLine = True";
Debug.ShouldStop(-2147483648);
antranorgorussil.mostCurrent._buttonisim.runVoidMethod ("setSingleLine",antranorgorussil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 66;BA.debugLine="ButtonAntranorGorusleriAciklama.TextColor = Color";
Debug.ShouldStop(2);
antranorgorussil.mostCurrent._buttonantranorgorusleriaciklama.runMethod(true,"setTextColor",antranorgorussil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 67;BA.debugLine="ButtonAntranorGorusleriAciklama.Typeface = Typefa";
Debug.ShouldStop(4);
antranorgorussil.mostCurrent._buttonantranorgorusleriaciklama.runMethod(false,"setTypeface",antranorgorussil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 68;BA.debugLine="ButtonAntranorGorusleriAciklama.Text = \"ANTRANÖR";
Debug.ShouldStop(8);
antranorgorussil.mostCurrent._buttonantranorgorusleriaciklama.runMethod(true,"setText",BA.ObjectToCharSequence("ANTRANÖR GÖRÜŞ AÇIKLAMA"));
 BA.debugLineNum = 69;BA.debugLine="ButtonAntranorGorusleriAciklama.TextSize = 14";
Debug.ShouldStop(16);
antranorgorussil.mostCurrent._buttonantranorgorusleriaciklama.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 70;BA.debugLine="ButtonAntranorGorusleriAciklama.SingleLine = True";
Debug.ShouldStop(32);
antranorgorussil.mostCurrent._buttonantranorgorusleriaciklama.runVoidMethod ("setSingleLine",antranorgorussil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 72;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
Debug.ShouldStop(128);
antranorgorussil.mostCurrent._buttontarih.runMethod(true,"setTextColor",antranorgorussil.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 73;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(256);
antranorgorussil.mostCurrent._buttontarih.runMethod(false,"setTypeface",antranorgorussil.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 74;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
Debug.ShouldStop(512);
antranorgorussil.mostCurrent._buttontarih.runMethod(true,"setText",BA.ObjectToCharSequence("TARİH"));
 BA.debugLineNum = 75;BA.debugLine="ButtonTarih.TextSize  =14";
Debug.ShouldStop(1024);
antranorgorussil.mostCurrent._buttontarih.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 76;BA.debugLine="ButtonTarih.SingleLine = True";
Debug.ShouldStop(2048);
antranorgorussil.mostCurrent._buttontarih.runVoidMethod ("setSingleLine",antranorgorussil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 78;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(8192);
antranorgorussil.mostCurrent._webview1.runMethod(true,"setZoomEnabled",antranorgorussil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 79;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(16384);
antranorgorussil.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",antranorgorussil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 83;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(262144);
_listviewgosterdb();
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Activity_Pause (antranorgorussil) ","antranorgorussil",1,antranorgorussil.mostCurrent.activityBA,antranorgorussil.mostCurrent,90);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.antranorgorussil.remoteMe.runUserSub(false, "antranorgorussil","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 90;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Activity_Resume (antranorgorussil) ","antranorgorussil",1,antranorgorussil.mostCurrent.activityBA,antranorgorussil.mostCurrent,86);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.antranorgorussil.remoteMe.runUserSub(false, "antranorgorussil","activity_resume");}
 BA.debugLineNum = 86;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2097152);
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
public static RemoteObject  _buttonanasayfa_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAnasayfa_Click (antranorgorussil) ","antranorgorussil",1,antranorgorussil.mostCurrent.activityBA,antranorgorussil.mostCurrent,207);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.antranorgorussil.remoteMe.runUserSub(false, "antranorgorussil","buttonanasayfa_click");}
 BA.debugLineNum = 207;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 208;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(32768);
antranorgorussil.mostCurrent.__c.runVoidMethod ("StartActivity",antranorgorussil.processBA,(Object)((antranorgorussil.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 209;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
antranorgorussil.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buttonantranorgorusaciklama_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAntranorGorusAciklama_Click (antranorgorussil) ","antranorgorussil",1,antranorgorussil.mostCurrent.activityBA,antranorgorussil.mostCurrent,155);
if (RapidSub.canDelegate("buttonantranorgorusaciklama_click")) { return b4a.example3.antranorgorussil.remoteMe.runUserSub(false, "antranorgorussil","buttonantranorgorusaciklama_click");}
int _i = 0;
 BA.debugLineNum = 155;BA.debugLine="Sub ButtonAntranorGorusAciklama_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(134217728);
antranorgorussil.mostCurrent._webview1.runMethod(true,"setVisible",antranorgorussil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 157;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(268435456);
antranorgorussil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 158;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM AntranorGo";
Debug.ShouldStop(536870912);
antranorgorussil.mostCurrent._rs.setObject(antranorgorussil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id AND antranorGorüsleri_aciklama LIKE '%"),antranorgorussil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY antranorGorüsleri_id DESC")))));
 BA.debugLineNum = 160;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(-2147483648);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {antranorgorussil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 161;BA.debugLine="rs.Position = i";
Debug.ShouldStop(1);
antranorgorussil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 162;BA.debugLine="VeriAl";
Debug.ShouldStop(2);
_verial();
 BA.debugLineNum = 163;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(4);
antranorgorussil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(antranorgorussil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._saat))),RemoteObject.createImmutable(" // Açıklama: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._aciklama))),RemoteObject.createImmutable(""))))),(Object)((antranorgorussil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 165;BA.debugLine="rs.Close";
Debug.ShouldStop(16);
antranorgorussil.mostCurrent._rs.runVoidMethod ("Close");
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
public static RemoteObject  _buttonantranorgorusekle_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAntranorGorusEkle_Click (antranorgorussil) ","antranorgorussil",1,antranorgorussil.mostCurrent.activityBA,antranorgorussil.mostCurrent,195);
if (RapidSub.canDelegate("buttonantranorgorusekle_click")) { return b4a.example3.antranorgorussil.remoteMe.runUserSub(false, "antranorgorussil","buttonantranorgorusekle_click");}
 BA.debugLineNum = 195;BA.debugLine="Sub ButtonAntranorGorusEkle_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 196;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(8);
antranorgorussil.mostCurrent._webview1.runMethod(true,"setVisible",antranorgorussil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 197;BA.debugLine="StartActivity(AntropometrikEkle)";
Debug.ShouldStop(16);
antranorgorussil.mostCurrent.__c.runVoidMethod ("StartActivity",antranorgorussil.processBA,(Object)((antranorgorussil.mostCurrent._antropometrikekle.getObject())));
 BA.debugLineNum = 198;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
antranorgorussil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonantranorgorustabloveri_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAntranorGorusTabloVeri_Click (antranorgorussil) ","antranorgorussil",1,antranorgorussil.mostCurrent.activityBA,antranorgorussil.mostCurrent,201);
if (RapidSub.canDelegate("buttonantranorgorustabloveri_click")) { return b4a.example3.antranorgorussil.remoteMe.runUserSub(false, "antranorgorussil","buttonantranorgorustabloveri_click");}
 BA.debugLineNum = 201;BA.debugLine="Sub ButtonAntranorGorusTabloVeri_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 202;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(512);
antranorgorussil.mostCurrent._webview1.runMethod(true,"setVisible",antranorgorussil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 203;BA.debugLine="StartActivity(AntropometrikListele)";
Debug.ShouldStop(1024);
antranorgorussil.mostCurrent.__c.runVoidMethod ("StartActivity",antranorgorussil.processBA,(Object)((antranorgorussil.mostCurrent._antropometriklistele.getObject())));
 BA.debugLineNum = 204;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
antranorgorussil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("ButtonIsim_Click (antranorgorussil) ","antranorgorussil",1,antranorgorussil.mostCurrent.activityBA,antranorgorussil.mostCurrent,181);
if (RapidSub.canDelegate("buttonisim_click")) { return b4a.example3.antranorgorussil.remoteMe.runUserSub(false, "antranorgorussil","buttonisim_click");}
int _i = 0;
 BA.debugLineNum = 181;BA.debugLine="Sub ButtonIsim_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 182;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(2097152);
antranorgorussil.mostCurrent._webview1.runMethod(true,"setVisible",antranorgorussil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 183;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(4194304);
antranorgorussil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 184;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM AntranorGo";
Debug.ShouldStop(8388608);
antranorgorussil.mostCurrent._rs.setObject(antranorgorussil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id AND denek_isim LIKE '%"),antranorgorussil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY antranorGorüsleri_id DESC")))));
 BA.debugLineNum = 186;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(33554432);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {antranorgorussil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 187;BA.debugLine="rs.Position = i";
Debug.ShouldStop(67108864);
antranorgorussil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 188;BA.debugLine="VeriAl";
Debug.ShouldStop(134217728);
_verial();
 BA.debugLineNum = 189;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(268435456);
antranorgorussil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(antranorgorussil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._saat))),RemoteObject.createImmutable(""))))),(Object)((antranorgorussil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 191;BA.debugLine="rs.Close";
Debug.ShouldStop(1073741824);
antranorgorussil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 192;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ButtonTarih_Click (antranorgorussil) ","antranorgorussil",1,antranorgorussil.mostCurrent.activityBA,antranorgorussil.mostCurrent,142);
if (RapidSub.canDelegate("buttontarih_click")) { return b4a.example3.antranorgorussil.remoteMe.runUserSub(false, "antranorgorussil","buttontarih_click");}
int _i = 0;
 BA.debugLineNum = 142;BA.debugLine="Sub ButtonTarih_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(16384);
antranorgorussil.mostCurrent._webview1.runMethod(true,"setVisible",antranorgorussil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 144;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(32768);
antranorgorussil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 145;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM AntranorGo";
Debug.ShouldStop(65536);
antranorgorussil.mostCurrent._rs.setObject(antranorgorussil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id AND antranorGorüsleri_tarih  LIKE '%"),antranorgorussil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY antranorGorüsleri_id DESC ")))));
 BA.debugLineNum = 147;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(262144);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {antranorgorussil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 148;BA.debugLine="rs.Position = i";
Debug.ShouldStop(524288);
antranorgorussil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 149;BA.debugLine="VeriAl";
Debug.ShouldStop(1048576);
_verial();
 BA.debugLineNum = 150;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(2097152);
antranorgorussil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(antranorgorussil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._saat))),RemoteObject.createImmutable(""))))),(Object)((antranorgorussil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 152;BA.debugLine="rs.Close";
Debug.ShouldStop(8388608);
antranorgorussil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("ButtonTc_Click (antranorgorussil) ","antranorgorussil",1,antranorgorussil.mostCurrent.activityBA,antranorgorussil.mostCurrent,168);
if (RapidSub.canDelegate("buttontc_click")) { return b4a.example3.antranorgorussil.remoteMe.runUserSub(false, "antranorgorussil","buttontc_click");}
int _i = 0;
 BA.debugLineNum = 168;BA.debugLine="Sub ButtonTc_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 169;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(256);
antranorgorussil.mostCurrent._webview1.runMethod(true,"setVisible",antranorgorussil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 170;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(512);
antranorgorussil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 171;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM AntranorGo";
Debug.ShouldStop(1024);
antranorgorussil.mostCurrent._rs.setObject(antranorgorussil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id AND denek_tc LIKE '%"),antranorgorussil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY antranorGorüsleri_id DESC")))));
 BA.debugLineNum = 173;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(4096);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {antranorgorussil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 174;BA.debugLine="rs.Position = i";
Debug.ShouldStop(8192);
antranorgorussil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 175;BA.debugLine="VeriAl";
Debug.ShouldStop(16384);
_verial();
 BA.debugLineNum = 176;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(32768);
antranorgorussil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(antranorgorussil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._saat))),RemoteObject.createImmutable(" "))))),(Object)((antranorgorussil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 178;BA.debugLine="rs.Close";
Debug.ShouldStop(131072);
antranorgorussil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("EditTextAra_TextChanged (antranorgorussil) ","antranorgorussil",1,antranorgorussil.mostCurrent.activityBA,antranorgorussil.mostCurrent,124);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.antranorgorussil.remoteMe.runUserSub(false, "antranorgorussil","edittextara_textchanged", _old, _new);}
int _i = 0;
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 124;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(268435456);
antranorgorussil.mostCurrent._webview1.runMethod(true,"setVisible",antranorgorussil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 126;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(536870912);
antranorgorussil.mostCurrent._labelcarpi.runMethod(true,"setVisible",antranorgorussil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 127;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(1073741824);
antranorgorussil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 128;BA.debugLine="rs = Main.sql.ExecQuery( \"SELECT * FROM AntranorG";
Debug.ShouldStop(-2147483648);
antranorgorussil.mostCurrent._rs.setObject(antranorgorussil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id AND (denek_tc LIKE '%"),antranorgorussil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR denek_isim LIKE '%"),antranorgorussil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR antranorGorüsleri_tarih LIKE '%"),antranorgorussil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR antranorGorüsleri_aciklama LIKE '%"),antranorgorussil.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%') ORDER BY antranorGorüsleri_id DESC")))));
 BA.debugLineNum = 130;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(2);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {antranorgorussil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 131;BA.debugLine="rs.Position = i";
Debug.ShouldStop(4);
antranorgorussil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 132;BA.debugLine="VeriAl";
Debug.ShouldStop(8);
_verial();
 BA.debugLineNum = 133;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(16);
antranorgorussil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(antranorgorussil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._saat))),RemoteObject.createImmutable(""))))),(Object)((antranorgorussil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 135;BA.debugLine="rs.Close";
Debug.ShouldStop(64);
antranorgorussil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 136;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",antranorgorussil.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 137;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(256);
antranorgorussil.mostCurrent._labelcarpi.runMethod(true,"setVisible",antranorgorussil.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
antranorgorussil.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ButtonTarih As Button";
antranorgorussil.mostCurrent._buttontarih = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ButtonTc As Button";
antranorgorussil.mostCurrent._buttontc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonIsim As Button";
antranorgorussil.mostCurrent._buttonisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ButtonAntranorGorusleriAciklama As Button";
antranorgorussil.mostCurrent._buttonantranorgorusleriaciklama = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ListView1 As ListView";
antranorgorussil.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private WebView1 As WebView";
antranorgorussil.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonAntranorGorusEkle As Button";
antranorgorussil.mostCurrent._buttonantranorgorusekle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ButtonAntranorGorusTabloVeri As Button";
antranorgorussil.mostCurrent._buttonantranorgorustabloveri = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim rs As ResultSet";
antranorgorussil.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim id As Int";
antranorgorussil._id = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 29;BA.debugLine="Dim tc,tarih,isim, saat, aciklama As String";
antranorgorussil.mostCurrent._tc = RemoteObject.createImmutable("");
antranorgorussil.mostCurrent._tarih = RemoteObject.createImmutable("");
antranorgorussil.mostCurrent._isim = RemoteObject.createImmutable("");
antranorgorussil.mostCurrent._saat = RemoteObject.createImmutable("");
antranorgorussil.mostCurrent._aciklama = RemoteObject.createImmutable("");
 //BA.debugLineNum = 30;BA.debugLine="Dim resim() As Byte";
antranorgorussil._resim = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 31;BA.debugLine="Dim bmp As Bitmap";
antranorgorussil.mostCurrent._bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private ButtonAnasayfa As Button";
antranorgorussil.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private LabelCarpi As Label";
antranorgorussil.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _labelcarpi_click() throws Exception{
try {
		Debug.PushSubsStack("LabelCarpi_Click (antranorgorussil) ","antranorgorussil",1,antranorgorussil.mostCurrent.activityBA,antranorgorussil.mostCurrent,212);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.antranorgorussil.remoteMe.runUserSub(false, "antranorgorussil","labelcarpi_click");}
 BA.debugLineNum = 212;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 213;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(1048576);
antranorgorussil.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 214;BA.debugLine="EditTextAra.Text = \"\"";
Debug.ShouldStop(2097152);
antranorgorussil.mostCurrent._edittextara.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 215;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(4194304);
_listviewgosterdb();
 BA.debugLineNum = 216;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("ListView1_ItemClick (antranorgorussil) ","antranorgorussil",1,antranorgorussil.mostCurrent.activityBA,antranorgorussil.mostCurrent,218);
if (RapidSub.canDelegate("listview1_itemclick")) { return b4a.example3.antranorgorussil.remoteMe.runUserSub(false, "antranorgorussil","listview1_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 218;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 219;BA.debugLine="WebView1.Visible = True";
Debug.ShouldStop(67108864);
antranorgorussil.mostCurrent._webview1.runMethod(true,"setVisible",antranorgorussil.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 220;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(134217728);
antranorgorussil.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antranorgorussil.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antranorgorussil.mostCurrent.activityBA,(Object)(antranorgorussil.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM],antranorGorüsleri_tarih As [TARİH], antranorGorüsleri_saat As [SAAT], antranorGorüsleri_aciklama As [ANTRANOR GÖRÜŞLERİ AÇIKLAMA] FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id AND antranorGorüsleri_id = '"),_value,RemoteObject.createImmutable("' "))),(Object)((antranorgorussil.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antranorgorussil.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 221;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 BA.debugLineNum = 222;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ListView1_ItemLongClick (antranorgorussil) ","antranorgorussil",1,antranorgorussil.mostCurrent.activityBA,antranorgorussil.mostCurrent,224);
if (RapidSub.canDelegate("listview1_itemlongclick")) { return b4a.example3.antranorgorussil.remoteMe.runUserSub(false, "antranorgorussil","listview1_itemlongclick", _position, _value);}
int _i = 0;
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 224;BA.debugLine="Sub ListView1_ItemLongClick (Position As Int, Valu";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 225;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM AntranorGo";
Debug.ShouldStop(1);
antranorgorussil.mostCurrent._rs.setObject(antranorgorussil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM AntranorGorusleri WHERE antranorGorüsleri_id  = '"),_value,RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 227;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(4);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {antranorgorussil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 228;BA.debugLine="rs.Position = i";
Debug.ShouldStop(8);
antranorgorussil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 229;BA.debugLine="id = rs.GetInt(\"antranorGorüsleri_id\")";
Debug.ShouldStop(16);
antranorgorussil._id = antranorgorussil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("antranorGorüsleri_id")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 231;BA.debugLine="rs.Close";
Debug.ShouldStop(64);
antranorgorussil.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 233;BA.debugLine="Dim result As Int";
Debug.ShouldStop(256);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 234;BA.debugLine="result = Msgbox2(\"Antranor görüşleri silmek isted";
Debug.ShouldStop(512);
_result = antranorgorussil.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Antranor görüşleri silmek istediğinizden emin misiniz?:")),(Object)(BA.ObjectToCharSequence("Onay Mesajı")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Hayır")),(Object)((antranorgorussil.mostCurrent.__c.getField(false,"Null"))),antranorgorussil.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 235;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, antranorgorussil.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 236;BA.debugLine="Main.sql.ExecNonQuery(\"DELETE FROM AntranorGorus";
Debug.ShouldStop(2048);
antranorgorussil.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM AntranorGorusleri WHERE antranorGorüsleri_id = '"),antranorgorussil._id,RemoteObject.createImmutable("' "))));
 BA.debugLineNum = 237;BA.debugLine="ToastMessageShow(\"Antranor Gorusleri silindi...\"";
Debug.ShouldStop(4096);
antranorgorussil.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Antranor Gorusleri silindi...")),(Object)(antranorgorussil.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 239;BA.debugLine="ListViewGosterDB";
Debug.ShouldStop(16384);
_listviewgosterdb();
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("ListViewGosterDB (antranorgorussil) ","antranorgorussil",1,antranorgorussil.mostCurrent.activityBA,antranorgorussil.mostCurrent,113);
if (RapidSub.canDelegate("listviewgosterdb")) { return b4a.example3.antranorgorussil.remoteMe.runUserSub(false, "antranorgorussil","listviewgosterdb");}
int _i = 0;
 BA.debugLineNum = 113;BA.debugLine="Sub ListViewGosterDB";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="WebView1.Visible = False";
Debug.ShouldStop(131072);
antranorgorussil.mostCurrent._webview1.runMethod(true,"setVisible",antranorgorussil.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 115;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(262144);
antranorgorussil.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 116;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM AntranorGo";
Debug.ShouldStop(524288);
antranorgorussil.mostCurrent._rs.setObject(antranorgorussil.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id ORDER BY antranorGorüsleri_id DESC"))));
 BA.debugLineNum = 117;BA.debugLine="For i=0 To rs.RowCount-1";
Debug.ShouldStop(1048576);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {antranorgorussil.mostCurrent._rs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 118;BA.debugLine="rs.Position = i";
Debug.ShouldStop(2097152);
antranorgorussil.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 119;BA.debugLine="VeriAl";
Debug.ShouldStop(4194304);
_verial();
 BA.debugLineNum = 120;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
Debug.ShouldStop(8388608);
antranorgorussil.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(antranorgorussil._id)),(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("TC: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._tc))),RemoteObject.createImmutable(" // Ad Soyad: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._isim))),RemoteObject.createImmutable(" // Tarih: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._tarih))),RemoteObject.createImmutable(" // Saat: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._saat))),RemoteObject.createImmutable(" // Açıklama: "),antranorgorussil.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((antranorgorussil.mostCurrent._aciklama))),RemoteObject.createImmutable(""))))),(Object)((antranorgorussil.mostCurrent._bmp.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("SetDivider (antranorgorussil) ","antranorgorussil",1,antranorgorussil.mostCurrent.activityBA,antranorgorussil.mostCurrent,242);
if (RapidSub.canDelegate("setdivider")) { return b4a.example3.antranorgorussil.remoteMe.runUserSub(false, "antranorgorussil","setdivider", _lv, _renk, _height);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("lv", _lv);
Debug.locals.put("Renk", _renk);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 242;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
Debug.ShouldStop(131072);
 BA.debugLineNum = 243;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(262144);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 244;BA.debugLine="r.Target = lv";
Debug.ShouldStop(524288);
_r.setField ("Target",(_lv.getObject()));
 BA.debugLineNum = 245;BA.debugLine="Dim CD As ColorDrawable";
Debug.ShouldStop(1048576);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("CD", _cd);
 BA.debugLineNum = 246;BA.debugLine="CD.Initialize(Renk, 0)";
Debug.ShouldStop(2097152);
_cd.runVoidMethod ("Initialize",(Object)(_renk),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 247;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
Debug.ShouldStop(4194304);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setDivider")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cd.getObject())})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("android.graphics.drawable.Drawable")})));
 BA.debugLineNum = 248;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
Debug.ShouldStop(8388608);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setDividerHeight")),(Object)(BA.NumberToString(_height)),(Object)(RemoteObject.createImmutable("java.lang.int")));
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
public static RemoteObject  _verial() throws Exception{
try {
		Debug.PushSubsStack("VeriAl (antranorgorussil) ","antranorgorussil",1,antranorgorussil.mostCurrent.activityBA,antranorgorussil.mostCurrent,94);
if (RapidSub.canDelegate("verial")) { return b4a.example3.antranorgorussil.remoteMe.runUserSub(false, "antranorgorussil","verial");}
RemoteObject _inputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
 BA.debugLineNum = 94;BA.debugLine="Public Sub VeriAl";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="id = rs.GetInt(\"antranorGorüsleri_id\")";
Debug.ShouldStop(1073741824);
antranorgorussil._id = antranorgorussil.mostCurrent._rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("antranorGorüsleri_id")));
 BA.debugLineNum = 96;BA.debugLine="tc = rs.GetString(\"denek_tc\")";
Debug.ShouldStop(-2147483648);
antranorgorussil.mostCurrent._tc = antranorgorussil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_tc")));
 BA.debugLineNum = 97;BA.debugLine="isim = rs.GetString(\"denek_isim\")";
Debug.ShouldStop(1);
antranorgorussil.mostCurrent._isim = antranorgorussil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denek_isim")));
 BA.debugLineNum = 98;BA.debugLine="tarih = rs.GetString(\"antranorGorüsleri_tarih\")";
Debug.ShouldStop(2);
antranorgorussil.mostCurrent._tarih = antranorgorussil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("antranorGorüsleri_tarih")));
 BA.debugLineNum = 99;BA.debugLine="saat = rs.GetString(\"antranorGorüsleri_saat\")";
Debug.ShouldStop(4);
antranorgorussil.mostCurrent._saat = antranorgorussil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("antranorGorüsleri_saat")));
 BA.debugLineNum = 100;BA.debugLine="aciklama = rs.GetString(\"antranorGorüsleri_acikla";
Debug.ShouldStop(8);
antranorgorussil.mostCurrent._aciklama = antranorgorussil.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("antranorGorüsleri_aciklama")));
 BA.debugLineNum = 101;BA.debugLine="resim = rs.GetBlob(\"denek_image\")";
Debug.ShouldStop(16);
antranorgorussil._resim = antranorgorussil.mostCurrent._rs.runMethod(false,"GetBlob",(Object)(RemoteObject.createImmutable("denek_image")));
 BA.debugLineNum = 102;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 103;BA.debugLine="Dim inputStream As InputStream";
Debug.ShouldStop(64);
_inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 104;BA.debugLine="inputStream.InitializeFromBytesArray(resim, 0, r";
Debug.ShouldStop(128);
_inputstream.runVoidMethod ("InitializeFromBytesArray",(Object)(antranorgorussil._resim),(Object)(BA.numberCast(int.class, 0)),(Object)(antranorgorussil._resim.getField(true,"length")));
 BA.debugLineNum = 105;BA.debugLine="bmp.Initialize2(inputStream)";
Debug.ShouldStop(256);
antranorgorussil.mostCurrent._bmp.runVoidMethod ("Initialize2",(Object)((_inputstream.getObject())));
 BA.debugLineNum = 106;BA.debugLine="inputStream.Close";
Debug.ShouldStop(512);
_inputstream.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",antranorgorussil.processBA, e14.toString()); BA.debugLineNum = 108;BA.debugLine="bmp = LoadBitmap(File.DirAssets, \"FotoKisi.png\")";
Debug.ShouldStop(2048);
antranorgorussil.mostCurrent._bmp = antranorgorussil.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(antranorgorussil.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("FotoKisi.png")));
 };
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}