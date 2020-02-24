package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class antranorgorusekle_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (antranorgorusekle) ","antranorgorusekle",11,antranorgorusekle.mostCurrent.activityBA,antranorgorusekle.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) { return b4a.example3.antranorgorusekle.remoteMe.runUserSub(false, "antranorgorusekle","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"AntranorGorusleriEklePage\")";
Debug.ShouldStop(536870912);
antranorgorusekle.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("AntranorGorusleriEklePage")),antranorgorusekle.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="LabelAntranorGorusleriAciklama.TextColor = Colors";
Debug.ShouldStop(1);
antranorgorusekle.mostCurrent._labelantranorgorusleriaciklama.runMethod(true,"setTextColor",antranorgorusekle.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 34;BA.debugLine="LabelAntranorGorusleriAciklama.TextSize = 20";
Debug.ShouldStop(2);
antranorgorusekle.mostCurrent._labelantranorgorusleriaciklama.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 35;BA.debugLine="LabelAntranorGorusleriAciklama.Typeface = Typefac";
Debug.ShouldStop(4);
antranorgorusekle.mostCurrent._labelantranorgorusleriaciklama.runMethod(false,"setTypeface",antranorgorusekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 37;BA.debugLine="WebView1.ZoomEnabled = True";
Debug.ShouldStop(16);
antranorgorusekle.mostCurrent._webview1.runMethod(true,"setZoomEnabled",antranorgorusekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 38;BA.debugLine="WebView1.JavaScriptEnabled = True";
Debug.ShouldStop(32);
antranorgorusekle.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",antranorgorusekle.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 40;BA.debugLine="EditTextAntranorGorusleriAciklama.TextColor = Col";
Debug.ShouldStop(128);
antranorgorusekle.mostCurrent._edittextantranorgorusleriaciklama.runMethod(true,"setTextColor",antranorgorusekle.mostCurrent._color._koyumavi /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="EditTextAntranorGorusleriAciklama.Hint = \"Antranö";
Debug.ShouldStop(256);
antranorgorusekle.mostCurrent._edittextantranorgorusleriaciklama.runMethod(true,"setHint",BA.ObjectToString("Antranör görüşlerinizi bu alana yazabilirsiniz.."));
 BA.debugLineNum = 42;BA.debugLine="EditTextAntranorGorusleriAciklama.HintColor = Col";
Debug.ShouldStop(512);
antranorgorusekle.mostCurrent._edittextantranorgorusleriaciklama.runMethod(true,"setHintColor",antranorgorusekle.mostCurrent._color._acikmavi /*RemoteObject*/ );
 BA.debugLineNum = 43;BA.debugLine="EditTextAntranorGorusleriAciklama.TextSize = 20";
Debug.ShouldStop(1024);
antranorgorusekle.mostCurrent._edittextantranorgorusleriaciklama.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 44;BA.debugLine="EditTextAntranorGorusleriAciklama.Typeface = Type";
Debug.ShouldStop(2048);
antranorgorusekle.mostCurrent._edittextantranorgorusleriaciklama.runMethod(false,"setTypeface",antranorgorusekle.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 48;BA.debugLine="HTMLGosterDB";
Debug.ShouldStop(32768);
_htmlgosterdb();
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Activity_Pause (antranorgorusekle) ","antranorgorusekle",11,antranorgorusekle.mostCurrent.activityBA,antranorgorusekle.mostCurrent,56);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.antranorgorusekle.remoteMe.runUserSub(false, "antranorgorusekle","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 56;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Activity_Resume (antranorgorusekle) ","antranorgorusekle",11,antranorgorusekle.mostCurrent.activityBA,antranorgorusekle.mostCurrent,52);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.antranorgorusekle.remoteMe.runUserSub(false, "antranorgorusekle","activity_resume");}
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonantranorgorusleriekle_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAntranorGorusleriEkle_Click (antranorgorusekle) ","antranorgorusekle",11,antranorgorusekle.mostCurrent.activityBA,antranorgorusekle.mostCurrent,79);
if (RapidSub.canDelegate("buttonantranorgorusleriekle_click")) { return b4a.example3.antranorgorusekle.remoteMe.runUserSub(false, "antranorgorusekle","buttonantranorgorusleriekle_click");}
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _now = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 79;BA.debugLine="Sub ButtonAntranorGorusleriEkle_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="Dim result As Int";
Debug.ShouldStop(32768);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 81;BA.debugLine="result = Msgbox2(\"Antranor Görüşlerini eklemek is";
Debug.ShouldStop(65536);
_result = antranorgorusekle.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Antranor Görüşlerini eklemek istiyor musunuz?:")),(Object)(BA.ObjectToCharSequence("Onay Mesajı")),(Object)(BA.ObjectToString("Evet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Hayır")),(Object)((antranorgorusekle.mostCurrent.__c.getField(false,"Null"))),antranorgorusekle.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 82;BA.debugLine="If result= DialogResponse.POSITIVE Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, antranorgorusekle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 83;BA.debugLine="Dim now As Long = DateTime.Now";
Debug.ShouldStop(262144);
_now = antranorgorusekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("now", _now);Debug.locals.put("now", _now);
 BA.debugLineNum = 84;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
Debug.ShouldStop(524288);
antranorgorusekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 85;BA.debugLine="Log(DateTime.Date(now))";
Debug.ShouldStop(1048576);
antranorgorusekle.mostCurrent.__c.runVoidMethod ("LogImpl","211927558",antranorgorusekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_now)),0);
 BA.debugLineNum = 86;BA.debugLine="secilenTarih = DateTime.Date(now)";
Debug.ShouldStop(2097152);
antranorgorusekle.mostCurrent._secilentarih = antranorgorusekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_now));
 BA.debugLineNum = 87;BA.debugLine="Log(DateTime.Time(now))";
Debug.ShouldStop(4194304);
antranorgorusekle.mostCurrent.__c.runVoidMethod ("LogImpl","211927560",antranorgorusekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_now)),0);
 BA.debugLineNum = 88;BA.debugLine="secilenSaat = DateTime.Time(now)";
