package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class saglikbilgileriekle_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (saglikbilgileriekle) ","saglikbilgileriekle",41,saglikbilgileriekle.mostCurrent.activityBA,saglikbilgileriekle.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.saglikbilgileriekle.remoteMe.runUserSub(false, "saglikbilgileriekle","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"SaglikBilgileriEklePage\")";
Debug.ShouldStop(-2147483648);
saglikbilgileriekle.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SaglikBilgileriEklePage")),saglikbilgileriekle.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(4);
saglikbilgileriekle.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",saglikbilgileriekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 36;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(8);
saglikbilgileriekle.mostCurrent._webview1.runMethod(true,"setZoomEnabled",saglikbilgileriekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 38;BA.debugLine="EditTextSaglikBilgileriHastalikSakatlik.TextColor";
Debug.ShouldStop(32);
saglikbilgileriekle.mostCurrent._edittextsaglikbilgilerihastaliksakatlik.runMethod(true,"setTextColor",saglikbilgileriekle.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 39;BA.debugLine="EditTextSaglikBilgileriHastalikSakatlik.Hint = \"H";
Debug.ShouldStop(64);
saglikbilgileriekle.mostCurrent._edittextsaglikbilgilerihastaliksakatlik.runMethod(true,"setHint",BA.ObjectToString("Hastalık/Sakatlık bilgierini bu alana yazabilirsiniz.."));
 BA.debugLineNum = 40;BA.debugLine="EditTextSaglikBilgileriHastalikSakatlik.HintColor";
Debug.ShouldStop(128);
saglikbilgileriekle.mostCurrent._edittextsaglikbilgilerihastaliksakatlik.runMethod(true,"setHintColor",saglikbilgileriekle.mostCurrent._color._acikmavi /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="EditTextSaglikBilgileriHastalikSakatlik.TextSize";
Debug.ShouldStop(256);
saglikbilgileriekle.mostCurrent._edittextsaglikbilgilerihastaliksakatlik.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 42;BA.debugLine="EditTextSaglikBilgileriHastalikSakatlik.Typeface";
Debug.ShouldStop(512);
saglikbilgileriekle.mostCurrent._edittextsaglikbilgilerihastaliksakatlik.runMethod(false,"setTypeface",saglikbilgileriekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 44;BA.debugLine="EditTextSaglikBilgileriAciklama.TextColor = Color";
Debug.ShouldStop(2048);
saglikbilgileriekle.mostCurrent._edittextsaglikbilgileriaciklama.runMethod(true,"setTextColor",saglikbilgileriekle.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 45;BA.debugLine="EditTextSaglikBilgileriAciklama.Hint = \"Sağlık bi";
Debug.ShouldStop(4096);
saglikbilgileriekle.mostCurrent._edittextsaglikbilgileriaciklama.runMethod(true,"setHint",BA.ObjectToString("Sağlık bilgileri açıklamanızı bu alana yazabilirsiniz.."));
 BA.debugLineNum = 46;BA.debugLine="EditTextSaglikBilgileriAciklama.HintColor = Color";
Debug.ShouldStop(8192);
saglikbilgileriekle.mostCurrent._edittextsaglikbilgileriaciklama.runMethod(true,"setHintColor",saglikbilgileriekle.mostCurrent._color._acikmavi /*RemoteObject*/ );
 BA.debugLineNum = 47;BA.debugLine="EditTextSaglikBilgileriAciklama.TextSize = 20";
Debug.ShouldStop(16384);
saglikbilgileriekle.mostCurrent._edittextsaglikbilgileriaciklama.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 48;BA.debugLine="EditTextSaglikBilgileriAciklama.Typeface = Typefa";
Debug.ShouldStop(32768);
saglikbilgileriekle.mostCurrent._edittextsaglikbilgileriaciklama.runMethod(false,"setTypeface",saglikbilgileriekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 50;BA.debugLine="LabelSaglikBilgileriHastalikSakatlik.TextColor =";
Debug.ShouldStop(131072);
saglikbilgileriekle.mostCurrent._labelsaglikbilgilerihastaliksakatlik.runMethod(true,"setTextColor",saglikbilgileriekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 51;BA.debugLine="LabelSaglikBilgileriHastalikSakatlik.TextSize = 2";
Debug.ShouldStop(262144);
saglikbilgileriekle.mostCurrent._labelsaglikbilgilerihastaliksakatlik.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 52;BA.debugLine="LabelSaglikBilgileriHastalikSakatlik.Typeface = T";
Debug.ShouldStop(524288);
saglikbilgileriekle.mostCurrent._labelsaglikbilgilerihastaliksakatlik.runMethod(false,"setTypeface",saglikbilgileriekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 54;BA.debugLine="LabelSaglikBilgileriAciklama.TextColor = Colors.W";
Debug.ShouldStop(2097152);
saglikbilgileriekle.mostCurrent._labelsaglikbilgileriaciklama.runMethod(true,"setTextColor",saglikbilgileriekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 55;BA.debugLine="LabelSaglikBilgileriAciklama.TextSize = 20";
Debug.ShouldStop(4194304);
saglikbilgileriekle.mostCurrent._labelsaglikbilgileriaciklama.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 56;BA.debugLine="LabelSaglikBilgileriAciklama.Typeface = Typeface.";
Debug.ShouldStop(8388608);
saglikbilgileriekle.mostCurrent._labelsaglikbilgileriaciklama.runMethod(false,"setTypeface",saglikbilgileriekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 59;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(67108864);
_htmlgosterdb();
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (saglikbilgileriekle) ","saglikbilgileriekle",41,saglikbilgileriekle.mostCurrent.activityBA,saglikbilgileriekle.mostCurrent,67);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.saglikbilgileriekle.remoteMe.runUserSub(false, "saglikbilgileriekle","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 67;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Resume (saglikbilgileriekle) ","saglikbilgileriekle",41,saglikbilgileriekle.mostCurrent.activityBA,saglikbilgileriekle.mostCurrent,63);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.saglikbilgileriekle.remoteMe.runUserSub(false, "saglikbilgileriekle","activity_resume");}
 BA.debugLineNum = 63;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("ButtonSaglikBilgileriEkle_Click (saglikbilgileriekle) ","saglikbilgileriekle",41,saglikbilgileriekle.mostCurrent.activityBA,saglikbilgileriekle.mostCurrent,90);
if (RapidSub.canDelegate("buttonsaglikbilgileriekle_click")) { return b4a.example3.saglikbilgileriekle.remoteMe.runUserSub(false, "saglikbilgileriekle","buttonsaglikbilgileriekle_click");}
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _now = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 90;BA.debugLine="Sub ButtonSaglikBilgileriEkle_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="Dim result As Int";
Debug.ShouldStop(67108864);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 92;BA.debugLine="result = Msgbox2(\"Sağlık Bilgilerini eklemek isti";
Debug.ShouldStop(134217728);
_result = saglikbilgileriekle.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Sağlık Bilgilerini eklemek istiyor musunuz?:")),(Object)(BA.ObjectToCharSequence("Onay Mesajı")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Hayır")),(Object)((saglikbilgileriekle.mostCurrent.__c.getField(false,"Null"))),saglikbilgileriekle.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 93;BA.debugLine="If result= DialogResponse.POSITIVE Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, saglikbilgileriekle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 94;BA.debugLine="Dim now As Long = DateTime.Now";
Debug.ShouldStop(536870912);
_now = saglikbilgileriekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("now", _now);Debug.locals.put("now", _now);
 BA.debugLineNum = 95;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
Debug.ShouldStop(1073741824);
saglikbilgileriekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 96;BA.debugLine="Log(DateTime.Date(now))";
Debug.ShouldStop(-2147483648);
saglikbilgileriekle.mostCurrent.__c.runVoidMethod ("LogImpl","246268422",saglikbilgileriekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_now)),0);
 BA.debugLineNum = 97;BA.debugLine="secilenTarih = DateTime.Date(now)";
Debug.ShouldStop(1);
saglikbilgileriekle.mostCurrent._secilentarih = saglikbilgileriekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_now));
 BA.debugLineNum = 98;BA.debugLine="Log(DateTime.Time(now))";
Debug.ShouldStop(2);
saglikbilgileriekle.mostCurrent.__c.runVoidMethod ("LogImpl","246268424",saglikbilgileriekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_now)),0);
 BA.debugLineNum = 99;BA.debugLine="secilenSaat = DateTime.Time(now)";
Debug.ShouldStop(4);
saglikbilgileriekle.mostCurrent._secilensaat = saglikbilgileriekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_now));
 BA.debugLineNum = 100;BA.debugLine="ID";
