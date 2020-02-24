package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class antropometriklistele_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (antropometriklistele) ","antropometriklistele",23,antropometriklistele.mostCurrent.activityBA,antropometriklistele.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.antropometriklistele.remoteMe.runUserSub(false, "antropometriklistele","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="Activity.LoadLayout(\"AntropometrikListelePage\")";
Debug.ShouldStop(2);
antropometriklistele.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("AntropometrikListelePage")),antropometriklistele.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(4);
antropometriklistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",antropometriklistele.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 38;BA.debugLine="EditTextAra.TextColor = Colors.White";
Debug.ShouldStop(32);
antropometriklistele.mostCurrent._edittextara.runMethod(true,"setTextColor",antropometriklistele.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 39;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
Debug.ShouldStop(64);
antropometriklistele.mostCurrent._edittextara.runMethod(true,"setHint",BA.ObjectToString("Bu alana yazarak aratabilirsiniz.."));
 BA.debugLineNum = 40;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
Debug.ShouldStop(128);
antropometriklistele.mostCurrent._edittextara.runMethod(true,"setHintColor",antropometriklistele.mostCurrent._color._hintcolor /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="EditTextAra.TextSize = 20";
Debug.ShouldStop(256);
antropometriklistele.mostCurrent._edittextara.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 42;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(512);
antropometriklistele.mostCurrent._edittextara.runMethod(false,"setTypeface",antropometriklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 44;BA.debugLine="ButtonDeriKivrimKalinligi.TextColor = Color.koyuM";
Debug.ShouldStop(2048);
antropometriklistele.mostCurrent._buttonderikivrimkalinligi.runMethod(true,"setTextColor",antropometriklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 45;BA.debugLine="ButtonDeriKivrimKalinligi.Typeface = Typeface.DEF";
Debug.ShouldStop(4096);
antropometriklistele.mostCurrent._buttonderikivrimkalinligi.runMethod(false,"setTypeface",antropometriklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 46;BA.debugLine="ButtonDeriKivrimKalinligi.Text = \"DERİ KIVRIM KAL";
Debug.ShouldStop(8192);
antropometriklistele.mostCurrent._buttonderikivrimkalinligi.runMethod(true,"setText",BA.ObjectToCharSequence("DERİ KIVRIM KALINLIĞI"));
 BA.debugLineNum = 47;BA.debugLine="ButtonDeriKivrimKalinligi.TextSize = 14";
Debug.ShouldStop(16384);
antropometriklistele.mostCurrent._buttonderikivrimkalinligi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 48;BA.debugLine="ButtonDeriKivrimKalinligi.SingleLine = True";
Debug.ShouldStop(32768);
antropometriklistele.mostCurrent._buttonderikivrimkalinligi.runVoidMethod ("setSingleLine",antropometriklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 50;BA.debugLine="ButtonAyakUzunlugu.TextColor = Color.koyuMavi";
Debug.ShouldStop(131072);
antropometriklistele.mostCurrent._buttonayakuzunlugu.runMethod(true,"setTextColor",antropometriklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 51;BA.debugLine="ButtonAyakUzunlugu.Typeface = Typeface.DEFAULT_BO";
Debug.ShouldStop(262144);
antropometriklistele.mostCurrent._buttonayakuzunlugu.runMethod(false,"setTypeface",antropometriklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 52;BA.debugLine="ButtonAyakUzunlugu.Text = \"AYAK UZUNLUĞU\"";
Debug.ShouldStop(524288);
antropometriklistele.mostCurrent._buttonayakuzunlugu.runMethod(true,"setText",BA.ObjectToCharSequence("AYAK UZUNLUĞU"));
 BA.debugLineNum = 53;BA.debugLine="ButtonAyakUzunlugu.TextSize = 14";
Debug.ShouldStop(1048576);
antropometriklistele.mostCurrent._buttonayakuzunlugu.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 54;BA.debugLine="ButtonAyakUzunlugu.SingleLine = True";
Debug.ShouldStop(2097152);
antropometriklistele.mostCurrent._buttonayakuzunlugu.runVoidMethod ("setSingleLine",antropometriklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 56;BA.debugLine="ButtonKulacUzunlugu.TextColor = Color.koyuMavi";
Debug.ShouldStop(8388608);
antropometriklistele.mostCurrent._buttonkulacuzunlugu.runMethod(true,"setTextColor",antropometriklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 57;BA.debugLine="ButtonKulacUzunlugu.Typeface = Typeface.DEFAULT_B";
Debug.ShouldStop(16777216);
antropometriklistele.mostCurrent._buttonkulacuzunlugu.runMethod(false,"setTypeface",antropometriklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 58;BA.debugLine="ButtonKulacUzunlugu.Text = \"KULAÇ UZUNLUĞU\"";
Debug.ShouldStop(33554432);
antropometriklistele.mostCurrent._buttonkulacuzunlugu.runMethod(true,"setText",BA.ObjectToCharSequence("KULAÇ UZUNLUĞU"));
 BA.debugLineNum = 59;BA.debugLine="ButtonKulacUzunlugu.TextSize = 14";
Debug.ShouldStop(67108864);
antropometriklistele.mostCurrent._buttonkulacuzunlugu.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 60;BA.debugLine="ButtonKulacUzunlugu.SingleLine = True";
Debug.ShouldStop(134217728);
antropometriklistele.mostCurrent._buttonkulacuzunlugu.runVoidMethod ("setSingleLine",antropometriklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 62;BA.debugLine="ButtonOturmaYuksekligi.TextColor = Color.koyuMavi";
Debug.ShouldStop(536870912);
antropometriklistele.mostCurrent._buttonoturmayuksekligi.runMethod(true,"setTextColor",antropometriklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 63;BA.debugLine="ButtonOturmaYuksekligi.Typeface = Typeface.DEFAUL";
Debug.ShouldStop(1073741824);
antropometriklistele.mostCurrent._buttonoturmayuksekligi.runMethod(false,"setTypeface",antropometriklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 64;BA.debugLine="ButtonOturmaYuksekligi.Text = \"OTURMA YÜKSEKLİĞİ\"";
Debug.ShouldStop(-2147483648);
antropometriklistele.mostCurrent._buttonoturmayuksekligi.runMethod(true,"setText",BA.ObjectToCharSequence("OTURMA YÜKSEKLİĞİ"));
 BA.debugLineNum = 65;BA.debugLine="ButtonOturmaYuksekligi.TextSize = 14";
Debug.ShouldStop(1);
antropometriklistele.mostCurrent._buttonoturmayuksekligi.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 66;BA.debugLine="ButtonOturmaYuksekligi.SingleLine = True";
Debug.ShouldStop(2);
antropometriklistele.mostCurrent._buttonoturmayuksekligi.runVoidMethod ("setSingleLine",antropometriklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 68;BA.debugLine="ButtonElUzunlugu.TextColor = Color.koyuMavi";
Debug.ShouldStop(8);
antropometriklistele.mostCurrent._buttoneluzunlugu.runMethod(true,"setTextColor",antropometriklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 69;BA.debugLine="ButtonElUzunlugu.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16);
antropometriklistele.mostCurrent._buttoneluzunlugu.runMethod(false,"setTypeface",antropometriklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 70;BA.debugLine="ButtonElUzunlugu.Text = \"EL UZUNLUĞU\"";
Debug.ShouldStop(32);
antropometriklistele.mostCurrent._buttoneluzunlugu.runMethod(true,"setText",BA.ObjectToCharSequence("EL UZUNLUĞU"));
 BA.debugLineNum = 71;BA.debugLine="ButtonElUzunlugu.TextSize = 14";
Debug.ShouldStop(64);
antropometriklistele.mostCurrent._buttoneluzunlugu.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 72;BA.debugLine="ButtonElUzunlugu.SingleLine = True";
Debug.ShouldStop(128);
antropometriklistele.mostCurrent._buttoneluzunlugu.runVoidMethod ("setSingleLine",antropometriklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 74;BA.debugLine="ButtonKilo.TextColor = Color.koyuMavi";
Debug.ShouldStop(512);
antropometriklistele.mostCurrent._buttonkilo.runMethod(true,"setTextColor",antropometriklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 75;BA.debugLine="ButtonKilo.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1024);
antropometriklistele.mostCurrent._buttonkilo.runMethod(false,"setTypeface",antropometriklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 76;BA.debugLine="ButtonKilo.Text = \"KİLO\"";
Debug.ShouldStop(2048);
antropometriklistele.mostCurrent._buttonkilo.runMethod(true,"setText",BA.ObjectToCharSequence("KİLO"));
 BA.debugLineNum = 77;BA.debugLine="ButtonKilo.TextSize = 14";
Debug.ShouldStop(4096);
antropometriklistele.mostCurrent._buttonkilo.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 78;BA.debugLine="ButtonKilo.SingleLine = True";
Debug.ShouldStop(8192);
antropometriklistele.mostCurrent._buttonkilo.runVoidMethod ("setSingleLine",antropometriklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 80;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
Debug.ShouldStop(32768);
antropometriklistele.mostCurrent._buttontc.runMethod(true,"setTextColor",antropometriklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 81;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(65536);
antropometriklistele.mostCurrent._buttontc.runMethod(false,"setTypeface",antropometriklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 82;BA.debugLine="ButtonTc.Text = \"TC\"";
Debug.ShouldStop(131072);
antropometriklistele.mostCurrent._buttontc.runMethod(true,"setText",BA.ObjectToCharSequence("TC"));
 BA.debugLineNum = 83;BA.debugLine="ButtonTc.TextSize = 14";
Debug.ShouldStop(262144);
antropometriklistele.mostCurrent._buttontc.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 84;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(524288);
antropometriklistele.mostCurrent._buttontc.runVoidMethod ("setSingleLine",antropometriklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 86;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
Debug.ShouldStop(2097152);
antropometriklistele.mostCurrent._buttontarih.runMethod(true,"setTextColor",antropometriklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 87;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4194304);
antropometriklistele.mostCurrent._buttontarih.runMethod(false,"setTypeface",antropometriklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 88;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
Debug.ShouldStop(8388608);
antropometriklistele.mostCurrent._buttontarih.runMethod(true,"setText",BA.ObjectToCharSequence("TARİH"));
 BA.debugLineNum = 89;BA.debugLine="ButtonTarih.TextSize = 14";
Debug.ShouldStop(16777216);
antropometriklistele.mostCurrent._buttontarih.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 90;BA.debugLine="ButtonTc.SingleLine = True";
Debug.ShouldStop(33554432);
antropometriklistele.mostCurrent._buttontc.runVoidMethod ("setSingleLine",antropometriklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 92;BA.debugLine="ButtonBoy.TextColor = Color.koyuMavi";
Debug.ShouldStop(134217728);
antropometriklistele.mostCurrent._buttonboy.runMethod(true,"setTextColor",antropometriklistele.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 93;BA.debugLine="ButtonBoy.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(268435456);
antropometriklistele.mostCurrent._buttonboy.runMethod(false,"setTypeface",antropometriklistele.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 94;BA.debugLine="ButtonBoy.Text = \"BOY\"";
Debug.ShouldStop(536870912);
antropometriklistele.mostCurrent._buttonboy.runMethod(true,"setText",BA.ObjectToCharSequence("BOY"));
 BA.debugLineNum = 95;BA.debugLine="ButtonBoy.TextSize = 14";
Debug.ShouldStop(1073741824);
antropometriklistele.mostCurrent._buttonboy.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 96;BA.debugLine="ButtonBoy.SingleLine = True";
Debug.ShouldStop(-2147483648);
antropometriklistele.mostCurrent._buttonboy.runVoidMethod ("setSingleLine",antropometriklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 98;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(2);
antropometriklistele.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",antropometriklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 99;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(4);
antropometriklistele.mostCurrent._webview1.runMethod(true,"setZoomEnabled",antropometriklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 102;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(32);
_htmlgosterdb();
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (antropometriklistele) ","antropometriklistele",23,antropometriklistele.mostCurrent.activityBA,antropometriklistele.mostCurrent,110);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.antropometriklistele.remoteMe.runUserSub(false, "antropometriklistele","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 110;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 112;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Resume (antropometriklistele) ","antropometriklistele",23,antropometriklistele.mostCurrent.activityBA,antropometriklistele.mostCurrent,106);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.antropometriklistele.remoteMe.runUserSub(false, "antropometriklistele","activity_resume");}
 BA.debugLineNum = 106;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 108;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ButtonAnasayfa_Click (antropometriklistele) ","antropometriklistele",23,antropometriklistele.mostCurrent.activityBA,antropometriklistele.mostCurrent,175);
if (RapidSub.canDelegate("buttonanasayfa_click")) { return b4a.example3.antropometriklistele.remoteMe.runUserSub(false, "antropometriklistele","buttonanasayfa_click");}
 BA.debugLineNum = 175;BA.debugLine="Sub ButtonAnasayfa_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 176;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(32768);
antropometriklistele.mostCurrent.__c.runVoidMethod ("StartActivity",antropometriklistele.processBA,(Object)((antropometriklistele.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 177;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
antropometriklistele.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buttonantropometrikekle_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAntropometrikEkle_Click (antropometriklistele) ","antropometriklistele",23,antropometriklistele.mostCurrent.activityBA,antropometriklistele.mostCurrent,170);
if (RapidSub.canDelegate("buttonantropometrikekle_click")) { return b4a.example3.antropometriklistele.remoteMe.runUserSub(false, "antropometriklistele","buttonantropometrikekle_click");}
 BA.debugLineNum = 170;BA.debugLine="Sub ButtonAntropometrikEkle_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="StartActivity(TestDenekAra)";
Debug.ShouldStop(1024);
antropometriklistele.mostCurrent.__c.runVoidMethod ("StartActivity",antropometriklistele.processBA,(Object)((antropometriklistele.mostCurrent._testdenekara.getObject())));
 BA.debugLineNum = 172;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
antropometriklistele.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonayakuzunlugu_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAyakUzunlugu_Click (antropometriklistele) ","antropometriklistele",23,antropometriklistele.mostCurrent.activityBA,antropometriklistele.mostCurrent,156);
if (RapidSub.canDelegate("buttonayakuzunlugu_click")) { return b4a.example3.antropometriklistele.remoteMe.runUserSub(false, "antropometriklistele","buttonayakuzunlugu_click");}
 BA.debugLineNum = 156;BA.debugLine="Sub ButtonAyakUzunlugu_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(268435456);
antropometriklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antropometriklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antropometriklistele.mostCurrent.activityBA,(Object)(antropometriklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT], antropometrik_ayakUzunlugu As [AYAK UZUNLUĞU] FROM Antropometrik, Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND antropometrik_ayakUzunlugu LIKE '%"),antropometriklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%'  ORDER BY antropometrik_id DESC "))),(Object)((antropometriklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antropometriklistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _buttonboy_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonBoy_Click (antropometriklistele) ","antropometriklistele",23,antropometriklistele.mostCurrent.activityBA,antropometriklistele.mostCurrent,136);
if (RapidSub.canDelegate("buttonboy_click")) { return b4a.example3.antropometriklistele.remoteMe.runUserSub(false, "antropometriklistele","buttonboy_click");}
 BA.debugLineNum = 136;BA.debugLine="Sub ButtonBoy_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(256);
antropometriklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antropometriklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antropometriklistele.mostCurrent.activityBA,(Object)(antropometriklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT],antropometrik_boy As [BOY] FROM Antropometrik,Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND antropometrik_boy LIKE '%"),antropometriklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY antropometrik_id DESC "))),(Object)((antropometriklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antropometriklistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonderikivrimkalinligi_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonDeriKivrimKalinligi_Click (antropometriklistele) ","antropometriklistele",23,antropometriklistele.mostCurrent.activityBA,antropometriklistele.mostCurrent,160);
if (RapidSub.canDelegate("buttonderikivrimkalinligi_click")) { return b4a.example3.antropometriklistele.remoteMe.runUserSub(false, "antropometriklistele","buttonderikivrimkalinligi_click");}
 BA.debugLineNum = 160;BA.debugLine="Sub ButtonDeriKivrimKalinligi_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 161;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(1);
antropometriklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antropometriklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antropometriklistele.mostCurrent.activityBA,(Object)(antropometriklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT], antropometrik_deriKivrimKalinligi As [DERİ KIVRIM KALINLIĞI] FROM Antropometrik, Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND antropometrik_deriKivrimKalinligi LIKE '%"),antropometriklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%'  ORDER BY antropometrik_id DESC "))),(Object)((antropometriklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antropometriklistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttoneluzunlugu_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonElUzunlugu_Click (antropometriklistele) ","antropometriklistele",23,antropometriklistele.mostCurrent.activityBA,antropometriklistele.mostCurrent,144);
if (RapidSub.canDelegate("buttoneluzunlugu_click")) { return b4a.example3.antropometriklistele.remoteMe.runUserSub(false, "antropometriklistele","buttoneluzunlugu_click");}
 BA.debugLineNum = 144;BA.debugLine="Sub ButtonElUzunlugu_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(65536);
antropometriklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antropometriklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antropometriklistele.mostCurrent.activityBA,(Object)(antropometriklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT], antropometrik_elUzunlugu As [EL UZUNLUĞU] FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_elUzunlugu LIKE '%"),antropometriklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%'  ORDER BY antropometrik_id DESC "))),(Object)((antropometriklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antropometriklistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonkilo_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonKilo_Click (antropometriklistele) ","antropometriklistele",23,antropometriklistele.mostCurrent.activityBA,antropometriklistele.mostCurrent,140);
if (RapidSub.canDelegate("buttonkilo_click")) { return b4a.example3.antropometriklistele.remoteMe.runUserSub(false, "antropometriklistele","buttonkilo_click");}
 BA.debugLineNum = 140;BA.debugLine="Sub ButtonKilo_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(4096);
antropometriklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antropometriklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antropometriklistele.mostCurrent.activityBA,(Object)(antropometriklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT], antropometrik_kilo As [KİLO] FROM Antropometrik,Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND antropometrik_kilo LIKE '%"),antropometriklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%'  ORDER BY antropometrik_id DESC "))),(Object)((antropometriklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antropometriklistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _buttonkulacuzunlugu_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonKulacUzunlugu_Click (antropometriklistele) ","antropometriklistele",23,antropometriklistele.mostCurrent.activityBA,antropometriklistele.mostCurrent,148);
if (RapidSub.canDelegate("buttonkulacuzunlugu_click")) { return b4a.example3.antropometriklistele.remoteMe.runUserSub(false, "antropometriklistele","buttonkulacuzunlugu_click");}
 BA.debugLineNum = 148;BA.debugLine="Sub ButtonKulacUzunlugu_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 149;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(1048576);
antropometriklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antropometriklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antropometriklistele.mostCurrent.activityBA,(Object)(antropometriklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT], antropometrik_kulacUzunlugu As [KULAÇ UZUNLUĞU] FROM Antropometrik, Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND  antropometrik_kulacUzunlugu LIKE '%"),antropometriklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%'  ORDER BY antropometrik_id DESC "))),(Object)((antropometriklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antropometriklistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonoturmayuksekligi_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonOturmaYuksekligi_Click (antropometriklistele) ","antropometriklistele",23,antropometriklistele.mostCurrent.activityBA,antropometriklistele.mostCurrent,152);
if (RapidSub.canDelegate("buttonoturmayuksekligi_click")) { return b4a.example3.antropometriklistele.remoteMe.runUserSub(false, "antropometriklistele","buttonoturmayuksekligi_click");}
 BA.debugLineNum = 152;BA.debugLine="Sub ButtonOturmaYuksekligi_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 153;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(16777216);
antropometriklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antropometriklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antropometriklistele.mostCurrent.activityBA,(Object)(antropometriklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT], antropometrik_oturmaYuksekligi As [OTURMA UZUNLUĞU] FROM Antropometrik,Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND antropometrik_oturmaYuksekligi LIKE '%"),antropometriklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%'  ORDER BY antropometrik_id DESC "))),(Object)((antropometriklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antropometriklistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _buttonsil_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSil_Click (antropometriklistele) ","antropometriklistele",23,antropometriklistele.mostCurrent.activityBA,antropometriklistele.mostCurrent,165);
if (RapidSub.canDelegate("buttonsil_click")) { return b4a.example3.antropometriklistele.remoteMe.runUserSub(false, "antropometriklistele","buttonsil_click");}
 BA.debugLineNum = 165;BA.debugLine="Sub ButtonSil_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="StartActivity(AntropometrikSil)";
Debug.ShouldStop(32);
antropometriklistele.mostCurrent.__c.runVoidMethod ("StartActivity",antropometriklistele.processBA,(Object)((antropometriklistele.mostCurrent._antropometriksil.getObject())));
 BA.debugLineNum = 167;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
antropometriklistele.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("ButtonTarih_Click (antropometriklistele) ","antropometriklistele",23,antropometriklistele.mostCurrent.activityBA,antropometriklistele.mostCurrent,128);
if (RapidSub.canDelegate("buttontarih_click")) { return b4a.example3.antropometriklistele.remoteMe.runUserSub(false, "antropometriklistele","buttontarih_click");}
 BA.debugLineNum = 128;BA.debugLine="Sub ButtonTarih_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(1);
antropometriklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antropometriklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antropometriklistele.mostCurrent.activityBA,(Object)(antropometriklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT] FROM Antropometrik,Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND antropometrik_tarih LIKE '%"),antropometriklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%'  ORDER BY antropometrik_id DESC "))),(Object)((antropometriklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antropometriklistele.mostCurrent.__c.getField(true,"False")))));
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
public static RemoteObject  _buttontc_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTc_Click (antropometriklistele) ","antropometriklistele",23,antropometriklistele.mostCurrent.activityBA,antropometriklistele.mostCurrent,132);
if (RapidSub.canDelegate("buttontc_click")) { return b4a.example3.antropometriklistele.remoteMe.runUserSub(false, "antropometriklistele","buttontc_click");}
 BA.debugLineNum = 132;BA.debugLine="Sub ButtonTc_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(16);
antropometriklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antropometriklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antropometriklistele.mostCurrent.activityBA,(Object)(antropometriklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [Denek TC],denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT] FROM Antropometrik,Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND denek_tc LIKE '%"),antropometriklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' ORDER BY antropometrik_id DESC  "))),(Object)((antropometriklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antropometriklistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("EditTextAra_TextChanged (antropometriklistele) ","antropometriklistele",23,antropometriklistele.mostCurrent.activityBA,antropometriklistele.mostCurrent,119);
if (RapidSub.canDelegate("edittextara_textchanged")) { return b4a.example3.antropometriklistele.remoteMe.runUserSub(false, "antropometriklistele","edittextara_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 119;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="LabelCarpi.Visible = True";
Debug.ShouldStop(8388608);
antropometriklistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",antropometriklistele.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 121;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
Debug.ShouldStop(16777216);
antropometriklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antropometriklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antropometriklistele.mostCurrent.activityBA,(Object)(antropometriklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc  As [Denek TC],antropometrik_tarih As [TARİH], antropometrik_saat As [SAAT],antropometrik_boy As [BOY],antropometrik_kilo As [KİLO],antropometrik_elUzunlugu As [EL UZUNLUĞU],antropometrik_kulacUzunlugu As [KULAÇ UZUNLUĞU],antropometrik_oturmaYuksekligi As [OTURMA YÜKSEKLİĞİ],antropometrik_ayakUzunlugu As [AYAK UZUNLUĞU],antropometrik_deriKivrimKalinligi As [DERİ KIVRIM KALINLIĞI] FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id AND (denek_tc LIKE '%"),antropometriklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR antropometrik_tarih LIKE '%"),antropometriklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR antropometrik_boy LIKE '%"),antropometriklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%' OR antropometrik_kilo LIKE '%"),antropometriklistele.mostCurrent._edittextara.runMethod(true,"getText"),RemoteObject.createImmutable("%') ORDER BY antropometrik_id DESC"))),(Object)((antropometriklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antropometriklistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 122;BA.debugLine="If EditTextAra.Text = \"\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",antropometriklistele.mostCurrent._edittextara.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 123;BA.debugLine="LabelCarpi.Visible = False";
Debug.ShouldStop(67108864);
antropometriklistele.mostCurrent._labelcarpi.runMethod(true,"setVisible",antropometriklistele.mostCurrent.__c.getField(true,"False"));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private EditTextAra As EditText";
antropometriklistele.mostCurrent._edittextara = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private WebView1 As WebView";
antropometriklistele.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ButtonTarih As Button";
antropometriklistele.mostCurrent._buttontarih = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonKulacUzunlugu As Button";
antropometriklistele.mostCurrent._buttonkulacuzunlugu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ButtonDeriKivrimKalinligi As Button";
antropometriklistele.mostCurrent._buttonderikivrimkalinligi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ButtonAyakUzunlugu As Button";
antropometriklistele.mostCurrent._buttonayakuzunlugu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ButtonOturmaYuksekligi As Button";
antropometriklistele.mostCurrent._buttonoturmayuksekligi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ButtonElUzunlugu As Button";
antropometriklistele.mostCurrent._buttoneluzunlugu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonKilo As Button";
antropometriklistele.mostCurrent._buttonkilo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ButtonBoy As Button";
antropometriklistele.mostCurrent._buttonboy = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ButtonTc As Button";
antropometriklistele.mostCurrent._buttontc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ButtonAnasayfa As Button";
antropometriklistele.mostCurrent._buttonanasayfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private LabelCarpi As Label";
antropometriklistele.mostCurrent._labelcarpi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _htmlgosterdb() throws Exception{
try {
		Debug.PushSubsStack("HTMLGosterDB (antropometriklistele) ","antropometriklistele",23,antropometriklistele.mostCurrent.activityBA,antropometriklistele.mostCurrent,114);
if (RapidSub.canDelegate("htmlgosterdb")) { return b4a.example3.antropometriklistele.remoteMe.runUserSub(false, "antropometriklistele","htmlgosterdb");}
 BA.debugLineNum = 114;BA.debugLine="Sub HTMLGosterDB";
Debug.ShouldStop(131072);
 BA.debugLineNum = 116;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(524288);
antropometriklistele.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antropometriklistele.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antropometriklistele.mostCurrent.activityBA,(Object)(antropometriklistele.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(BA.ObjectToString("SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] , antropometrik_tarih As [TARİH], antropometrik_saat As [SAAT],antropometrik_boy As [BOY] , antropometrik_kilo As [KİLO],antropometrik_elUzunlugu As [EL UZUNLUĞU],antropometrik_kulacUzunlugu As [KULAÇ UZUNLUĞU],antropometrik_oturmaYuksekligi As [OTURMA YÜKSEKLİĞİ],antropometrik_ayakUzunlugu As [AYAK UZUNLUĞU],antropometrik_deriKivrimKalinligi As [DERİ KIVRIM KALINLIĞI] FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id ORDER BY antropometrik_id DESC")),(Object)((antropometriklistele.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antropometriklistele.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("LabelCarpi_Click (antropometriklistele) ","antropometriklistele",23,antropometriklistele.mostCurrent.activityBA,antropometriklistele.mostCurrent,180);
if (RapidSub.canDelegate("labelcarpi_click")) { return b4a.example3.antropometriklistele.remoteMe.runUserSub(false, "antropometriklistele","labelcarpi_click");}
 BA.debugLineNum = 180;BA.debugLine="Sub LabelCarpi_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 181;BA.debugLine="EditTextAra.SelectAll";
Debug.ShouldStop(1048576);
antropometriklistele.mostCurrent._edittextara.runVoidMethod ("SelectAll");
 BA.debugLineNum = 182;BA.debugLine="EditTextAra.Text = \"\"";
Debug.ShouldStop(2097152);
antropometriklistele.mostCurrent._edittextara.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 183;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(4194304);
_htmlgosterdb();
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}