
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

public class denekekleguncelle implements IRemote{
	public static denekekleguncelle mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public denekekleguncelle() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("denekekleguncelle"), "b4a.example3.denekekleguncelle");
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
		pcBA = new PCBA(this, denekekleguncelle.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ion = RemoteObject.declareNull("Object");
public static RemoteObject _tempimagefile = RemoteObject.createImmutable("");
public static RemoteObject _lastpicture = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _imagechooser = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.ContentChooser");
public static RemoteObject _buffer = null;
public static RemoteObject _edittextkimlikno = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittextisim = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _spinnercinsiyet = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _spinnerdogumyeri = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _edittextbabaadi = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittextengeldurumu = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittexttakimokul = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittextbranssinif = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittextmevki = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _imageview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _result = RemoteObject.createImmutable(0);
public static RemoteObject _denekid = RemoteObject.createImmutable("");
public static RemoteObject _secilencinsiyet = RemoteObject.createImmutable("");
public static RemoteObject _secilendogumyeri = RemoteObject.createImmutable("");
public static RemoteObject _secilendogumtarihi = RemoteObject.createImmutable("");
public static RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
public static RemoteObject _buttondenekok = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttondogumtarihi = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonyukle = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelfotocek = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _labelkimlikno = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelisim = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelcinsiyet = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeldogumtarihi = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeldogumyeri = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelbabaadi = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _checkboxengeldurumu = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _labeltakimokul = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelbranssinif = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelmevki = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _kayittürü = RemoteObject.createImmutable("");
public static RemoteObject _buttonfotocek = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _labelgun = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelay = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelyil = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _spinnergun = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _spinneray = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _spinneryil = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _secilengun = RemoteObject.createImmutable(0);
public static RemoteObject _secilenay = RemoteObject.createImmutable("");
public static RemoteObject _secilenyil = RemoteObject.createImmutable(0);
public static RemoteObject _buttontarihayar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
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
public static b4a.example3.dikeysicramatest _dikeysicramatest = null;
public static b4a.example3.dengetest _dengetest = null;
public static b4a.example3.kuvvettest _kuvvettest = null;
public static b4a.example3.reaksiyontest _reaksiyontest = null;
public static b4a.example3.programsec _programsec = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",denekekleguncelle.mostCurrent._activity,"AnaMenu",Debug.moduleToString(b4a.example3.anamenu.class),"AntranorGorusEkle",Debug.moduleToString(b4a.example3.antranorgorusekle.class),"AntranorGorusListele",Debug.moduleToString(b4a.example3.antranorgoruslistele.class),"AntranorGorusSil",Debug.moduleToString(b4a.example3.antranorgorussil.class),"AntropometrikEkle",Debug.moduleToString(b4a.example3.antropometrikekle.class),"AntropometrikListele",Debug.moduleToString(b4a.example3.antropometriklistele.class),"AntropometrikSil",Debug.moduleToString(b4a.example3.antropometriksil.class),"BiyokimyasalEkle",Debug.moduleToString(b4a.example3.biyokimyasalekle.class),"BiyokimyasalListele",Debug.moduleToString(b4a.example3.biyokimyasallistele.class),"BiyokimyasalSil",Debug.moduleToString(b4a.example3.biyokimyasalsil.class),"Buffer",denekekleguncelle._buffer,"ButtonDenekOk",denekekleguncelle.mostCurrent._buttondenekok,"ButtonDogumTarihi",denekekleguncelle.mostCurrent._buttondogumtarihi,"ButtonFotoCek",denekekleguncelle.mostCurrent._buttonfotocek,"ButtonTarihAyar",denekekleguncelle.mostCurrent._buttontarihayar,"ButtonYukle",denekekleguncelle.mostCurrent._buttonyukle,"CheckBoxEngelDurumu",denekekleguncelle.mostCurrent._checkboxengeldurumu,"Color",Debug.moduleToString(b4a.example3.color.class),"DateUtils",denekekleguncelle.mostCurrent._dateutils,"DayaniklilikTestEkle",Debug.moduleToString(b4a.example3.dayanikliliktestekle.class),"DayaniklilikTestListele",Debug.moduleToString(b4a.example3.dayanikliliktestlistele.class),"DayaniklilikTestMenu",Debug.moduleToString(b4a.example3.dayanikliliktestmenu.class),"DayaniklilikTestSil",Debug.moduleToString(b4a.example3.dayanikliliktestsil.class),"DBUtils",Debug.moduleToString(b4a.example3.dbutils.class),"DenekDuzenleSil",Debug.moduleToString(b4a.example3.denekduzenlesil.class),"DenekID",denekekleguncelle.mostCurrent._denekid,"DenekListele",Debug.moduleToString(b4a.example3.deneklistele.class),"DengeTest",Debug.moduleToString(b4a.example3.dengetest.class),"DikeySicramaTest",Debug.moduleToString(b4a.example3.dikeysicramatest.class),"EditTextBabaAdi",denekekleguncelle.mostCurrent._edittextbabaadi,"EditTextBransSinif",denekekleguncelle.mostCurrent._edittextbranssinif,"EditTextEngelDurumu",denekekleguncelle.mostCurrent._edittextengeldurumu,"EditTextIsim",denekekleguncelle.mostCurrent._edittextisim,"EditTextKimlikNo",denekekleguncelle.mostCurrent._edittextkimlikno,"EditTextMevki",denekekleguncelle.mostCurrent._edittextmevki,"EditTextTakimOkul",denekekleguncelle.mostCurrent._edittexttakimokul,"GelismisTestDenekAra",Debug.moduleToString(b4a.example3.gelismistestdenekara.class),"ImageChooser",denekekleguncelle._imagechooser,"ImageView1",denekekleguncelle.mostCurrent._imageview1,"InsertVeriler",Debug.moduleToString(b4a.example3.insertveriler.class),"ion",denekekleguncelle._ion,"kayitTürü",denekekleguncelle.mostCurrent._kayittürü,"KuvvetTest",Debug.moduleToString(b4a.example3.kuvvettest.class),"LabelAy",denekekleguncelle.mostCurrent._labelay,"LabelBabaAdi",denekekleguncelle.mostCurrent._labelbabaadi,"LabelBransSinif",denekekleguncelle.mostCurrent._labelbranssinif,"LabelCinsiyet",denekekleguncelle.mostCurrent._labelcinsiyet,"LabelDogumTarihi",denekekleguncelle.mostCurrent._labeldogumtarihi,"LabelDogumYeri",denekekleguncelle.mostCurrent._labeldogumyeri,"LabelGun",denekekleguncelle.mostCurrent._labelgun,"Labelisim",denekekleguncelle.mostCurrent._labelisim,"LabelKimlikNo",denekekleguncelle.mostCurrent._labelkimlikno,"LabelMevki",denekekleguncelle.mostCurrent._labelmevki,"LabelTakimOkul",denekekleguncelle.mostCurrent._labeltakimokul,"LabelYil",denekekleguncelle.mostCurrent._labelyil,"lastPicture",denekekleguncelle._lastpicture,"Main",Debug.moduleToString(b4a.example3.main.class),"MotorOzellikMenu",Debug.moduleToString(b4a.example3.motorozellikmenu.class),"Panel1",denekekleguncelle.mostCurrent._panel1,"Panel2",denekekleguncelle.mostCurrent._panel2,"PanelFotoCek",denekekleguncelle.mostCurrent._panelfotocek,"ProgramAyar",Debug.moduleToString(b4a.example3.programayar.class),"ProgramListele",Debug.moduleToString(b4a.example3.programlistele.class),"ProgramSec",Debug.moduleToString(b4a.example3.programsec.class),"ProgramSil",Debug.moduleToString(b4a.example3.programsil.class),"ProgramVeri",Debug.moduleToString(b4a.example3.programveri.class),"PsikolojikEkle",Debug.moduleToString(b4a.example3.psikolojikekle.class),"PsikolojikListele",Debug.moduleToString(b4a.example3.psikolojiklistele.class),"PsikolojikSil",Debug.moduleToString(b4a.example3.psikolojiksil.class),"ReaksiyonTest",Debug.moduleToString(b4a.example3.reaksiyontest.class),"result",denekekleguncelle._result,"rs",denekekleguncelle.mostCurrent._rs,"SaglikBilgileriEkle",Debug.moduleToString(b4a.example3.saglikbilgileriekle.class),"SaglikBilgileriListele",Debug.moduleToString(b4a.example3.saglikbilgilerilistele.class),"SaglikBilgileriSil",Debug.moduleToString(b4a.example3.saglikbilgilerisil.class),"secilenAy",denekekleguncelle.mostCurrent._secilenay,"secilenCinsiyet",denekekleguncelle.mostCurrent._secilencinsiyet,"secilenDogumTarihi",denekekleguncelle.mostCurrent._secilendogumtarihi,"secilenDogumYeri",denekekleguncelle.mostCurrent._secilendogumyeri,"secilenGun",denekekleguncelle._secilengun,"secilenYil",denekekleguncelle._secilenyil,"SesService",Debug.moduleToString(b4a.example3.sesservice.class),"SpinnerAy",denekekleguncelle.mostCurrent._spinneray,"SpinnerCinsiyet",denekekleguncelle.mostCurrent._spinnercinsiyet,"SpinnerDogumYeri",denekekleguncelle.mostCurrent._spinnerdogumyeri,"SpinnerGun",denekekleguncelle.mostCurrent._spinnergun,"SpinnerYil",denekekleguncelle.mostCurrent._spinneryil,"Starter",Debug.moduleToString(b4a.example3.starter.class),"SuratTestAyar",Debug.moduleToString(b4a.example3.surattestayar.class),"SuratTestEkle",Debug.moduleToString(b4a.example3.surattestekle.class),"SuratTestListele",Debug.moduleToString(b4a.example3.surattestlistele.class),"SuratTestSil",Debug.moduleToString(b4a.example3.surattestsil.class),"tempImageFile",denekekleguncelle._tempimagefile,"TestDenekAra",Debug.moduleToString(b4a.example3.testdenekara.class),"TestMenu",Debug.moduleToString(b4a.example3.testmenu.class)};
}
}