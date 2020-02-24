
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

public class gelismistestdenekara implements IRemote{
	public static gelismistestdenekara mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public gelismistestdenekara() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("gelismistestdenekara"), "b4a.example3.gelismistestdenekara");
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
		pcBA = new PCBA(this, gelismistestdenekara.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _checkedidlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _checkedtclist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _checkedisimlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _labelkimlikno = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelisim = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelcinsiyet = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeldogumtarihi = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeldogumyeri = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelbabaadi = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelengel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _edittextengeldurumu = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittextbabaadi = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _spinnerdogumyeri = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _buttondogumtarihi = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _spinnercinsiyet = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _edittextisim = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittextkimlikno = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _labeltakimokul = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelbranssinif = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelmevki = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _edittexttakimokul = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittextbranssinif = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittextmevki = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _buttonok = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _customlistview1 = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _labelid = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeldenekisim = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeldenektc = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _checkboxsecim = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _isim = RemoteObject.createImmutable("");
public static RemoteObject _tc = RemoteObject.createImmutable("");
public static RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
public static RemoteObject _panel2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _labelgun = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelay = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelyil = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _buttontarihayar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _spinnergun = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _spinneray = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _spinneryil = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _aracinsiyet = RemoteObject.createImmutable("");
public static RemoteObject _aradogumyeri = RemoteObject.createImmutable("");
public static RemoteObject _aradogumtarihi = RemoteObject.createImmutable("");
public static RemoteObject _araay = RemoteObject.createImmutable("");
public static RemoteObject _aragun = RemoteObject.createImmutable(0);
public static RemoteObject _arayil = RemoteObject.createImmutable(0);
public static RemoteObject _aratc = RemoteObject.createImmutable("");
public static RemoteObject _araisim = RemoteObject.createImmutable("");
public static RemoteObject _arababaadi = RemoteObject.createImmutable("");
public static RemoteObject _araengeldurumu = RemoteObject.createImmutable("");
public static RemoteObject _aratakimokul = RemoteObject.createImmutable("");
public static RemoteObject _arabranssinif = RemoteObject.createImmutable("");
public static RemoteObject _aramevki = RemoteObject.createImmutable("");
public static RemoteObject _silinenliste = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _labelcarpi1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelcarpi2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelcarpi3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelcarpi4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelcarpi5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelcarpi6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelcarpi7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example3.main _main = null;
public static b4a.example3.antranorgorussil _antranorgorussil = null;
public static b4a.example3.antranorgoruslistele _antranorgoruslistele = null;
public static b4a.example3.dayanikliliktestlistele _dayanikliliktestlistele = null;
public static b4a.example3.dayanikliliktestsil _dayanikliliktestsil = null;
public static b4a.example3.dayanikliliktestekle _dayanikliliktestekle = null;
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
public static b4a.example3.dikeysicramatest _dikeysicramatest = null;
public static b4a.example3.dengetest _dengetest = null;
public static b4a.example3.kuvvettest _kuvvettest = null;
public static b4a.example3.reaksiyontest _reaksiyontest = null;
public static b4a.example3.programsec _programsec = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",gelismistestdenekara.mostCurrent._activity,"AnaMenu",Debug.moduleToString(b4a.example3.anamenu.class),"AntranorGorusEkle",Debug.moduleToString(b4a.example3.antranorgorusekle.class),"AntranorGorusListele",Debug.moduleToString(b4a.example3.antranorgoruslistele.class),"AntranorGorusSil",Debug.moduleToString(b4a.example3.antranorgorussil.class),"AntropometrikEkle",Debug.moduleToString(b4a.example3.antropometrikekle.class),"AntropometrikListele",Debug.moduleToString(b4a.example3.antropometriklistele.class),"AntropometrikSil",Debug.moduleToString(b4a.example3.antropometriksil.class),"araAy",gelismistestdenekara.mostCurrent._araay,"araBabaAdi",gelismistestdenekara.mostCurrent._arababaadi,"araBransSinif",gelismistestdenekara.mostCurrent._arabranssinif,"araCinsiyet",gelismistestdenekara.mostCurrent._aracinsiyet,"araDogumTarihi",gelismistestdenekara.mostCurrent._aradogumtarihi,"araDogumYeri",gelismistestdenekara.mostCurrent._aradogumyeri,"araEngelDurumu",gelismistestdenekara.mostCurrent._araengeldurumu,"araGun",gelismistestdenekara._aragun,"araIsim",gelismistestdenekara.mostCurrent._araisim,"araMevki",gelismistestdenekara.mostCurrent._aramevki,"araTakimOkul",gelismistestdenekara.mostCurrent._aratakimokul,"araTc",gelismistestdenekara.mostCurrent._aratc,"araYil",gelismistestdenekara._arayil,"BiyokimyasalEkle",Debug.moduleToString(b4a.example3.biyokimyasalekle.class),"BiyokimyasalListele",Debug.moduleToString(b4a.example3.biyokimyasallistele.class),"BiyokimyasalSil",Debug.moduleToString(b4a.example3.biyokimyasalsil.class),"ButtonDogumTarihi",gelismistestdenekara.mostCurrent._buttondogumtarihi,"ButtonOK",gelismistestdenekara.mostCurrent._buttonok,"ButtonTarihAyar",gelismistestdenekara.mostCurrent._buttontarihayar,"CheckBoxSecim",gelismistestdenekara.mostCurrent._checkboxsecim,"checkedIdList",gelismistestdenekara._checkedidlist,"checkedIsimList",gelismistestdenekara._checkedisimlist,"checkedTcList",gelismistestdenekara._checkedtclist,"Color",Debug.moduleToString(b4a.example3.color.class),"CustomListView1",gelismistestdenekara.mostCurrent._customlistview1,"DateUtils",gelismistestdenekara.mostCurrent._dateutils,"DayaniklilikTestEkle",Debug.moduleToString(b4a.example3.dayanikliliktestekle.class),"DayaniklilikTestListele",Debug.moduleToString(b4a.example3.dayanikliliktestlistele.class),"DayaniklilikTestMenu",Debug.moduleToString(b4a.example3.dayanikliliktestmenu.class),"DayaniklilikTestSil",Debug.moduleToString(b4a.example3.dayanikliliktestsil.class),"DBUtils",Debug.moduleToString(b4a.example3.dbutils.class),"DenekDuzenleSil",Debug.moduleToString(b4a.example3.denekduzenlesil.class),"DenekEkleGuncelle",Debug.moduleToString(b4a.example3.denekekleguncelle.class),"DenekListele",Debug.moduleToString(b4a.example3.deneklistele.class),"DengeTest",Debug.moduleToString(b4a.example3.dengetest.class),"DikeySicramaTest",Debug.moduleToString(b4a.example3.dikeysicramatest.class),"EditTextBabaAdi",gelismistestdenekara.mostCurrent._edittextbabaadi,"EditTextBransSinif",gelismistestdenekara.mostCurrent._edittextbranssinif,"EditTextEngelDurumu",gelismistestdenekara.mostCurrent._edittextengeldurumu,"EditTextIsim",gelismistestdenekara.mostCurrent._edittextisim,"EditTextKimlikNo",gelismistestdenekara.mostCurrent._edittextkimlikno,"EditTextMevki",gelismistestdenekara.mostCurrent._edittextmevki,"EditTextTakimOkul",gelismistestdenekara.mostCurrent._edittexttakimokul,"id",gelismistestdenekara._id,"InsertVeriler",Debug.moduleToString(b4a.example3.insertveriler.class),"isim",gelismistestdenekara.mostCurrent._isim,"KuvvetTest",Debug.moduleToString(b4a.example3.kuvvettest.class),"LabelAy",gelismistestdenekara.mostCurrent._labelay,"LabelBabaAdi",gelismistestdenekara.mostCurrent._labelbabaadi,"LabelBransSinif",gelismistestdenekara.mostCurrent._labelbranssinif,"LabelCarpi1",gelismistestdenekara.mostCurrent._labelcarpi1,"LabelCarpi2",gelismistestdenekara.mostCurrent._labelcarpi2,"LabelCarpi3",gelismistestdenekara.mostCurrent._labelcarpi3,"LabelCarpi4",gelismistestdenekara.mostCurrent._labelcarpi4,"LabelCarpi5",gelismistestdenekara.mostCurrent._labelcarpi5,"LabelCarpi6",gelismistestdenekara.mostCurrent._labelcarpi6,"LabelCarpi7",gelismistestdenekara.mostCurrent._labelcarpi7,"LabelCinsiyet",gelismistestdenekara.mostCurrent._labelcinsiyet,"LabelDenekIsim",gelismistestdenekara.mostCurrent._labeldenekisim,"LabelDenekTc",gelismistestdenekara.mostCurrent._labeldenektc,"LabelDogumTarihi",gelismistestdenekara.mostCurrent._labeldogumtarihi,"LabelDogumYeri",gelismistestdenekara.mostCurrent._labeldogumyeri,"LabelEngel",gelismistestdenekara.mostCurrent._labelengel,"LabelGun",gelismistestdenekara.mostCurrent._labelgun,"LabelId",gelismistestdenekara.mostCurrent._labelid,"Labelisim",gelismistestdenekara.mostCurrent._labelisim,"LabelKimlikNo",gelismistestdenekara.mostCurrent._labelkimlikno,"LabelMevki",gelismistestdenekara.mostCurrent._labelmevki,"LabelTakimOkul",gelismistestdenekara.mostCurrent._labeltakimokul,"LabelYil",gelismistestdenekara.mostCurrent._labelyil,"list",gelismistestdenekara.mostCurrent._list,"Main",Debug.moduleToString(b4a.example3.main.class),"MotorOzellikMenu",Debug.moduleToString(b4a.example3.motorozellikmenu.class),"Panel1",gelismistestdenekara.mostCurrent._panel1,"Panel2",gelismistestdenekara.mostCurrent._panel2,"ProgramAyar",Debug.moduleToString(b4a.example3.programayar.class),"ProgramListele",Debug.moduleToString(b4a.example3.programlistele.class),"ProgramSec",Debug.moduleToString(b4a.example3.programsec.class),"ProgramSil",Debug.moduleToString(b4a.example3.programsil.class),"ProgramVeri",Debug.moduleToString(b4a.example3.programveri.class),"PsikolojikEkle",Debug.moduleToString(b4a.example3.psikolojikekle.class),"PsikolojikListele",Debug.moduleToString(b4a.example3.psikolojiklistele.class),"PsikolojikSil",Debug.moduleToString(b4a.example3.psikolojiksil.class),"ReaksiyonTest",Debug.moduleToString(b4a.example3.reaksiyontest.class),"rs",gelismistestdenekara.mostCurrent._rs,"SaglikBilgileriEkle",Debug.moduleToString(b4a.example3.saglikbilgileriekle.class),"SaglikBilgileriListele",Debug.moduleToString(b4a.example3.saglikbilgilerilistele.class),"SaglikBilgileriSil",Debug.moduleToString(b4a.example3.saglikbilgilerisil.class),"ScrollView1",gelismistestdenekara.mostCurrent._scrollview1,"SesService",Debug.moduleToString(b4a.example3.sesservice.class),"silinenListe",gelismistestdenekara.mostCurrent._silinenliste,"SpinnerAy",gelismistestdenekara.mostCurrent._spinneray,"SpinnerCinsiyet",gelismistestdenekara.mostCurrent._spinnercinsiyet,"SpinnerDogumYeri",gelismistestdenekara.mostCurrent._spinnerdogumyeri,"SpinnerGun",gelismistestdenekara.mostCurrent._spinnergun,"SpinnerYil",gelismistestdenekara.mostCurrent._spinneryil,"Starter",Debug.moduleToString(b4a.example3.starter.class),"SuratTestAyar",Debug.moduleToString(b4a.example3.surattestayar.class),"SuratTestEkle",Debug.moduleToString(b4a.example3.surattestekle.class),"SuratTestListele",Debug.moduleToString(b4a.example3.surattestlistele.class),"SuratTestSil",Debug.moduleToString(b4a.example3.surattestsil.class),"tc",gelismistestdenekara.mostCurrent._tc,"TestDenekAra",Debug.moduleToString(b4a.example3.testdenekara.class),"TestMenu",Debug.moduleToString(b4a.example3.testmenu.class)};
}
}