package b4a.example3;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_click() throws Exception{
try {
		Debug.PushSubsStack("Activity_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,96);
if (RapidSub.canDelegate("activity_click")) { return b4a.example3.main.remoteMe.runUserSub(false, "main","activity_click");}
 BA.debugLineNum = 96;BA.debugLine="Sub Activity_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._anamenu.getObject())));
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
public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) { b4a.example3.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(b4a.example3.main parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example3.main parent;
RemoteObject _firsttime;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,24);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 8;
if (_firsttime.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 26;BA.debugLine="sql.Initialize(File.DirDefaultExternal, \"SE_Data";
Debug.ShouldStop(33554432);
parent._sql.runVoidMethod ("Initialize",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("SE_DatabaseVs1.db")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 28;BA.debugLine="If DBUtils.TableExists(sql, \"Denek\") = False The";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._dbutils.runMethod(true,"_tableexists" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent._sql),(Object)(RemoteObject.createImmutable("Denek"))),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 29;BA.debugLine="Wait For (TabloOlustur) Complete (Success As Bo";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "activity_create"), _tabloolustur());
this.state = 9;
return;
case 9:
//C
this.state = 7;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 32;BA.debugLine="TabloDoldur";
Debug.ShouldStop(-2147483648);
_tablodoldur();
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 34;BA.debugLine="Activity.LoadLayout(\"GirisPage\")";
Debug.ShouldStop(2);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("GirisPage")),main.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="Sleep(3000)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "activity_create"),BA.numberCast(int.class, 3000));
this.state = 10;
return;
case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 36;BA.debugLine="StartActivity(AnaMenu)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((parent.mostCurrent._anamenu.getObject())));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject _success) throws Exception{
}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,43);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example3.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example3.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
antranorgorussil_subs_0._process_globals();
antranorgoruslistele_subs_0._process_globals();
dayanikliliktestlistele_subs_0._process_globals();
dayanikliliktestsil_subs_0._process_globals();
dayanikliliktestekle_subs_0._process_globals();
gelismistestdenekara_subs_0._process_globals();
programayar_subs_0._process_globals();
surattestlistele_subs_0._process_globals();
deneklistele_subs_0._process_globals();
dbutils_subs_0._process_globals();
antranorgorusekle_subs_0._process_globals();
programveri_subs_0._process_globals();
testdenekara_subs_0._process_globals();
denekekleguncelle_subs_0._process_globals();
dayanikliliktestmenu_subs_0._process_globals();
programlistele_subs_0._process_globals();
programsil_subs_0._process_globals();
surattestayar_subs_0._process_globals();
surattestekle_subs_0._process_globals();
surattestsil_subs_0._process_globals();
sesservice_subs_0._process_globals();
denekduzenlesil_subs_0._process_globals();
antropometriklistele_subs_0._process_globals();
saglikbilgilerisil_subs_0._process_globals();
testmenu_subs_0._process_globals();
motorozellikmenu_subs_0._process_globals();
saglikbilgilerilistele_subs_0._process_globals();
biyokimyasalekle_subs_0._process_globals();
antropometrikekle_subs_0._process_globals();
color_subs_0._process_globals();
anamenu_subs_0._process_globals();
insertveriler_subs_0._process_globals();
biyokimyasallistele_subs_0._process_globals();
biyokimyasalsil_subs_0._process_globals();
psikolojiksil_subs_0._process_globals();
psikolojiklistele_subs_0._process_globals();
antropometriksil_subs_0._process_globals();
psikolojikekle_subs_0._process_globals();
starter_subs_0._process_globals();
saglikbilgileriekle_subs_0._process_globals();
dikeysicramatest_subs_0._process_globals();
dengetest_subs_0._process_globals();
kuvvettest_subs_0._process_globals();
reaksiyontest_subs_0._process_globals();
programsec_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example3.main");
antranorgorussil.myClass = BA.getDeviceClass ("b4a.example3.antranorgorussil");
antranorgoruslistele.myClass = BA.getDeviceClass ("b4a.example3.antranorgoruslistele");
dayanikliliktestlistele.myClass = BA.getDeviceClass ("b4a.example3.dayanikliliktestlistele");
dayanikliliktestsil.myClass = BA.getDeviceClass ("b4a.example3.dayanikliliktestsil");
dayanikliliktestekle.myClass = BA.getDeviceClass ("b4a.example3.dayanikliliktestekle");
gelismistestdenekara.myClass = BA.getDeviceClass ("b4a.example3.gelismistestdenekara");
programayar.myClass = BA.getDeviceClass ("b4a.example3.programayar");
surattestlistele.myClass = BA.getDeviceClass ("b4a.example3.surattestlistele");
deneklistele.myClass = BA.getDeviceClass ("b4a.example3.deneklistele");
dbutils.myClass = BA.getDeviceClass ("b4a.example3.dbutils");
antranorgorusekle.myClass = BA.getDeviceClass ("b4a.example3.antranorgorusekle");
programveri.myClass = BA.getDeviceClass ("b4a.example3.programveri");
testdenekara.myClass = BA.getDeviceClass ("b4a.example3.testdenekara");
denekekleguncelle.myClass = BA.getDeviceClass ("b4a.example3.denekekleguncelle");
dayanikliliktestmenu.myClass = BA.getDeviceClass ("b4a.example3.dayanikliliktestmenu");
programlistele.myClass = BA.getDeviceClass ("b4a.example3.programlistele");
programsil.myClass = BA.getDeviceClass ("b4a.example3.programsil");
surattestayar.myClass = BA.getDeviceClass ("b4a.example3.surattestayar");
surattestekle.myClass = BA.getDeviceClass ("b4a.example3.surattestekle");
surattestsil.myClass = BA.getDeviceClass ("b4a.example3.surattestsil");
sesservice.myClass = BA.getDeviceClass ("b4a.example3.sesservice");
denekduzenlesil.myClass = BA.getDeviceClass ("b4a.example3.denekduzenlesil");
antropometriklistele.myClass = BA.getDeviceClass ("b4a.example3.antropometriklistele");
saglikbilgilerisil.myClass = BA.getDeviceClass ("b4a.example3.saglikbilgilerisil");
testmenu.myClass = BA.getDeviceClass ("b4a.example3.testmenu");
motorozellikmenu.myClass = BA.getDeviceClass ("b4a.example3.motorozellikmenu");
saglikbilgilerilistele.myClass = BA.getDeviceClass ("b4a.example3.saglikbilgilerilistele");
biyokimyasalekle.myClass = BA.getDeviceClass ("b4a.example3.biyokimyasalekle");
antropometrikekle.myClass = BA.getDeviceClass ("b4a.example3.antropometrikekle");
color.myClass = BA.getDeviceClass ("b4a.example3.color");
anamenu.myClass = BA.getDeviceClass ("b4a.example3.anamenu");
insertveriler.myClass = BA.getDeviceClass ("b4a.example3.insertveriler");
fileprovider.myClass = BA.getDeviceClass ("b4a.example3.fileprovider");
biyokimyasallistele.myClass = BA.getDeviceClass ("b4a.example3.biyokimyasallistele");
biyokimyasalsil.myClass = BA.getDeviceClass ("b4a.example3.biyokimyasalsil");
psikolojiksil.myClass = BA.getDeviceClass ("b4a.example3.psikolojiksil");
psikolojiklistele.myClass = BA.getDeviceClass ("b4a.example3.psikolojiklistele");
antropometriksil.myClass = BA.getDeviceClass ("b4a.example3.antropometriksil");
psikolojikekle.myClass = BA.getDeviceClass ("b4a.example3.psikolojikekle");
starter.myClass = BA.getDeviceClass ("b4a.example3.starter");
saglikbilgileriekle.myClass = BA.getDeviceClass ("b4a.example3.saglikbilgileriekle");
dikeysicramatest.myClass = BA.getDeviceClass ("b4a.example3.dikeysicramatest");
dengetest.myClass = BA.getDeviceClass ("b4a.example3.dengetest");
kuvvettest.myClass = BA.getDeviceClass ("b4a.example3.kuvvettest");
reaksiyontest.myClass = BA.getDeviceClass ("b4a.example3.reaksiyontest");
programsec.myClass = BA.getDeviceClass ("b4a.example3.programsec");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim sql As SQL";
main._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 17;BA.debugLine="Dim Status As String ' değişkeni kaydetme veya gü";
main._status = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tablodoldur() throws Exception{
try {
		Debug.PushSubsStack("TabloDoldur (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,88);
if (RapidSub.canDelegate("tablodoldur")) { return b4a.example3.main.remoteMe.runUserSub(false, "main","tablodoldur");}
 BA.debugLineNum = 88;BA.debugLine="Sub TabloDoldur";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="InsertVeriler.SehirlerTablosunuDoldur";
Debug.ShouldStop(16777216);
main.mostCurrent._insertveriler.runVoidMethod ("_sehirlertablosunudoldur" /*RemoteObject*/ ,main.mostCurrent.activityBA);
 BA.debugLineNum = 90;BA.debugLine="InsertVeriler.CinsiyetTablosunuDoldur";
Debug.ShouldStop(33554432);
main.mostCurrent._insertveriler.runVoidMethod ("_cinsiyettablosunudoldur" /*RemoteObject*/ ,main.mostCurrent.activityBA);
 BA.debugLineNum = 91;BA.debugLine="InsertVeriler.GunTablosunuDoldur";
Debug.ShouldStop(67108864);
main.mostCurrent._insertveriler.runVoidMethod ("_guntablosunudoldur" /*RemoteObject*/ ,main.mostCurrent.activityBA);
 BA.debugLineNum = 92;BA.debugLine="InsertVeriler.AyTablosunuDoldur";
Debug.ShouldStop(134217728);
main.mostCurrent._insertveriler.runVoidMethod ("_aytablosunudoldur" /*RemoteObject*/ ,main.mostCurrent.activityBA);
 BA.debugLineNum = 93;BA.debugLine="InsertVeriler.YilTablosunuDoldur";
Debug.ShouldStop(268435456);
main.mostCurrent._insertveriler.runVoidMethod ("_yiltablosunudoldur" /*RemoteObject*/ ,main.mostCurrent.activityBA);
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tabloolustur() throws Exception{
try {
		Debug.PushSubsStack("TabloOlustur (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,47);
if (RapidSub.canDelegate("tabloolustur")) { return b4a.example3.main.remoteMe.runUserSub(false, "main","tabloolustur");}
ResumableSub_TabloOlustur rsub = new ResumableSub_TabloOlustur(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_TabloOlustur extends BA.ResumableSub {
public ResumableSub_TabloOlustur(b4a.example3.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example3.main parent;
RemoteObject _basarilimi = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TabloOlustur (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,47);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
 BA.debugLineNum = 48;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Cinsiyet\")";
Debug.ShouldStop(32768);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS Cinsiyet")));
 BA.debugLineNum = 49;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Iller\")";
Debug.ShouldStop(65536);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS Iller")));
 BA.debugLineNum = 50;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Gun\")";
Debug.ShouldStop(131072);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS Gun")));
 BA.debugLineNum = 51;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Ay\")";
Debug.ShouldStop(262144);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS Ay")));
 BA.debugLineNum = 52;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Yil\")";
Debug.ShouldStop(524288);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS Yil")));
 BA.debugLineNum = 53;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Denek\")";
Debug.ShouldStop(1048576);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS Denek")));
 BA.debugLineNum = 54;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Antropomet";
Debug.ShouldStop(2097152);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS Antropometrik")));
 BA.debugLineNum = 55;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Biyokimyas";
Debug.ShouldStop(4194304);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS Biyokimyasal")));
 BA.debugLineNum = 56;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Psikolojik";
Debug.ShouldStop(8388608);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS Psikolojik")));
 BA.debugLineNum = 57;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS SaglikBilg";
Debug.ShouldStop(16777216);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS SaglikBilgileri")));
 BA.debugLineNum = 58;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS AntranorGo";
Debug.ShouldStop(33554432);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS AntranorGorusleri")));
 BA.debugLineNum = 59;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS SuratTest\"";
Debug.ShouldStop(67108864);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS SuratTest")));
 BA.debugLineNum = 60;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Dayaniklil";
Debug.ShouldStop(134217728);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS DayaniklilikTestProgram")));
 BA.debugLineNum = 61;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Dayaniklil";
Debug.ShouldStop(268435456);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS DayaniklilikTest")));
 BA.debugLineNum = 64;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE Cinsiyet(cinsiyet_";
Debug.ShouldStop(-2147483648);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE Cinsiyet(cinsiyet_id int NOT NULL, cinsiyet_adi varchar(10) NOT NULL, PRIMARY KEY(cinsiyet_id))")));
 BA.debugLineNum = 65;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE Iller(il_id int NO";
Debug.ShouldStop(1);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE Iller(il_id int NOT NULL, il_adi varchar(50) NOT NULL, PRIMARY KEY(il_id))")));
 BA.debugLineNum = 66;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE Gun(gun_id int NOT";
Debug.ShouldStop(2);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE Gun(gun_id int NOT NULL, gun int NOT NULL, PRIMARY KEY(gun_id))")));
 BA.debugLineNum = 67;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE Ay(ay_id int NOT N";
Debug.ShouldStop(4);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE Ay(ay_id int NOT NULL, ay varchar(10) NOT NULL, PRIMARY KEY(ay_id))")));
 BA.debugLineNum = 68;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE Yil(yil_id int NOT";
Debug.ShouldStop(8);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE Yil(yil_id int NOT NULL, yil int NOT NULL, PRIMARY KEY(yil_id))")));
 BA.debugLineNum = 70;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE Denek (denek_id in";
Debug.ShouldStop(32);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE Denek (denek_id int NOT NULL, denek_tc bigint NOT NULL, denek_isim varchar(50) NOT NULL,cinsiyet_adi varchar(10), denek_dogumTarihi date ,il_adi varchar(50),denek_babaAdi varchar(50), denek_engelDurumu vachar(500) , denek_takimOkul varchar(500) , denek_bransSinif varchar(500) , denek_mevki varchar(500),denek_image blob, PRIMARY KEY(denek_id) FOREIGN KEY(cinsiyet_adi,il_adi) REFERENCES Cinsiyet(cinsiyet_adi,il_adi))")));
 BA.debugLineNum = 71;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE Antropometrik (ant";
Debug.ShouldStop(64);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE Antropometrik (antropometrik_id int NOT NULL,denek_id int, antropometrik_tarih date,antropometrik_saat long, antropometrik_boy int ,antropometrik_kilo int ,antropometrik_elUzunlugu int, antropometrik_kulacUzunlugu int ,antropometrik_oturmaYuksekligi int,antropometrik_ayakUzunlugu int,antropometrik_deriKivrimKalinligi int, PRIMARY KEY(antropometrik_id) FOREIGN KEY(denek_id) REFERENCES Denek(denek_id))")));
 BA.debugLineNum = 72;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE Biyokimyasal(biyok";
Debug.ShouldStop(128);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE Biyokimyasal(biyokimyasal_id int NOT NULL,denek_id int,biyokimyasal_tarih date,biyokimyasal_saat long, biyokimyasal_aciklama varchar(500),PRIMARY KEY (biyokimyasal_id) FOREIGN KEY(denek_id) REFERENCES Denek(denek_id))")));
 BA.debugLineNum = 73;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE Psikolojik( psikol";
Debug.ShouldStop(256);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE Psikolojik( psikolojik_id int NOT NULL, denek_id int, psikolojik_tarih date, psikolojik_saat long, psikolojik_aciklama varchar(500),  PRIMARY KEY (psikolojik_id) FOREIGN KEY(denek_id) REFERENCES Denek(denek_id))")));
 BA.debugLineNum = 74;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE SaglikBilgileri(sa";
Debug.ShouldStop(512);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE SaglikBilgileri(saglikBilgileri_id int Not Null, denek_id int, saglikBilgileri_tarih date,saglikBilgileri_saat long, saglikBilgileri_hastalikSakatlik varchar(500), saglikBilgileri_aciklama varchar(500), PRIMARY KEY (saglikBilgileri_id) FOREIGN KEY(denek_id) REFERENCES Denek(denek_id))")));
 BA.debugLineNum = 75;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE AntranorGorusleri(";
Debug.ShouldStop(1024);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE AntranorGorusleri(antranorGorüsleri_id int Not Null, denek_id int, antranorGorüsleri_tarih date, antranorGorüsleri_saat long, antranorGorüsleri_aciklama varchar(500), PRIMARY KEY (antranorGorüsleri_id) FOREIGN KEY(denek_id) REFERENCES Denek(denek_id))")));
 BA.debugLineNum = 76;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE SuratTest(surat_id";
Debug.ShouldStop(2048);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE SuratTest(surat_id int NOT NULL, denek_id int, mod varchar(20), surat_tarih date, surat_saat long, rest_dakika Int, rest_saniye Int, result Int, gateSayisi Int, setSayisi Int, veri1 long, veri2 long, veri3 long, veri4 long, veri5 long, veri6 long,veri7 long ,veri8 long,veri9 long,veri10 long,veri11 long,veri12 long,veri13 long,veri14 long,veri15 long,veri16 long,veri17 long,veri18 long,veri19 long,veri20 long,veri21 long,veri22 long,veri23 long,veri24 long,veri25 long,veri26 long,veri27 long,veri28 long,veri29 long,veri30 long,veri31 long,veri32 long,veri33 long,veri34 long,veri35 long,veri36 long,veri37 long,veri38 long,veri39 long,veri40 long,veri41 long,veri42 long,veri43 long,veri44 long,veri45 long,veri46 long,veri47 long,veri48 long,veri49 long,veri50 long,veri51 long,veri52 long,veri53 long,veri54 long,veri55 long,veri56 long,veri57 long,veri58 long,veri59 long,veri60 long,veri61 long,veri62 long,veri63 long,veri64 long,veri65 long,veri66 long,veri67 long,veri68 long,veri69 long,veri70 long,veri71 long,veri72 long,veri73 long,veri74 long,veri75 long,veri76 long,veri77 long,veri78 long,veri79 long,veri80 long,veri81 long,veri82 long,veri83 long,veri84 long,veri85 long,veri86 long,veri87 long,veri88 long,veri89 long,veri90 long,veri91 long,veri92 long,veri93 long,veri94 long,veri95 long,veri96 long,veri97 long,veri98 long,veri99 long,veri100 long, PRIMARY KEY(surat_id) FOREIGN KEY(denek_id) REFERENCES Denek(denek_id))")));
 BA.debugLineNum = 77;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE DayaniklilikTestPr";
Debug.ShouldStop(4096);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE DayaniklilikTestProgram (program_id int NOT NULL, program_adi varchar(50), program_tarih date, program_saat long, level int, program_testTuru varchar(20), koniMesafesi1 float, hiz1 float, dakika1 int, saniye1 int, koniMesafesi2 float,hiz2 float, dakika2 int, saniye2 int, koniMesafesi3 float,hiz3 float, dakika3 int, saniye3 int, koniMesafesi4 float, hiz4 float, dakika4 int, saniye4 int, koniMesafesi5 float, hiz5 float, dakika5 int, saniye5 int, koniMesafesi6 float, hiz6 float, dakika6 int, saniye6 int, koniMesafesi7 float, hiz7 float, dakika7 int, saniye7 int, koniMesafesi8 float, hiz8 float, dakika8 int, saniye8 int, koniMesafesi9 float, hiz9 float, dakika9 int, saniye9 int, koniMesafesi10 float, hiz10 float, dakika10 int, saniye10 int, koniMesafesi11 float, hiz11 float, dakika11 int, saniye11 int, koniMesafesi12 float, hiz12 float, dakika12 int, saniye12 int, koniMesafesi13 float, hiz13 float, dakika13 int, saniye13 int, koniMesafesi14 float, hiz14 float, dakika14 int, saniye14 int, koniMesafesi15 float, hiz15 float, dakika15 int, saniye15 int, koniMesafesi16 float, hiz16 float, dakika16 int, saniye16 int, koniMesafesi17 float, hiz17 float, dakika17 int, saniye17 int, koniMesafesi18 float, hiz18 float, dakika18 int, saniye18 int, koniMesafesi19 float, hiz19 float, dakika19 int, saniye19 int, koniMesafesi20 float, hiz20 float, dakika20 int, saniye20 int, koniMesafesi21 float, hiz21 float, dakika21 int, saniye21 int , koniMesafesi22 float, hiz22 float, dakika22 int, saniye22 int ,koniMesafesi23 float, hiz23 float, dakika23 int, saniye23 int , koniMesafesi24 float, hiz24 float, dakika24 int, saniye24 int, koniMesafesi25 float,hiz25 float, dakika25 int, saniye25 int, PRIMARY KEY (program_id))")));
 BA.debugLineNum = 78;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE DayaniklilikTest (";
Debug.ShouldStop(8192);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE DayaniklilikTest (dayaniklilik_id int NOT NULL, denekId1 int, denektc1 bigint, denekIsim1 varchar(50), denekId2 int, denektc2 bigint, denekIsim2 varchar(50),denekId3 int, denektc3 bigint, denekIsim3 varchar(50),denekId4 int, denektc4 bigint, denekIsim4 varchar(50),denekId5 int, denektc5 bigint, denekIsim5 varchar(50),denekId6 int, denektc6 bigint, denekIsim6 varchar(50),denekId7 int, denektc7 bigint, denekIsim7 varchar(50),denekId8 int, denektc8 bigint, denekIsim8 varchar(50),denekId9 int, denektc9 bigint, denekIsim9 varchar(50),denekId10 int, denektc10 bigint, denekIsim10 varchar(50), program_id int, mekik_sayisi int, dayaniklilik_tarih date, dayaniklilik_saat long, PRIMARY KEY(dayaniklilik_id) FOREIGN KEY(denekId1,denekId2,denekId3,denekId4,denekId5,denekId6,denekId7,denekId8,denekId9,denekId10,program_id) REFERENCES DayaniklilikTestProgram(denekId1,denekId2,denekId3,denekId4,denekId5,denekId6,denekId7,denekId8,denekId9,denekId10,program_id) )")));
 BA.debugLineNum = 79;BA.debugLine="Log(\"dayanıklılık test oluşturuldu\")";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","227656224",RemoteObject.createImmutable("dayanıklılık test oluşturuldu"),0);
 BA.debugLineNum = 81;BA.debugLine="Dim basariliMi As Object = sql.ExecNonQueryBatch(";
Debug.ShouldStop(65536);
_basarilimi = parent._sql.runMethod(false,"ExecNonQueryBatch",main.processBA,(Object)(RemoteObject.createImmutable("SportExpert")));Debug.locals.put("basariliMi", _basarilimi);Debug.locals.put("basariliMi", _basarilimi);
 BA.debugLineNum = 82;BA.debugLine="Wait For (basariliMi) SportExpert_NonQueryComplet";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","sportexpert_nonquerycomplete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "tabloolustur"), _basarilimi);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 83;BA.debugLine="Log(\"Create Table işlemleri  \" &Success)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","227656228",RemoteObject.concat(RemoteObject.createImmutable("Create Table işlemleri  "),_success),0);
 BA.debugLineNum = 84;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _sportexpert_nonquerycomplete(RemoteObject _success) throws Exception{
}
}