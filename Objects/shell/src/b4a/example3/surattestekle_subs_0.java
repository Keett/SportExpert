package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class surattestekle_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,53);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","activity_create", _firsttime);}
RemoteObject _now = RemoteObject.createImmutable(0L);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 53;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="Activity.LoadLayout(\"SuratTestEklePage\")";
Debug.ShouldStop(4194304);
surattestekle.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SuratTestEklePage")),surattestekle.mostCurrent.activityBA);
 BA.debugLineNum = 56;BA.debugLine="ReadBlob";
Debug.ShouldStop(8388608);
_readblob();
 BA.debugLineNum = 58;BA.debugLine="ButtonOK.Visible = False";
Debug.ShouldStop(33554432);
surattestekle.mostCurrent._buttonok.runMethod(true,"setVisible",surattestekle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 59;BA.debugLine="ButtonOK.Enabled = False";
Debug.ShouldStop(67108864);
surattestekle.mostCurrent._buttonok.runMethod(true,"setEnabled",surattestekle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 61;BA.debugLine="ButtonBaslamaSuresi.Tag = \"SureBasla\"  ' --------";
Debug.ShouldStop(268435456);
surattestekle.mostCurrent._buttonbaslamasuresi.runMethod(false,"setTag",RemoteObject.createImmutable(("SureBasla")));
 BA.debugLineNum = 64;BA.debugLine="ListView1.SingleLineLayout.Label.TextColor = Colo";
Debug.ShouldStop(-2147483648);
surattestekle.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",surattestekle.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 65;BA.debugLine="ListView1.SingleLineLayout.Label.TextSize = 20";
Debug.ShouldStop(1);
surattestekle.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 66;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
Debug.ShouldStop(2);
_setdivider(surattestekle.mostCurrent._listview1,surattestekle.mostCurrent._color._acikmavi /*RemoteObject*/ ,surattestekle.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 68;BA.debugLine="LabelDenekIsim.Text = TestDenekAra.denekIsim";
Debug.ShouldStop(8);
surattestekle.mostCurrent._labeldenekisim.runMethod(true,"setText",BA.ObjectToCharSequence(surattestekle.mostCurrent._testdenekara._denekisim /*RemoteObject*/ ));
 BA.debugLineNum = 69;BA.debugLine="LabelDenekIsim.TextSize = 20";
Debug.ShouldStop(16);
surattestekle.mostCurrent._labeldenekisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 70;BA.debugLine="LabelDenekIsim.TextColor = Colors.White";
Debug.ShouldStop(32);
surattestekle.mostCurrent._labeldenekisim.runMethod(true,"setTextColor",surattestekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 71;BA.debugLine="LabelDenekIsim.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(64);
surattestekle.mostCurrent._labeldenekisim.runMethod(false,"setTypeface",surattestekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 73;BA.debugLine="LabelGateSayisi.Text = $\" Bağlı Kapı Sayısı: ${Su";
Debug.ShouldStop(256);
surattestekle.mostCurrent._labelgatesayisi.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(" Bağlı Kapı Sayısı: "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestekle.mostCurrent._surattestayar._gate /*RemoteObject*/ ))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 74;BA.debugLine="LabelGateSayisi.TextSize = 20";
Debug.ShouldStop(512);
surattestekle.mostCurrent._labelgatesayisi.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 75;BA.debugLine="LabelGateSayisi.TextColor = Colors.White";
Debug.ShouldStop(1024);
surattestekle.mostCurrent._labelgatesayisi.runMethod(true,"setTextColor",surattestekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 76;BA.debugLine="LabelGateSayisi.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2048);
surattestekle.mostCurrent._labelgatesayisi.runMethod(false,"setTypeface",surattestekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 78;BA.debugLine="LabelSetSayisi.Text = $\" Set Sayısı: ${SuratTestA";
Debug.ShouldStop(8192);
surattestekle.mostCurrent._labelsetsayisi.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(" Set Sayısı: "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestekle.mostCurrent._surattestayar._set /*RemoteObject*/ ))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 79;BA.debugLine="LabelSetSayisi.TextSize = 20";
Debug.ShouldStop(16384);
surattestekle.mostCurrent._labelsetsayisi.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 80;BA.debugLine="LabelSetSayisi.TextColor = Colors.White";
Debug.ShouldStop(32768);
surattestekle.mostCurrent._labelsetsayisi.runMethod(true,"setTextColor",surattestekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 81;BA.debugLine="LabelSetSayisi.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(65536);
surattestekle.mostCurrent._labelsetsayisi.runMethod(false,"setTypeface",surattestekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 83;BA.debugLine="LabelTestIsim.Text = MotorOzellikMenu.motorOzelli";
Debug.ShouldStop(262144);
surattestekle.mostCurrent._labeltestisim.runMethod(true,"setText",BA.ObjectToCharSequence(surattestekle.mostCurrent._motorozellikmenu._motorozelliktestadi /*RemoteObject*/ ));
 BA.debugLineNum = 84;BA.debugLine="LabelTestIsim.TextSize = 20";
Debug.ShouldStop(524288);
surattestekle.mostCurrent._labeltestisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 85;BA.debugLine="LabelTestIsim.TextColor = Colors.White";
Debug.ShouldStop(1048576);
surattestekle.mostCurrent._labeltestisim.runMethod(true,"setTextColor",surattestekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 86;BA.debugLine="LabelTestIsim.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2097152);
surattestekle.mostCurrent._labeltestisim.runMethod(false,"setTypeface",surattestekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 88;BA.debugLine="LabelModIsim.Text = $\"Seçili Mod: ${SuratTestAyar";
Debug.ShouldStop(8388608);
surattestekle.mostCurrent._labelmodisim.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Seçili Mod: "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestekle.mostCurrent._surattestayar._secilenmode /*RemoteObject*/ ))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 89;BA.debugLine="LabelModIsim.TextSize = 20";
Debug.ShouldStop(16777216);
surattestekle.mostCurrent._labelmodisim.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 90;BA.debugLine="LabelModIsim.TextColor = Colors.White";
Debug.ShouldStop(33554432);
surattestekle.mostCurrent._labelmodisim.runMethod(true,"setTextColor",surattestekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 91;BA.debugLine="LabelModIsim.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(67108864);
surattestekle.mostCurrent._labelmodisim.runMethod(false,"setTypeface",surattestekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 93;BA.debugLine="LabelResult.Text = $\"#Max. Result = ${SuratTestAy";
Debug.ShouldStop(268435456);
surattestekle.mostCurrent._labelresult.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("#Max. Result = "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestekle.mostCurrent._surattestayar._result /*RemoteObject*/ ))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 94;BA.debugLine="LabelResult.TextSize = 20";
Debug.ShouldStop(536870912);
surattestekle.mostCurrent._labelresult.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 95;BA.debugLine="LabelResult.TextColor = Colors.White";
Debug.ShouldStop(1073741824);
surattestekle.mostCurrent._labelresult.runMethod(true,"setTextColor",surattestekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 96;BA.debugLine="LabelResult.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(-2147483648);
surattestekle.mostCurrent._labelresult.runMethod(false,"setTypeface",surattestekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 98;BA.debugLine="LabelTımeDegerleri.Text = $\"TIME DEĞERLERİ\"$";
Debug.ShouldStop(2);
surattestekle.mostCurrent._labeltımedegerleri.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.createImmutable("TIME DEĞERLERİ"))));
 BA.debugLineNum = 99;BA.debugLine="LabelTımeDegerleri.TextSize = 20";
Debug.ShouldStop(4);
surattestekle.mostCurrent._labeltımedegerleri.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 100;BA.debugLine="LabelTımeDegerleri.TextColor = Colors.White";
Debug.ShouldStop(8);
surattestekle.mostCurrent._labeltımedegerleri.runMethod(true,"setTextColor",surattestekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 101;BA.debugLine="LabelTımeDegerleri.Typeface = Typeface.DEFAULT_BO";
Debug.ShouldStop(16);
surattestekle.mostCurrent._labeltımedegerleri.runMethod(false,"setTypeface",surattestekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 103;BA.debugLine="Dim now As Long = DateTime.Now";
Debug.ShouldStop(64);
_now = surattestekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("now", _now);Debug.locals.put("now", _now);
 BA.debugLineNum = 104;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
Debug.ShouldStop(128);
surattestekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 105;BA.debugLine="secilenTarih = DateTime.Date(now)";
Debug.ShouldStop(256);
surattestekle._secilentarih = surattestekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_now));
 BA.debugLineNum = 106;BA.debugLine="secilenSaat = DateTime.Time(now)";
Debug.ShouldStop(512);
surattestekle._secilensaat = surattestekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_now));
 BA.debugLineNum = 108;BA.debugLine="LabelDate.Text = $\"Tarih: ${secilenTarih} Zaman:";
Debug.ShouldStop(2048);
surattestekle.mostCurrent._labeldate.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Tarih: "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestekle._secilentarih))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("Zaman: "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestekle._secilensaat))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 110;BA.debugLine="LabelDate.TextSize = 20";
Debug.ShouldStop(8192);
surattestekle.mostCurrent._labeldate.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 111;BA.debugLine="LabelDate.TextColor = Colors.White";
Debug.ShouldStop(16384);
surattestekle.mostCurrent._labeldate.runMethod(true,"setTextColor",surattestekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 112;BA.debugLine="LabelDate.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(32768);
surattestekle.mostCurrent._labeldate.runMethod(false,"setTypeface",surattestekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 115;BA.debugLine="Chronometer.Initialize(\"Chronometer\",10)";
Debug.ShouldStop(262144);
surattestekle._chronometer.runVoidMethod ("Initialize",surattestekle.processBA,(Object)(BA.ObjectToString("Chronometer")),(Object)(BA.numberCast(long.class, 10)));
 BA.debugLineNum = 116;BA.debugLine="StartTime = DateTime.Now";
Debug.ShouldStop(524288);
surattestekle._starttime = surattestekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");
 BA.debugLineNum = 117;BA.debugLine="timer.Initialize(\"timer\", 1000)";
Debug.ShouldStop(1048576);
surattestekle._timer.runVoidMethod ("Initialize",surattestekle.processBA,(Object)(BA.ObjectToString("timer")),(Object)(BA.numberCast(long.class, 1000)));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,125);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 125;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(268435456);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,121);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","activity_resume");}
 BA.debugLineNum = 121;BA.debugLine="Sub Activity_Resume";
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
public static RemoteObject  _buttonayarlar_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAyarlar_Click (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,303);
if (RapidSub.canDelegate("buttonayarlar_click")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","buttonayarlar_click");}
 BA.debugLineNum = 303;BA.debugLine="Sub ButtonAyarlar_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 304;BA.debugLine="Pause";
Debug.ShouldStop(32768);
_pause();
 BA.debugLineNum = 305;BA.debugLine="StartActivity(SuratTestAyar)";
Debug.ShouldStop(65536);
surattestekle.mostCurrent.__c.runVoidMethod ("StartActivity",surattestekle.processBA,(Object)((surattestekle.mostCurrent._surattestayar.getObject())));
 BA.debugLineNum = 306;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
surattestekle.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 307;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonbaslamasuresi_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonBaslamaSuresi_Click (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,273);
if (RapidSub.canDelegate("buttonbaslamasuresi_click")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","buttonbaslamasuresi_click");}
 BA.debugLineNum = 273;BA.debugLine="Sub ButtonBaslamaSuresi_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 274;BA.debugLine="If ButtonBaslamaSuresi.Tag = \"SureBasla\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",surattestekle.mostCurrent._buttonbaslamasuresi.runMethod(false,"getTag"),RemoteObject.createImmutable(("SureBasla")))) { 
 BA.debugLineNum = 275;BA.debugLine="ButtonLap.Visible = False";
Debug.ShouldStop(262144);
surattestekle.mostCurrent._buttonlap.runMethod(true,"setVisible",surattestekle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 276;BA.debugLine="ButtonReset.Visible = False";
Debug.ShouldStop(524288);
surattestekle.mostCurrent._buttonreset.runMethod(true,"setVisible",surattestekle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 277;BA.debugLine="If i == SuratTestAyar.result Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",surattestekle._i,BA.numberCast(double.class, surattestekle.mostCurrent._surattestayar._result /*RemoteObject*/ ))) { 
 BA.debugLineNum = 278;BA.debugLine="Pause";
Debug.ShouldStop(2097152);
_pause();
 BA.debugLineNum = 279;BA.debugLine="LabelChronometer.Text = \"Test Bitti\"";
Debug.ShouldStop(4194304);
surattestekle.mostCurrent._labelchronometer.runMethod(true,"setText",BA.ObjectToCharSequence("Test Bitti"));
 }else {
 BA.debugLineNum = 281;BA.debugLine="LabelChronometer.Visible = False";
Debug.ShouldStop(16777216);
surattestekle.mostCurrent._labelchronometer.runMethod(true,"setVisible",surattestekle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 282;BA.debugLine="LabelTimer.Visible = True";
Debug.ShouldStop(33554432);
surattestekle.mostCurrent._labeltimer.runMethod(true,"setVisible",surattestekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 283;BA.debugLine="StartTimer(SuratTestAyar.degerDakika,SuratTestA";
Debug.ShouldStop(67108864);
_starttimer(surattestekle.mostCurrent._surattestayar._degerdakika /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {surattestekle.mostCurrent._surattestayar._degersaniye /*RemoteObject*/ ,RemoteObject.createImmutable(2)}, "+",1, 1));
 };
 BA.debugLineNum = 286;BA.debugLine="ButtonBaslamaSuresi.Tag =\"SureBitir\"";
Debug.ShouldStop(536870912);
surattestekle.mostCurrent._buttonbaslamasuresi.runMethod(false,"setTag",RemoteObject.createImmutable(("SureBitir")));
 BA.debugLineNum = 287;BA.debugLine="ButtonBaslamaSuresi.Text = \"Çıkış yaptı\"";
Debug.ShouldStop(1073741824);
surattestekle.mostCurrent._buttonbaslamasuresi.runMethod(true,"setText",BA.ObjectToCharSequence("Çıkış yaptı"));
 }else 
{ BA.debugLineNum = 289;BA.debugLine="Else if ButtonBaslamaSuresi.Tag = \"SureBitir\" The";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",surattestekle.mostCurrent._buttonbaslamasuresi.runMethod(false,"getTag"),RemoteObject.createImmutable(("SureBitir")))) { 
 BA.debugLineNum = 290;BA.debugLine="ButtonReset.Visible = True";
Debug.ShouldStop(2);
surattestekle.mostCurrent._buttonreset.runMethod(true,"setVisible",surattestekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 291;BA.debugLine="ButtonLap.Visible = True";
Debug.ShouldStop(4);
surattestekle.mostCurrent._buttonlap.runMethod(true,"setVisible",surattestekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 293;BA.debugLine="DinlenmeCikisSureYakalama";
Debug.ShouldStop(16);
_dinlenmecikissureyakalama();
 BA.debugLineNum = 294;BA.debugLine="LabelTimer.Visible = False";
Debug.ShouldStop(32);
surattestekle.mostCurrent._labeltimer.runMethod(true,"setVisible",surattestekle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 295;BA.debugLine="LabelChronometer.Visible = True";
Debug.ShouldStop(64);
surattestekle.mostCurrent._labelchronometer.runMethod(true,"setVisible",surattestekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 296;BA.debugLine="Start";
Debug.ShouldStop(128);
_start();
 BA.debugLineNum = 297;BA.debugLine="ButtonBaslamaSuresi.Tag = \"SureBasla\"";
Debug.ShouldStop(256);
surattestekle.mostCurrent._buttonbaslamasuresi.runMethod(false,"setTag",RemoteObject.createImmutable(("SureBasla")));
 BA.debugLineNum = 298;BA.debugLine="ButtonBaslamaSuresi.Text = \"Dinleniş süresi başl";
Debug.ShouldStop(512);
surattestekle.mostCurrent._buttonbaslamasuresi.runMethod(true,"setText",BA.ObjectToCharSequence("Dinleniş süresi başlat"));
 }}
;
 BA.debugLineNum = 301;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonlap_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonLap_Click (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,218);
if (RapidSub.canDelegate("buttonlap_click")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","buttonlap_click");}
RemoteObject _lapdeger = RemoteObject.createImmutable("");
RemoteObject _splitdeger = RemoteObject.createImmutable("");
RemoteObject _restdeger = RemoteObject.createImmutable("");
 BA.debugLineNum = 218;BA.debugLine="Sub ButtonLap_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 219;BA.debugLine="If i < SuratTestAyar.result  Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("<",surattestekle._i,BA.numberCast(double.class, surattestekle.mostCurrent._surattestayar._result /*RemoteObject*/ ))) { 
 BA.debugLineNum = 220;BA.debugLine="If SuratTestAyar.secilenMode = \"Lap Mode\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",surattestekle.mostCurrent._surattestayar._secilenmode /*RemoteObject*/ ,BA.ObjectToString("Lap Mode"))) { 
 BA.debugLineNum = 221;BA.debugLine="Dim LapDeger As String = LabelChronometer.Text";
Debug.ShouldStop(268435456);
_lapdeger = surattestekle.mostCurrent._labelchronometer.runMethod(true,"getText");Debug.locals.put("LapDeger", _lapdeger);Debug.locals.put("LapDeger", _lapdeger);
 BA.debugLineNum = 222;BA.debugLine="ListView1.AddSingleLine($\"Lap Deger : ${i}";
Debug.ShouldStop(536870912);
surattestekle.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Lap Deger : "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestekle._i))),RemoteObject.createImmutable("                 =>>            "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lapdeger))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 223;BA.debugLine="dizi(i) = LapDeger";
Debug.ShouldStop(1073741824);
surattestekle.mostCurrent._dizi.setArrayElement (_lapdeger,surattestekle._i);
 }else 
{ BA.debugLineNum = 224;BA.debugLine="Else If SuratTestAyar.secilenMode = \"Split Mode\"";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",surattestekle.mostCurrent._surattestayar._secilenmode /*RemoteObject*/ ,BA.ObjectToString("Split Mode"))) { 
 BA.debugLineNum = 225;BA.debugLine="Dim splitDeger As String = LabelChronometer.Tex";
Debug.ShouldStop(1);
_splitdeger = surattestekle.mostCurrent._labelchronometer.runMethod(true,"getText");Debug.locals.put("splitDeger", _splitdeger);Debug.locals.put("splitDeger", _splitdeger);
 BA.debugLineNum = 226;BA.debugLine="ListView1.AddSingleLine($\"Split Deger : ${i}";
Debug.ShouldStop(2);
surattestekle.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Split Deger : "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestekle._i))),RemoteObject.createImmutable("               =>>            "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_splitdeger))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 227;BA.debugLine="dizi(i) = splitDeger";
Debug.ShouldStop(4);
surattestekle.mostCurrent._dizi.setArrayElement (_splitdeger,surattestekle._i);
 BA.debugLineNum = 228;BA.debugLine="ButtonReset_Click";
Debug.ShouldStop(8);
_buttonreset_click();
 }else 
{ BA.debugLineNum = 229;BA.debugLine="Else If SuratTestAyar.secilenMode = \"Rest Mode\"";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",surattestekle.mostCurrent._surattestayar._secilenmode /*RemoteObject*/ ,BA.ObjectToString("Rest Mode"))) { 
 BA.debugLineNum = 230;BA.debugLine="Dim restDeger As String = LabelChronometer.Text";
Debug.ShouldStop(32);
_restdeger = surattestekle.mostCurrent._labelchronometer.runMethod(true,"getText");Debug.locals.put("restDeger", _restdeger);Debug.locals.put("restDeger", _restdeger);
 BA.debugLineNum = 231;BA.debugLine="ListView1.AddSingleLine($\"Rest Deger : ${i}";
Debug.ShouldStop(64);
surattestekle.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Rest Deger : "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestekle._i))),RemoteObject.createImmutable("                =>>            "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_restdeger))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 232;BA.debugLine="dizi(i) = restDeger";
Debug.ShouldStop(128);
surattestekle.mostCurrent._dizi.setArrayElement (_restdeger,surattestekle._i);
 BA.debugLineNum = 233;BA.debugLine="If i Mod SuratTestAyar.restDegerBul == 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {surattestekle._i,surattestekle.mostCurrent._surattestayar._restdegerbul /*RemoteObject*/ }, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 234;BA.debugLine="Pause";
Debug.ShouldStop(512);
_pause();
 BA.debugLineNum = 235;BA.debugLine="ButtonBaslamaSuresi_Click";
Debug.ShouldStop(1024);
_buttonbaslamasuresi_click();
 };
 }}}
;
 }else 
{ BA.debugLineNum = 238;BA.debugLine="Else if i == SuratTestAyar.result Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",surattestekle._i,BA.numberCast(double.class, surattestekle.mostCurrent._surattestayar._result /*RemoteObject*/ ))) { 
 BA.debugLineNum = 239;BA.debugLine="If SuratTestAyar.secilenMode = \"Lap Mode\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",surattestekle.mostCurrent._surattestayar._secilenmode /*RemoteObject*/ ,BA.ObjectToString("Lap Mode"))) { 
 BA.debugLineNum = 240;BA.debugLine="Dim LapDeger As String = LabelChronometer.Text";
Debug.ShouldStop(32768);
_lapdeger = surattestekle.mostCurrent._labelchronometer.runMethod(true,"getText");Debug.locals.put("LapDeger", _lapdeger);Debug.locals.put("LapDeger", _lapdeger);
 BA.debugLineNum = 241;BA.debugLine="ListView1.AddSingleLine($\"Lap Deger : ${i}";
Debug.ShouldStop(65536);
surattestekle.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Lap Deger : "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestekle._i))),RemoteObject.createImmutable("                 =>>            "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lapdeger))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 242;BA.debugLine="dizi(i) = LapDeger";
Debug.ShouldStop(131072);
surattestekle.mostCurrent._dizi.setArrayElement (_lapdeger,surattestekle._i);
 }else 
{ BA.debugLineNum = 243;BA.debugLine="Else If SuratTestAyar.secilenMode = \"Split Mode\"";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",surattestekle.mostCurrent._surattestayar._secilenmode /*RemoteObject*/ ,BA.ObjectToString("Split Mode"))) { 
 BA.debugLineNum = 244;BA.debugLine="Dim splitDeger As String = LabelChronometer.Tex";
Debug.ShouldStop(524288);
_splitdeger = surattestekle.mostCurrent._labelchronometer.runMethod(true,"getText");Debug.locals.put("splitDeger", _splitdeger);Debug.locals.put("splitDeger", _splitdeger);
 BA.debugLineNum = 245;BA.debugLine="ListView1.AddSingleLine($\"Split Deger : ${i}";
Debug.ShouldStop(1048576);
surattestekle.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Split Deger : "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestekle._i))),RemoteObject.createImmutable("               =>>            "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_splitdeger))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 246;BA.debugLine="dizi(i) = splitDeger";
Debug.ShouldStop(2097152);
surattestekle.mostCurrent._dizi.setArrayElement (_splitdeger,surattestekle._i);
 }else 
{ BA.debugLineNum = 247;BA.debugLine="Else If SuratTestAyar.secilenMode = \"Rest Mode\"";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",surattestekle.mostCurrent._surattestayar._secilenmode /*RemoteObject*/ ,BA.ObjectToString("Rest Mode"))) { 
 BA.debugLineNum = 248;BA.debugLine="Dim restDeger As String = LabelChronometer.Text";
Debug.ShouldStop(8388608);
_restdeger = surattestekle.mostCurrent._labelchronometer.runMethod(true,"getText");Debug.locals.put("restDeger", _restdeger);Debug.locals.put("restDeger", _restdeger);
 BA.debugLineNum = 249;BA.debugLine="ListView1.AddSingleLine($\"Rest Deger : ${i}";
Debug.ShouldStop(16777216);
surattestekle.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Rest Deger : "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((surattestekle._i))),RemoteObject.createImmutable("                =>>            "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_restdeger))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 250;BA.debugLine="dizi(i) = restDeger";
Debug.ShouldStop(33554432);
surattestekle.mostCurrent._dizi.setArrayElement (_restdeger,surattestekle._i);
 }}}
;
 BA.debugLineNum = 252;BA.debugLine="Pause";
Debug.ShouldStop(134217728);
_pause();
 BA.debugLineNum = 253;BA.debugLine="LabelChronometer.Text = \"Test Bitti\"";
Debug.ShouldStop(268435456);
surattestekle.mostCurrent._labelchronometer.runMethod(true,"setText",BA.ObjectToCharSequence("Test Bitti"));
 BA.debugLineNum = 254;BA.debugLine="ButtonBaslamaSuresi.Enabled = False";
Debug.ShouldStop(536870912);
surattestekle.mostCurrent._buttonbaslamasuresi.runMethod(true,"setEnabled",surattestekle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 255;BA.debugLine="ButtonBaslamaSuresi.Visible = False";
Debug.ShouldStop(1073741824);
surattestekle.mostCurrent._buttonbaslamasuresi.runMethod(true,"setVisible",surattestekle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 256;BA.debugLine="ButtonLap.Enabled = False";
Debug.ShouldStop(-2147483648);
surattestekle.mostCurrent._buttonlap.runMethod(true,"setEnabled",surattestekle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 257;BA.debugLine="ButtonLap.Visible = False";
Debug.ShouldStop(1);
surattestekle.mostCurrent._buttonlap.runMethod(true,"setVisible",surattestekle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 258;BA.debugLine="ButtonReset.Enabled = False";
Debug.ShouldStop(2);
surattestekle.mostCurrent._buttonreset.runMethod(true,"setEnabled",surattestekle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 259;BA.debugLine="ButtonReset.Visible = False";
Debug.ShouldStop(4);
surattestekle.mostCurrent._buttonreset.runMethod(true,"setVisible",surattestekle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 260;BA.debugLine="ButtonOK.Visible = True";
Debug.ShouldStop(8);
surattestekle.mostCurrent._buttonok.runMethod(true,"setVisible",surattestekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 261;BA.debugLine="ButtonOK.Enabled = True";
Debug.ShouldStop(16);
surattestekle.mostCurrent._buttonok.runMethod(true,"setEnabled",surattestekle.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 263;BA.debugLine="Pause";
Debug.ShouldStop(64);
_pause();
 BA.debugLineNum = 264;BA.debugLine="LabelChronometer.Text = \"Test Bitti\"";
Debug.ShouldStop(128);
surattestekle.mostCurrent._labelchronometer.runMethod(true,"setText",BA.ObjectToCharSequence("Test Bitti"));
 }}
;
 BA.debugLineNum = 266;BA.debugLine="i=i+1";
Debug.ShouldStop(512);
surattestekle._i = RemoteObject.solve(new RemoteObject[] {surattestekle._i,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonok_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonOK_Click (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,324);
if (RapidSub.canDelegate("buttonok_click")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","buttonok_click");}
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _now = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 324;BA.debugLine="Sub ButtonOK_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 325;BA.debugLine="Dim result As Int";
Debug.ShouldStop(16);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 326;BA.debugLine="result = Msgbox2(\"Sürat Test verilerini eklemek i";
Debug.ShouldStop(32);
_result = surattestekle.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Sürat Test verilerini eklemek istiyor musunuz?:")),(Object)(BA.ObjectToCharSequence("Onay Mesajı")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Hayır")),(Object)((surattestekle.mostCurrent.__c.getField(false,"Null"))),surattestekle.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 327;BA.debugLine="If result= DialogResponse.POSITIVE Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, surattestekle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 328;BA.debugLine="Dim now As Long = DateTime.Now";
Debug.ShouldStop(128);
_now = surattestekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("now", _now);Debug.locals.put("now", _now);
 BA.debugLineNum = 329;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
Debug.ShouldStop(256);
surattestekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 331;BA.debugLine="secilenTarih = DateTime.Date(now)";
Debug.ShouldStop(1024);
surattestekle._secilentarih = surattestekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_now));
 BA.debugLineNum = 332;BA.debugLine="secilenSaat = DateTime.Time(now)";
Debug.ShouldStop(2048);
surattestekle._secilensaat = surattestekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_now));
 BA.debugLineNum = 333;BA.debugLine="ID";
Debug.ShouldStop(4096);
_id();
 BA.debugLineNum = 334;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO SuratTest VA";
Debug.ShouldStop(8192);
surattestekle.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO SuratTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)")),(Object)(surattestekle.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {110},new Object[] {(surattestekle._surattestid),(surattestekle.mostCurrent._testdenekara._secilendenek /*RemoteObject*/ ),(surattestekle.mostCurrent._surattestayar._secilenmode /*RemoteObject*/ ),(surattestekle._secilentarih),(surattestekle._secilensaat),(surattestekle.mostCurrent._surattestayar._degerdakika /*RemoteObject*/ ),(surattestekle.mostCurrent._surattestayar._degersaniye /*RemoteObject*/ ),(surattestekle.mostCurrent._surattestayar._result /*RemoteObject*/ ),(surattestekle.mostCurrent._surattestayar._gate /*RemoteObject*/ ),(surattestekle.mostCurrent._surattestayar._set /*RemoteObject*/ ),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 1))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 2))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 3))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 4))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 5))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 6))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 7))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 8))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 9))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 10))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 11))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 12))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 13))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 14))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 15))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 16))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 17))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 18))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 19))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 20))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 21))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 22))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 23))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 24))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 25))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 26))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 27))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 28))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 29))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 30))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 31))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 32))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 33))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 34))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 35))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 36))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 37))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 38))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 39))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 40))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 41))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 42))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 43))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 44))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 45))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 46))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 47))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 48))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 49))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 50))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 51))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 52))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 53))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 54))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 55))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 56))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 57))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 58))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 59))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 60))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 61))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 62))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 63))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 64))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 65))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 66))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 67))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 68))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 69))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 70))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 71))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 72))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 73))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 74))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 75))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 76))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 77))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 78))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 79))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 80))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 81))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 82))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 83))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 84))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 85))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 86))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 87))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 88))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 89))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 90))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 91))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 92))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 93))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 94))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 95))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 96))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 97))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 98))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 99))),(surattestekle.mostCurrent._dizi.getArrayElement(true,BA.numberCast(int.class, 100)))})))));
 BA.debugLineNum = 335;BA.debugLine="Log(\" VERİLER EKLENDİ\")";
Debug.ShouldStop(16384);
surattestekle.mostCurrent.__c.runVoidMethod ("LogImpl","227525131",RemoteObject.createImmutable(" VERİLER EKLENDİ"),0);
 BA.debugLineNum = 336;BA.debugLine="StartActivity(SuratTestListele)";
Debug.ShouldStop(32768);
surattestekle.mostCurrent.__c.runVoidMethod ("StartActivity",surattestekle.processBA,(Object)((surattestekle.mostCurrent._surattestlistele.getObject())));
 BA.debugLineNum = 337;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
surattestekle.mostCurrent._activity.runVoidMethod ("Finish");
 }else 
{ BA.debugLineNum = 338;BA.debugLine="Else If result= DialogResponse.NEGATIVE Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, surattestekle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
 BA.debugLineNum = 339;BA.debugLine="ToastMessageShow(\"Yönlendiriliyorsunuz...\",False";
Debug.ShouldStop(262144);
surattestekle.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Yönlendiriliyorsunuz...")),(Object)(surattestekle.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 340;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonreset_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonReset_Click (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,269);
if (RapidSub.canDelegate("buttonreset_click")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","buttonreset_click");}
 BA.debugLineNum = 269;BA.debugLine="Sub ButtonReset_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 270;BA.debugLine="StartTime = DateTime.Now";
Debug.ShouldStop(8192);
surattestekle._starttime = surattestekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chronometer_tick() throws Exception{
try {
		Debug.PushSubsStack("Chronometer_Tick (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,153);
if (RapidSub.canDelegate("chronometer_tick")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","chronometer_tick");}
 BA.debugLineNum = 153;BA.debugLine="Sub Chronometer_Tick";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 154;BA.debugLine="pm = PeriodBetweenWithMilliseconds(StartTime, Dat";
Debug.ShouldStop(33554432);
surattestekle._pm = _periodbetweenwithmilliseconds(surattestekle._starttime,surattestekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 155;BA.debugLine="LabelChronometer.Text = FN(pm.p.Hours) & \":\" & FN";
Debug.ShouldStop(67108864);
surattestekle.mostCurrent._labelchronometer.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_fn(surattestekle._pm.getField(false,"p" /*RemoteObject*/ ).getField(true,"Hours")),RemoteObject.createImmutable(":"),_fn(surattestekle._pm.getField(false,"p" /*RemoteObject*/ ).getField(true,"Minutes")),RemoteObject.createImmutable(":"),_fn(surattestekle._pm.getField(false,"p" /*RemoteObject*/ ).getField(true,"Seconds")),RemoteObject.createImmutable("."),surattestekle.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, surattestekle._pm.getField(true,"ms" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dinlenmecikissureyakalama() throws Exception{
try {
		Debug.PushSubsStack("DinlenmeCikisSureYakalama (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,213);
if (RapidSub.canDelegate("dinlenmecikissureyakalama")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","dinlenmecikissureyakalama");}
RemoteObject _dinlenme = RemoteObject.createImmutable("");
 BA.debugLineNum = 213;BA.debugLine="Sub DinlenmeCikisSureYakalama";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 214;BA.debugLine="Dim Dinlenme As String = LabelTimer.Text";
Debug.ShouldStop(2097152);
_dinlenme = surattestekle.mostCurrent._labeltimer.runMethod(true,"getText");Debug.locals.put("Dinlenme", _dinlenme);Debug.locals.put("Dinlenme", _dinlenme);
 BA.debugLineNum = 215;BA.debugLine="ListView1.AddSingleLine($\"Dinlenme Süresi:";
Debug.ShouldStop(4194304);
surattestekle.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Dinlenme Süresi:             =>>            "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dinlenme))),RemoteObject.createImmutable(""))))));
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
public static RemoteObject  _fn(RemoteObject _n) throws Exception{
try {
		Debug.PushSubsStack("FN (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,159);
if (RapidSub.canDelegate("fn")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","fn", _n);}
Debug.locals.put("n", _n);
 BA.debugLineNum = 159;BA.debugLine="Sub FN(n As Int) As String";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 160;BA.debugLine="Return NumberFormat(n, 2, 0)";
Debug.ShouldStop(-2147483648);
if (true) return surattestekle.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _n)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="Private ListView1 As ListView";
surattestekle.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private LabelDenekIsim As Label";
surattestekle.mostCurrent._labeldenekisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ImageView1 As ImageView";
surattestekle.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private LabelTimer As Label";
surattestekle.mostCurrent._labeltimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private LabelChronometer As Label";
surattestekle.mostCurrent._labelchronometer = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private LabelSetSayisi As Label";
surattestekle.mostCurrent._labelsetsayisi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private LabelGateSayisi As Label";
surattestekle.mostCurrent._labelgatesayisi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private LabelTestIsim As Label";
surattestekle.mostCurrent._labeltestisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private LabelDate As Label";
surattestekle.mostCurrent._labeldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private LabelModIsim As Label";
surattestekle.mostCurrent._labelmodisim = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private ButtonLap As Button";
surattestekle.mostCurrent._buttonlap = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private ButtonReset As Button";
surattestekle.mostCurrent._buttonreset = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private ButtonBaslamaSuresi As Button";
surattestekle.mostCurrent._buttonbaslamasuresi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private ButtonAyarlar As Button";
surattestekle.mostCurrent._buttonayarlar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private ButtonOK As Button";
surattestekle.mostCurrent._buttonok = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Dim StartTime As Long";
surattestekle._starttime = RemoteObject.createImmutable(0L);
 //BA.debugLineNum = 44;BA.debugLine="Dim i As Int = 1";
surattestekle._i = BA.numberCast(int.class, 1);
 //BA.debugLineNum = 45;BA.debugLine="Dim dizi(101) As String";
surattestekle.mostCurrent._dizi = RemoteObject.createNewArray ("String", new int[] {101}, new Object[]{});
 //BA.debugLineNum = 46;BA.debugLine="Dim SuratTestID As Int";
surattestekle._surattestid = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 47;BA.debugLine="Dim rs As ResultSet";
surattestekle.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private LabelTımeDegerleri As Label";
surattestekle.mostCurrent._labeltımedegerleri = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private LabelResult As Label";
surattestekle.mostCurrent._labelresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _id() throws Exception{
try {
		Debug.PushSubsStack("ID (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,309);
if (RapidSub.canDelegate("id")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","id");}
RemoteObject _sf = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
 BA.debugLineNum = 309;BA.debugLine="Sub ID";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 310;BA.debugLine="Dim sf As StringFunctions";
Debug.ShouldStop(2097152);
_sf = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");Debug.locals.put("sf", _sf);
 BA.debugLineNum = 311;BA.debugLine="sf.initialize";
Debug.ShouldStop(4194304);
_sf.runVoidMethod ("_initialize",surattestekle.processBA);
 BA.debugLineNum = 313;BA.debugLine="rs= Main.sql.ExecQuery(\"SELECT * FROM SuratTest O";
Debug.ShouldStop(16777216);
surattestekle.mostCurrent._rs.setObject(surattestekle.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM SuratTest ORDER BY surat_id DESC"))));
 BA.debugLineNum = 314;BA.debugLine="If rs.RowCount>0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",surattestekle.mostCurrent._rs.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 315;BA.debugLine="rs.Position=0";
Debug.ShouldStop(67108864);
surattestekle.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 316;BA.debugLine="SuratTestID = sf.Right(\"00\" &sf.Trim(sf.Val(sf.R";
Debug.ShouldStop(134217728);
surattestekle._surattestid = BA.numberCast(int.class, _sf.runMethod(true,"_vvvvv7",(Object)(RemoteObject.concat(RemoteObject.createImmutable("00"),_sf.runMethod(true,"_vvvvvvv4",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_sf.runMethod(true,"_vvvvvvv6",(Object)(_sf.runMethod(true,"_vvvvv7",(Object)(surattestekle.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("surat_id")))),(Object)(BA.numberCast(long.class, 3))))),RemoteObject.createImmutable(1)}, "+",1, 0)))))),(Object)(BA.numberCast(long.class, 3))));
 }else {
 BA.debugLineNum = 318;BA.debugLine="SuratTestID=\"001\"";
Debug.ShouldStop(536870912);
surattestekle._surattestid = BA.numberCast(int.class, "001");
 };
 BA.debugLineNum = 320;BA.debugLine="rs.Close";
Debug.ShouldStop(-2147483648);
surattestekle.mostCurrent._rs.runVoidMethod ("Close");
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pause() throws Exception{
try {
		Debug.PushSubsStack("Pause (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,206);
if (RapidSub.canDelegate("pause")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","pause");}
 BA.debugLineNum = 206;BA.debugLine="Sub Pause";
Debug.ShouldStop(8192);
 BA.debugLineNum = 208;BA.debugLine="Chronometer.Enabled = False";
Debug.ShouldStop(32768);
surattestekle._chronometer.runMethod(true,"setEnabled",surattestekle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 209;BA.debugLine="ButtonReset.Visible = False";
Debug.ShouldStop(65536);
surattestekle.mostCurrent._buttonreset.runMethod(true,"setVisible",surattestekle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 210;BA.debugLine="timer.Enabled = True";
Debug.ShouldStop(131072);
surattestekle._timer.runMethod(true,"setEnabled",surattestekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _periodbetweenwithmilliseconds(RemoteObject _time1,RemoteObject _time2) throws Exception{
try {
		Debug.PushSubsStack("PeriodBetweenWithMilliseconds (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,163);
if (RapidSub.canDelegate("periodbetweenwithmilliseconds")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","periodbetweenwithmilliseconds", _time1, _time2);}
RemoteObject _p = RemoteObject.declareNull("b4a.example.dateutils._period");
RemoteObject _ms = RemoteObject.createImmutable(0);
Debug.locals.put("time1", _time1);
Debug.locals.put("time2", _time2);
 BA.debugLineNum = 163;BA.debugLine="Sub PeriodBetweenWithMilliseconds(time1 As Long, t";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(time1,";
Debug.ShouldStop(8);
_p = surattestekle.mostCurrent._dateutils.runMethod(false,"_periodbetween",surattestekle.mostCurrent.activityBA,(Object)(_time1),(Object)(_time2));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 165;BA.debugLine="Dim ms As Int = (time2 - time1) Mod DateTime.Tick";
Debug.ShouldStop(16);
_ms = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_time2,_time1}, "-",1, 2)),surattestekle.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "%",0, 2));Debug.locals.put("ms", _ms);Debug.locals.put("ms", _ms);
 BA.debugLineNum = 166;BA.debugLine="If ms < 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("<",_ms,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 167;BA.debugLine="ms = ms + 1000";
Debug.ShouldStop(64);
_ms = RemoteObject.solve(new RemoteObject[] {_ms,RemoteObject.createImmutable(1000)}, "+",1, 1);Debug.locals.put("ms", _ms);
 };
 BA.debugLineNum = 169;BA.debugLine="Dim pm As PeriodWithMs";
Debug.ShouldStop(256);
surattestekle._pm = RemoteObject.createNew ("b4a.example3.surattestekle._periodwithms");
 BA.debugLineNum = 170;BA.debugLine="pm.p = p";
Debug.ShouldStop(512);
surattestekle._pm.setField ("p" /*RemoteObject*/ ,_p);
 BA.debugLineNum = 171;BA.debugLine="pm.ms = ms";
Debug.ShouldStop(1024);
surattestekle._pm.setField ("ms" /*RemoteObject*/ ,_ms);
 BA.debugLineNum = 172;BA.debugLine="Return pm";
Debug.ShouldStop(2048);
if (true) return surattestekle._pm;
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim secilenTarih As String";
surattestekle._secilentarih = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Dim secilenSaat As String";
surattestekle._secilensaat = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Type PeriodWithMs (p As Period, ms As Int)";
;
 //BA.debugLineNum = 13;BA.debugLine="Dim Chronometer As Timer";
surattestekle._chronometer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 14;BA.debugLine="Dim pm As PeriodWithMs";
surattestekle._pm = RemoteObject.createNew ("b4a.example3.surattestekle._periodwithms");
 //BA.debugLineNum = 16;BA.debugLine="Dim timer As Timer";
surattestekle._timer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 17;BA.debugLine="Dim hedefZaman As Long";
surattestekle._hedefzaman = RemoteObject.createImmutable(0L);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _readblob() throws Exception{
try {
		Debug.PushSubsStack("ReadBlob (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,177);
if (RapidSub.canDelegate("readblob")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","readblob");}
RemoteObject _inputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 177;BA.debugLine="Sub ReadBlob";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 179;BA.debugLine="Dim inputStream As InputStream";
Debug.ShouldStop(262144);
_inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 180;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(524288);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 181;BA.debugLine="inputStream.InitializeFromBytesArray(TestDenekAr";
Debug.ShouldStop(1048576);
_inputstream.runVoidMethod ("InitializeFromBytesArray",(Object)(surattestekle.mostCurrent._testdenekara._denekimage /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(surattestekle.mostCurrent._testdenekara._denekimage /*RemoteObject*/ .getField(true,"length")));
 BA.debugLineNum = 182;BA.debugLine="bmp.Initialize2(inputStream)";
Debug.ShouldStop(2097152);
_bmp.runVoidMethod ("Initialize2",(Object)((_inputstream.getObject())));
 BA.debugLineNum = 183;BA.debugLine="inputStream.Close";
Debug.ShouldStop(4194304);
_inputstream.runVoidMethod ("Close");
 BA.debugLineNum = 184;BA.debugLine="ImageView1.SetBackgroundImage(bmp)";
Debug.ShouldStop(8388608);
surattestekle.mostCurrent._imageview1.runVoidMethod ("SetBackgroundImageNew",(Object)((_bmp.getObject())));
 BA.debugLineNum = 185;BA.debugLine="Log(\"try\")";
Debug.ShouldStop(16777216);
surattestekle.mostCurrent.__c.runVoidMethod ("LogImpl","226935304",RemoteObject.createImmutable("try"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",surattestekle.processBA, e10.toString()); BA.debugLineNum = 187;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirAssets, \"";
Debug.ShouldStop(67108864);
surattestekle.mostCurrent._imageview1.runMethod(false,"setBitmap",(surattestekle.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(surattestekle.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("FotoKisi.png"))).getObject()));
 BA.debugLineNum = 188;BA.debugLine="Log(\"catch\")";
Debug.ShouldStop(134217728);
surattestekle.mostCurrent.__c.runVoidMethod ("LogImpl","226935307",RemoteObject.createImmutable("catch"),0);
 };
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdivider(RemoteObject _lv,RemoteObject _renk,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetDivider (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,344);
if (RapidSub.canDelegate("setdivider")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","setdivider", _lv, _renk, _height);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("lv", _lv);
Debug.locals.put("Renk", _renk);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 344;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 345;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(16777216);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 346;BA.debugLine="r.Target = lv";
Debug.ShouldStop(33554432);
_r.setField ("Target",(_lv.getObject()));
 BA.debugLineNum = 347;BA.debugLine="Dim CD As ColorDrawable";
Debug.ShouldStop(67108864);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("CD", _cd);
 BA.debugLineNum = 348;BA.debugLine="CD.Initialize(Renk, 0)";
Debug.ShouldStop(134217728);
_cd.runVoidMethod ("Initialize",(Object)(_renk),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 349;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
Debug.ShouldStop(268435456);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setDivider")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cd.getObject())})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("android.graphics.drawable.Drawable")})));
 BA.debugLineNum = 350;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
Debug.ShouldStop(536870912);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setDividerHeight")),(Object)(BA.NumberToString(_height)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _start() throws Exception{
try {
		Debug.PushSubsStack("Start (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,192);
if (RapidSub.canDelegate("start")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","start");}
 BA.debugLineNum = 192;BA.debugLine="Sub Start";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 197;BA.debugLine="ButtonReset_Click";
Debug.ShouldStop(16);
_buttonreset_click();
 BA.debugLineNum = 198;BA.debugLine="LabelChronometer.Visible = True";
Debug.ShouldStop(32);
surattestekle.mostCurrent._labelchronometer.runMethod(true,"setVisible",surattestekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 199;BA.debugLine="Chronometer.Enabled = True";
Debug.ShouldStop(64);
surattestekle._chronometer.runMethod(true,"setEnabled",surattestekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 200;BA.debugLine="LabelTimer.Visible = False";
Debug.ShouldStop(128);
surattestekle.mostCurrent._labeltimer.runMethod(true,"setVisible",surattestekle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 202;BA.debugLine="ButtonReset.Enabled = True";
Debug.ShouldStop(512);
surattestekle.mostCurrent._buttonreset.runMethod(true,"setEnabled",surattestekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 203;BA.debugLine="ButtonLap.Enabled = True";
Debug.ShouldStop(1024);
surattestekle.mostCurrent._buttonlap.runMethod(true,"setEnabled",surattestekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _starttimer(RemoteObject _minute,RemoteObject _second) throws Exception{
try {
		Debug.PushSubsStack("StartTimer (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,130);
if (RapidSub.canDelegate("starttimer")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","starttimer", _minute, _second);}
Debug.locals.put("minute", _minute);
Debug.locals.put("second", _second);
 BA.debugLineNum = 130;BA.debugLine="Sub StartTimer(minute As Int, second As Int)";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="hedefZaman = DateTime.Now + minute * DateTime.Tic";
Debug.ShouldStop(4);
surattestekle._hedefzaman = RemoteObject.solve(new RemoteObject[] {surattestekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),_minute,surattestekle.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerMinute"),_second,surattestekle.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "+*+*",2, 2);
 BA.debugLineNum = 132;BA.debugLine="timer.Enabled = True";
Debug.ShouldStop(8);
surattestekle._timer.runMethod(true,"setEnabled",surattestekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer_tick() throws Exception{
try {
		Debug.PushSubsStack("timer_Tick (surattestekle) ","surattestekle",19,surattestekle.mostCurrent.activityBA,surattestekle.mostCurrent,135);
if (RapidSub.canDelegate("timer_tick")) { return b4a.example3.surattestekle.remoteMe.runUserSub(false, "surattestekle","timer_tick");}
RemoteObject _t = RemoteObject.createImmutable(0L);
RemoteObject _minutes = RemoteObject.createImmutable(0);
RemoteObject _seconds = RemoteObject.createImmutable(0);
 BA.debugLineNum = 135;BA.debugLine="Sub timer_Tick";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Dim t As Long = Max(0, hedefZaman - DateTime.Now)";
Debug.ShouldStop(128);
_t = BA.numberCast(long.class, surattestekle.mostCurrent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {surattestekle._hedefzaman,surattestekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")}, "-",1, 2)))));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 137;BA.debugLine="Dim minutes, seconds As Int";
Debug.ShouldStop(256);
_minutes = RemoteObject.createImmutable(0);Debug.locals.put("minutes", _minutes);
_seconds = RemoteObject.createImmutable(0);Debug.locals.put("seconds", _seconds);
 BA.debugLineNum = 138;BA.debugLine="minutes = (t Mod DateTime.TicksPerHour) / DateTim";
Debug.ShouldStop(512);
_minutes = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_t,surattestekle.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerHour")}, "%",0, 2)),surattestekle.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")}, "/",0, 0));Debug.locals.put("minutes", _minutes);
 BA.debugLineNum = 139;BA.debugLine="seconds = (t Mod DateTime.TicksPerMinute) / DateT";
Debug.ShouldStop(1024);
_seconds = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_t,surattestekle.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")}, "%",0, 2)),surattestekle.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "/",0, 0));Debug.locals.put("seconds", _seconds);
 BA.debugLineNum = 140;BA.debugLine="LabelTimer.Text = $\" $1.0{minutes} : $1.0{seconds";
Debug.ShouldStop(2048);
surattestekle.mostCurrent._labeltimer.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(" "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_minutes))),RemoteObject.createImmutable(" : "),surattestekle.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_seconds))),RemoteObject.createImmutable(" ")))));
 BA.debugLineNum = 142;BA.debugLine="If t=0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_t,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 144;BA.debugLine="ToastMessageShow(\"Dinleniş sona erdi\",True)";
Debug.ShouldStop(32768);
surattestekle.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Dinleniş sona erdi")),(Object)(surattestekle.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 145;BA.debugLine="timer.Enabled = False";
Debug.ShouldStop(65536);
surattestekle._timer.runMethod(true,"setEnabled",surattestekle.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 146;BA.debugLine="LabelChronometer.Visible = True";
Debug.ShouldStop(131072);
surattestekle.mostCurrent._labelchronometer.runMethod(true,"setVisible",surattestekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 147;BA.debugLine="LabelTimer.Visible = False";
Debug.ShouldStop(262144);
surattestekle.mostCurrent._labeltimer.runMethod(true,"setVisible",surattestekle.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}