Debug.ShouldStop(8388608);
antranorgorusekle.mostCurrent._secilensaat = antranorgorusekle.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_now));
 BA.debugLineNum = 89;BA.debugLine="ID";
Debug.ShouldStop(16777216);
_id();
 BA.debugLineNum = 90;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO AntranorGoru";
Debug.ShouldStop(33554432);
antranorgorusekle.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO AntranorGorusleri VALUES(?,?,?,?,?)")),(Object)(antranorgorusekle.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(antranorgorusekle._antranorgorusleriid),(antranorgorusekle.mostCurrent._testdenekara._secilendenek /*RemoteObject*/ ),(antranorgorusekle.mostCurrent._secilentarih),(antranorgorusekle.mostCurrent._secilensaat),(antranorgorusekle.mostCurrent._edittextantranorgorusleriaciklama.runMethod(true,"getText"))})))));
 BA.debugLineNum = 91;BA.debugLine="Log(\"Antranor görüşleri eklendi\")";
Debug.ShouldStop(67108864);
antranorgorusekle.mostCurrent.__c.runVoidMethod ("LogImpl","211927564",RemoteObject.createImmutable("Antranor görüşleri eklendi"),0);
 BA.debugLineNum = 92;BA.debugLine="StartActivity(AntranorGorusListele)";
Debug.ShouldStop(134217728);
antranorgorusekle.mostCurrent.__c.runVoidMethod ("StartActivity",antranorgorusekle.processBA,(Object)((antranorgorusekle.mostCurrent._antranorgoruslistele.getObject())));
 BA.debugLineNum = 93;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
