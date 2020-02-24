
package b4a.example3;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class dikeysicramatest implements IRemote{
	public static dikeysicramatest mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public dikeysicramatest() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("dikeysicramatest"), "b4a.example3.dikeysicramatest");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, dikeysicramatest.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example3.main _main = null;
public static b4a.example3.antranorgorussil _antranorgorussil = null;
public static b4a.example3.antranorgoruslistele _antranorgoruslistele = null;
public static b4a.example3.dayanikliliktestlistele _dayanikliliktestlistele = null;
public static b4a.example3.dayanikliliktestsil _dayanikliliktestsil = null;
public static b4a.example3.dayanikliliktestekle _dayanikliliktestekle = null;
public static b4a.example3.gelismistestdenekara _gelismistestdenekara = null;
public static b4a.example3.programayar _programayar = null;
public static b4a.example3.surattestlistele _surattestlistele = null;
public static b4a.example3.deneklistele _deneklistele = null;
public static b4a.example3.dbutils _dbutils = null;
public static b4a.example3.antranorgorusekle _antranorgorusekle = null;
public static b4a.example3.programveri _programveri = null;
public static b4a.example3.testdenekara _testdenekara = null;
public static b4a.example3.denekekleguncelle _denekekleguncelle = null;
public static b4a.example3.dayanikliliktestmenu _dayanikliliktestmenu = null;
public static b4a.example3.programlistele _programlistele = null;
public static b4a.example3.programsil _programsil = null;
public static b4a.example3.surattestayar _surattestayar = null;
public static b4a.example3.surattestekle _surattestekle = null;
public static b4a.example3.surattestsil _surattestsil = null;
public static b4a.example3.sesservice _sesservice = null;
public static b4a.example3.denekduzenlesil _denekduzenlesil = null;
public static b4a.example3.antropometriklistele _antropometriklistele = null;
public static b4a.example3.saglikbilgilerisil _saglikbilgilerisil = null;
public static b4a.example3.testmenu _testmenu = null;
public static b4a.example3.motorozellikmenu _motorozellikmenu = null;
public static b4a.example3.saglikbilgilerilistele _saglikbilgilerilistele = null;
public static b4a.example3.biyokimyasalekle _biyokimyasalekle = null;
public static b4a.example3.antropometrikekle _antropometrikekle = null;
public static b4a.example3.color _color = null;
public static b4a.example3.anamenu _anamenu = null;
public static b4a.example3.insertveriler _insertveriler = null;
public static b4a.example3.biyokimyasallistele _biyokimyasallistele = null;
public static b4a.example3.biyokimyasalsil _biyokimyasalsil = null;
public static b4a.example3.psikolojiksil _psikolojiksil = null;
public static b4a.example3.psikolojiklistele _psikolojiklistele = null;
public static b4a.example3.antropometriksil _antropometriksil = null;
public static b4a.example3.psikolojikekle _psikolojikekle = null;
public static b4a.example3.starter _starter = null;
public static b4a.example3.saglikbilgileriekle _saglikbilgileriekle = null;
public static b4a.example3.dengetest _dengetest = null;
public static b4a.example3.kuvvettest _kuvvettest = null;
public static b4a.example3.reaksiyontest _reaksiyontest = null;
public static b4a.example3.programsec _programsec = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",dikeysicramatest.mostCurrent._activity,"AnaMenu",Debug.moduleToString(b4a.example3.anamenu.class),"AntranorGorusEkle",Debug.moduleToString(b4a.example3.antranorgorusekle.class),"AntranorGorusListele",Debug.moduleToString(b4a.example3.antranorgoruslistele.class),"AntranorGorusSil",Debug.moduleToString(b4a.example3.antranorgorussil.class),"AntropometrikEkle",Debug.moduleToString(b4a.example3.antropometrikekle.class),"AntropometrikListele",Debug.moduleToString(b4a.example3.antropometriklistele.class),"AntropometrikSil",Debug.moduleToString(b4a.example3.antropometriksil.class),"BiyokimyasalEkle",Debug.moduleToString(b4a.example3.biyokimyasalekle.class),"BiyokimyasalListele",Debug.moduleToString(b4a.example3.biyokimyasallistele.class),"BiyokimyasalSil",Debug.moduleToString(b4a.example3.biyokimyasalsil.class),"Color",Debug.moduleToString(b4a.example3.color.class),"DateUtils",dikeysicramatest.mostCurrent._dateutils,"DayaniklilikTestEkle",Debug.moduleToString(b4a.example3.dayanikliliktestekle.class),"DayaniklilikTestListele",Debug.moduleToString(b4a.example3.dayanikliliktestlistele.class),"DayaniklilikTestMenu",Debug.moduleToString(b4a.example3.dayanikliliktestmenu.class),"DayaniklilikTestSil",Debug.moduleToString(b4a.example3.dayanikliliktestsil.class),"DBUtils",Debug.moduleToString(b4a.example3.dbutils.class),"DenekDuzenleSil",Debug.moduleToString(b4a.example3.denekduzenlesil.class),"DenekEkleGuncelle",Debug.moduleToString(b4a.example3.denekekleguncelle.class),"DenekListele",Debug.moduleToString(b4a.example3.deneklistele.class),"DengeTest",Debug.moduleToString(b4a.example3.dengetest.class),"GelismisTestDenekAra",Debug.moduleToString(b4a.example3.gelismistestdenekara.class),"InsertVeriler",Debug.moduleToString(b4a.example3.insertveriler.class),"KuvvetTest",Debug.moduleToString(b4a.example3.kuvvettest.class),"Main",Debug.moduleToString(b4a.example3.main.class),"MotorOzellikMenu",Debug.moduleToString(b4a.example3.motorozellikmenu.class),"ProgramAyar",Debug.moduleToString(b4a.example3.programayar.class),"ProgramListele",Debug.moduleToString(b4a.example3.programlistele.class),"ProgramSec",Debug.moduleToString(b4a.example3.programsec.class),"ProgramSil",Debug.moduleToString(b4a.example3.programsil.class),"ProgramVeri",Debug.moduleToString(b4a.example3.programveri.class),"PsikolojikEkle",Debug.moduleToString(b4a.example3.psikolojikekle.class),"PsikolojikListele",Debug.moduleToString(b4a.example3.psikolojiklistele.class),"PsikolojikSil",Debug.moduleToString(b4a.example3.psikolojiksil.class),"ReaksiyonTest",Debug.moduleToString(b4a.example3.reaksiyontest.class),"SaglikBilgileriEkle",Debug.moduleToString(b4a.example3.saglikbilgileriekle.class),"SaglikBilgileriListele",Debug.moduleToString(b4a.example3.saglikbilgilerilistele.class),"SaglikBilgileriSil",Debug.moduleToString(b4a.example3.saglikbilgilerisil.class),"SesService",Debug.moduleToString(b4a.example3.sesservice.class),"Starter",Debug.moduleToString(b4a.example3.starter.class),"SuratTestAyar",Debug.moduleToString(b4a.example3.surattestayar.class),"SuratTestEkle",Debug.moduleToString(b4a.example3.surattestekle.class),"SuratTestListele",Debug.moduleToString(b4a.example3.surattestlistele.class),"SuratTestSil",Debug.moduleToString(b4a.example3.surattestsil.class),"TestDenekAra",Debug.moduleToString(b4a.example3.testdenekara.class),"TestMenu",Debug.moduleToString(b4a.example3.testmenu.class)};
}
}