Debug.ShouldStop(8);
_id();
 BA.debugLineNum = 101;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO SaglikBilgil";
Debug.ShouldStop(16);
saglikbilgileriekle.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO SaglikBilgileri VALUES(?,?,?,?,?,?)")),(Object)(saglikbilgileriekle.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(saglikbilgileriekle._saglikbilgileriid),(saglikbilgileriekle.mostCurrent._testdenekara._secilendenek /*RemoteObject*/ ),(saglikbilgileriekle.mostCurrent._secilentarih),(saglikbilgileriekle.mostCurrent._secilensaat),(saglikbilgileriekle.mostCurrent._edittextsaglikbilgilerihastaliksakatlik.runMethod(true,"getText")),(saglikbilgileriekle.mostCurrent._edittextsaglikbilgileriaciklama.runMethod(true,"getText"))})))));
 BA.debugLineNum = 102;BA.debugLine="Log(\"SAĞLIK BİLGİLERİ EKLENDİ\")";
Debug.ShouldStop(32);
saglikbilgileriekle.mostCurrent.__c.runVoidMethod ("LogImpl","246268428",RemoteObject.createImmutable("SAĞLIK BİLGİLERİ EKLENDİ"),0);
 BA.debugLineNum = 103;BA.debugLine="StartActivity(SaglikBilgileriListele)";