antranorgorusekle.mostCurrent._activity.runVoidMethod ("Finish");
 }else 
{ BA.debugLineNum = 94;BA.debugLine="Else If result= DialogResponse.NEGATIVE Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, antranorgorusekle.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
 BA.debugLineNum = 95;BA.debugLine="ToastMessageShow(\"Yönlendiriliyorsunuz...\",False";
Debug.ShouldStop(1073741824);
antranorgorusekle.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Yönlendiriliyorsunuz...")),(Object)(antranorgorusekle.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 96;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 }}
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private WebView1 As WebView";
antranorgorusekle.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private EditTextAntranorGorusleriAciklama As Edit";
antranorgorusekle.mostCurrent._edittextantranorgorusleriaciklama = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private LabelAntranorGorusleriAciklama As Label";
antranorgorusekle.mostCurrent._labelantranorgorusleriaciklama = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonAntranorGorusleriEkle As Button";
antranorgorusekle.mostCurrent._buttonantranorgorusleriekle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim AntranorGorusleriID As Int";
antranorgorusekle._antranorgorusleriid = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 22;BA.debugLine="Dim rs As ResultSet";
antranorgorusekle.mostCurrent._rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim secilenTarih As String";
antranorgorusekle.mostCurrent._secilentarih = RemoteObject.createImmutable("");
 //BA.debugLineNum = 24;BA.debugLine="Dim secilenSaat As String";
antranorgorusekle.mostCurrent._secilensaat = RemoteObject.createImmutable("");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _htmlgosterdb() throws Exception{
try {
		Debug.PushSubsStack("HTMLGosterDB (antranorgorusekle) ","antranorgorusekle",11,antranorgorusekle.mostCurrent.activityBA,antranorgorusekle.mostCurrent,60);
if (RapidSub.canDelegate("htmlgosterdb")) { return b4a.example3.antranorgorusekle.remoteMe.runUserSub(false, "antranorgorusekle","htmlgosterdb");}
 BA.debugLineNum = 60;BA.debugLine="Sub HTMLGosterDB";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
Debug.ShouldStop(536870912);
antranorgorusekle.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(antranorgorusekle.mostCurrent._dbutils.runMethod(true,"_executehtml" /*RemoteObject*/ ,antranorgorusekle.mostCurrent.activityBA,(Object)(antranorgorusekle.mostCurrent._main._sql /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"),antranorgorusekle.mostCurrent._testdenekara._secilendenek /*RemoteObject*/ ,RemoteObject.createImmutable("'"))),(Object)((antranorgorusekle.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(antranorgorusekle.mostCurrent.__c.getField(true,"False")))));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("ID (antranorgorusekle) ","antranorgorusekle",11,antranorgorusekle.mostCurrent.activityBA,antranorgorusekle.mostCurrent,65);
if (RapidSub.canDelegate("id")) { return b4a.example3.antranorgorusekle.remoteMe.runUserSub(false, "antranorgorusekle","id");}
RemoteObject _sf = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
 BA.debugLineNum = 65;BA.debugLine="Sub ID";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Dim sf As StringFunctions";
Debug.ShouldStop(2);
_sf = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");Debug.locals.put("sf", _sf);
 BA.debugLineNum = 67;BA.debugLine="sf.initialize";
Debug.ShouldStop(4);
_sf.runVoidMethod ("_initialize",antranorgorusekle.processBA);
 BA.debugLineNum = 69;BA.debugLine="rs= Main.sql.ExecQuery(\"SELECT * FROM AntranorGor";
Debug.ShouldStop(16);
antranorgorusekle.mostCurrent._rs.setObject(antranorgorusekle.mostCurrent._main._sql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM AntranorGorusleri ORDER BY antranorGorüsleri_id DESC"))));
 BA.debugLineNum = 70;BA.debugLine="If rs.RowCount>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",antranorgorusekle.mostCurrent._rs.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 71;BA.debugLine="rs.Position=0";
Debug.ShouldStop(64);
antranorgorusekle.mostCurrent._rs.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 72;BA.debugLine="AntranorGorusleriID = sf.Right(\"00\" &sf.Trim(sf.";
Debug.ShouldStop(128);
antranorgorusekle._antranorgorusleriid = BA.numberCast(int.class, _sf.runMethod(true,"_vvvvv7",(Object)(RemoteObject.concat(RemoteObject.createImmutable("00"),_sf.runMethod(true,"_vvvvvvv4",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_sf.runMethod(true,"_vvvvvvv6",(Object)(_sf.runMethod(true,"_vvvvv7",(Object)(antranorgorusekle.mostCurrent._rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("antranorGorüsleri_id")))),(Object)(BA.numberCast(long.class, 3))))),RemoteObject.createImmutable(1)}, "+",1, 0)))))),(Object)(BA.numberCast(long.class, 3))));
 }else {
 BA.debugLineNum = 74;BA.debugLine="AntranorGorusleriID=\"001\"";
Debug.ShouldStop(512);
antranorgorusekle._antranorgorusleriid = BA.numberCast(int.class, "001");
 };
 BA.debugLineNum = 76;BA.debugLine="rs.Close";
Debug.ShouldStop(2048);
antranorgorusekle.mostCurrent._rs.runVoidMethod ("Close");
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}