Debug.ShouldStop(64);
saglikbilgileriekle.mostCurrent.__c.runVoidMethod ("StartActivity",saglikbilgileriekle.processBA,(Object)((saglikbilgileriekle.mostCurrent._saglikbilgilerilistele.getObject())));
 BA.debugLineNum = 104;BA.debugLine="Activity.Finish";
Debug.ShouldStop(128);
saglikbilgileriekle.mostCurrent._activity.runVoidMethod ("Finish");
 }else 
{ BA.debugLineNum = 105;BA.debugLine="Else If result= DialogResponse.NEGATIVE Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, saglikbilgileriekle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
 BA.debugLineNum = 106;BA.debugLine="ToastMessageShow(\"Yönlendiriliyorsunuz...\",False";
Debug.ShouldStop(512);
saglikbilgileriekle.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Yönlendiriliyorsunuz...")),(Object)(saglikbilgileriekle.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 107;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return RemoteObject.createImmutable("");
 }}
;
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private WebView1 As WebView";
saglikbilgileriekle.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private EditTextSaglikBilgileriHastalikSakatlik A";
saglikbilgileriekle.mostCurrent._edittextsaglikbilgilerihastaliksakatlik = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private EditTextSaglikBilgileriAciklama As EditTe";
saglikbilgileriekle.mostCurrent._edittextsaglikbilgileriaciklama = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonSaglikBilgileriEkle As Button";
saglikbilgileriekle.mostCurrent._buttonsaglikbilgileriekle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private LabelSaglikBilgileriHastalikSakatlik As L";
saglikbilgileriekle.mostCurrent._labelsaglikbilgilerihastaliksakatlik = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private LabelSaglikBilgileriAciklama As Label";
saglikbilgileriekle.mostCurrent._labelsaglikbilgileriaciklama = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim SaglikBilgileriID As Int";
saglikbilgileriekle._saglikbilgileriid = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 24;BA.debugLine="Dim rs As ResultSet";
saglikbilgileriekle.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim secilenTarih As String";
saglikbilgileriekle.mostCurrent._secilentarih = RemoteObject.createImmutable("");
 //BA.debugLineNum = 26;BA.debugLine="Dim secilenSaat As String";
saglikbilgileriekle.mostCurrent._secilensaat = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _htmlgosterdb() throws Exception{
try {
		Debug.PushSubsStack("HTMLGosterDB (saglikbilgileriekle) ","saglikbilgileriekle",41,saglikbilgileriekle.mostCurrent.activityBA,saglikbilgileriekle.mostCurrent,71);
if (RapidSub.canDelegate("htmlgosterdb")) { return b4a.example3.saglikbilgileriekle.remoteMe.runUserSub(false, "saglikbilgileriekle","htmlgosterdb");}
 BA.debugLineNum = 71;BA.debugLine="Sub HTMLGosterDB";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(256);
saglikbilgileriekle.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(saglikbilgileriekle.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,saglikbilgileriekle.mostCurrent.activityBA,(Object)(saglikbilgileriekle.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_id As [ID], denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"),saglikbilgileriekle.mostCurrent._testdenekara._secilendenek /*RemoteObject*/ ,RemoteObject.createImmutable("' "))),(Object)((saglikbilgileriekle.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(saglikbilgileriekle.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _id() throws Exception{
try {
		Debug.PushSubsStack("ID (saglikbilgileriekle) ","saglikbilgileriekle",41,saglikbilgileriekle.mostCurrent.activityBA,saglikbilgileriekle.mostCurrent,76);
if (RapidSub.canDelegate("id")) { return b4a.example3.saglikbilgileriekle.remoteMe.runUserSub(false, "saglikbilgileriekle","id");}
RemoteObject _sf = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
 BA.debugLineNum = 76;BA.debugLine="Sub ID";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="Dim sf As StringFunctions";
Debug.ShouldStop(4096);
_sf = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");Debug.locals.put("sf", _sf);
 BA.debugLineNum = 78;BA.debugLine="sf.initialize";
Debug.ShouldStop(8192);
_sf.runVoidMethod ("_initialize",saglikbilgileriekle.processBA);
 BA.debugLineNum = 80;BA.debugLine="rs= Main.sql.ExecQuery(\"SELECT * FROM SaglikBilgi";
Debug.ShouldStop(32768);
saglikbilgileriekle.mostCurrent._rs.setObject(saglikbilgileriekle.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM SaglikBilgileri ORDER BY saglikBilgileri_id DESC"))));
 BA.debugLineNum = 81;BA.debugLine="If rs.RowCount>0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",saglikbilgileriekle.mostCurrent._rs.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 82;BA.debugLine="rs.Position=0";
Debug.ShouldStop(131072);
saglikbilgileriekle.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 83;BA.debugLine="SaglikBilgileriID = sf.Right(\"00\" &sf.Trim(sf.Va";
Debug.ShouldStop(262144);
saglikbilgileriekle._saglikbilgileriid = BA.numberCast(int.class, _sf.runMethod(true,"_vvvvv7",(Object)(RemoteObject.concat(RemoteObject.createImmutable("00"),_sf.runMethod(true,"_vvvvvvv4",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_sf.runMethod(true,"_vvvvvvv6",(Object)(_sf.runMethod(true,"_vvvvv7",(Object)(saglikbilgileriekle.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("saglikBilgileri_id")))),(Object)(BA.numberCast(long.class, 3))))),RemoteObject.createImmutable(1)}, "+",1, 0)))))),(Object)(BA.numberCast(long.class, 3))));
 }else {
 BA.debugLineNum = 85;BA.debugLine="SaglikBilgileriID=\"001\"";
Debug.ShouldStop(1048576);
saglikbilgileriekle._saglikbilgileriid = BA.numberCast(int.class, "001");
 };
 BA.debugLineNum = 87;BA.debugLine="rs.Close";
Debug.ShouldStop(4194304);
saglikbilgileriekle.mostCurrent._rs.runVoidMethod ("Close");
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}