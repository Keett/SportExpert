B4A=true
Group=SportExpertProjeDosyası\Denek
ModulesStructureVersion=1
Type=Activity
Version=9.01
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private ion As Object
	Private const tempImageFile As String = "tempimage.jpg"
	Public lastPicture As Bitmap
	Dim ImageChooser As ContentChooser
	Public Buffer() As Byte

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private EditTextKimlikNo As EditText
	Private EditTextIsim As EditText
	Private SpinnerCinsiyet As Spinner
	Private SpinnerDogumYeri As Spinner
	Private EditTextBabaAdi As EditText
	Private EditTextEngelDurumu As EditText
	Private EditTextTakimOkul As EditText
	Private EditTextBransSinif As EditText
	Private EditTextMevki As EditText
	
	Private ImageView1 As ImageView

	Dim result As Int
	Dim DenekID As String
	Dim secilenCinsiyet As String
	Dim secilenDogumYeri As String
	Dim secilenDogumTarihi As String
	Dim rs As ResultSet
	Private ButtonDenekOk As Button 
	Private ButtonDogumTarihi As Button
	Private ButtonYukle As Button
	Private PanelFotoCek As Panel
	Private LabelKimlikNo As Label
	Private Labelisim As Label
	Private LabelCinsiyet As Label
	Private LabelDogumTarihi As Label
	Private LabelDogumYeri As Label
	Private LabelBabaAdi As Label
	Private CheckBoxEngelDurumu As CheckBox
	Private LabelTakimOkul As Label
	Private LabelBransSinif As Label
	Private LabelMevki As Label
	
	Dim kayitTürü As String =""
	Private ButtonFotoCek As Button
	Private Panel1 As Panel
	Private Panel2 As Panel
	Private LabelGun As Label
	Private LabelAy As Label
	Private LabelYil As Label
	Private SpinnerGun As Spinner
	Private SpinnerAy As Spinner
	Private SpinnerYil As Spinner
	
	Dim secilenGun As Int 
	Dim secilenAy As String 
	Dim secilenYil As Int 
	Private ButtonTarihAyar As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("DenekEklePage")
	Panel2.Visible= False
	'en son çeklien fotoğrafı image view'e ekle------------------------alttakiler açıldığında en son öekilen imageviewe konulur
'		If lastPicture.IsInitialized Then
'			ImageView1.Bitmap = lastPicture
'		End If

#region spinner ayarlamaları,görüntü ayarları ve spinner doldurma işlemleri
	SpinnerCinsiyet.DropdownBackgroundColor= Colors.White
	SpinnerCinsiyet.DropdownTextColor= Color.koyuMavi
	SpinnerCinsiyet.TextColor= Colors.White
	SpinnerCinsiyet.TextSize = 20
	
	SpinnerDogumYeri.DropdownBackgroundColor= Colors.White
	SpinnerDogumYeri.DropdownTextColor= Color.koyuMavi
	SpinnerDogumYeri.TextColor= Colors.White
	SpinnerDogumYeri.TextSize = 20
	
	SpinnerGun.DropdownBackgroundColor = Color.acikMavi
	SpinnerGun.DropdownTextColor = Colors.White
	SpinnerGun.TextColor = Color.koyuMavi
	SpinnerGun.TextSize = 20
	
	SpinnerAy.DropdownBackgroundColor = Color.acikMavi
	SpinnerAy.DropdownTextColor = Colors.White
	SpinnerAy.TextColor = Color.koyuMavi
	SpinnerAy.TextSize = 20
	
	SpinnerYil.DropdownBackgroundColor = Color.acikMavi
	SpinnerYil.DropdownTextColor = Colors.White
	SpinnerYil.TextColor = Color.koyuMavi
	SpinnerYil.TextSize = 20
	
	LabelGun.TextColor = Color.koyuMavi
	LabelGun.TextSize = 20
	LabelGun.Typeface = Typeface.DEFAULT
	
	LabelAy.TextColor = Color.koyuMavi
	LabelAy.TextSize = 20
	LabelAy.Typeface = Typeface.DEFAULT
	
	LabelYil.TextColor = Color.koyuMavi
	LabelYil.TextSize = 20
	LabelYil.Typeface = Typeface.DEFAULT
	
	LabelKimlikNo.TextColor = Colors.White
	LabelKimlikNo.TextSize = 20
	LabelKimlikNo.Typeface = Typeface.DEFAULT_BOLD
	
	Labelisim.TextColor = Colors.White
	Labelisim.TextSize = 20
	Labelisim.Typeface = Typeface.DEFAULT_BOLD
	
	LabelCinsiyet.TextColor = Colors.White
	LabelCinsiyet.TextSize = 20
	LabelCinsiyet.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDogumTarihi.TextColor = Colors.White
	LabelDogumTarihi.TextSize = 20
	LabelDogumTarihi.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDogumYeri.TextColor = Colors.White
	LabelDogumYeri.TextSize = 20
	LabelDogumYeri.Typeface = Typeface.DEFAULT_BOLD
	
	LabelBabaAdi.TextColor = Colors.White
	LabelBabaAdi.TextSize = 20
	LabelBabaAdi.Typeface = Typeface.DEFAULT_BOLD
	
	CheckBoxEngelDurumu.TextColor = Colors.White
	CheckBoxEngelDurumu.TextSize = 20
	CheckBoxEngelDurumu.Typeface = Typeface.DEFAULT_BOLD
	
	LabelTakimOkul.TextColor = Colors.White
	LabelTakimOkul.TextSize = 20
	LabelTakimOkul.Typeface = Typeface.DEFAULT_BOLD
	
	LabelBransSinif.TextColor = Colors.White
	LabelBransSinif.TextSize = 20
	LabelBransSinif.Typeface = Typeface.DEFAULT_BOLD
	
	LabelMevki.TextColor = Colors.White
	LabelMevki.TextSize = 20
	LabelMevki.Typeface = Typeface.DEFAULT_BOLD
	
	EditTextKimlikNo.HintColor = Color.hintColor
	EditTextKimlikNo.Hint = "TCKN'i eksiksiz giriniz.."
	EditTextKimlikNo.TextSize = 20
	EditTextKimlikNo.TextColor = Colors.White
	EditTextKimlikNo.Typeface = Typeface.DEFAULT
	EditTextKimlikNo.SingleLine = True
	
	EditTextIsim.HintColor = Color.hintColor
	EditTextIsim.Hint = "Denek ismini giriniz.."
	EditTextIsim.TextSize = 20
	EditTextIsim.TextColor = Colors.White
	EditTextIsim.Typeface = Typeface.DEFAULT
	
	EditTextBabaAdi.HintColor = Color.hintColor
	EditTextBabaAdi.Hint = "Denek baba adını giriniz.."
	EditTextBabaAdi.TextSize = 20
	EditTextBabaAdi.TextColor = Colors.White
	EditTextBabaAdi.Typeface = Typeface.DEFAULT
	
	EditTextEngelDurumu.HintColor = Color.hintColor
	EditTextEngelDurumu.Hint = "Engel durumu varsa lütfen doldurunuz.."
	EditTextEngelDurumu.TextSize = 20
	EditTextEngelDurumu.TextColor = Colors.White
	EditTextEngelDurumu.Typeface = Typeface.DEFAULT
	
	EditTextTakimOkul.HintColor = Color.hintColor
	EditTextTakimOkul.Hint = "Bağlı olduğu Takım/Okul değerini giriniz..."
	EditTextTakimOkul.TextSize = 20
	EditTextTakimOkul.TextColor = Colors.White
	EditTextTakimOkul.Typeface = Typeface.DEFAULT
	
	EditTextBransSinif.HintColor = Color.hintColor
	EditTextBransSinif.Hint = "Bağlı olduğu Branş/Sınıf değerini giriniz..."
	EditTextBransSinif.TextSize = 20
	EditTextBransSinif.TextColor = Colors.White
	EditTextBransSinif.Typeface = Typeface.DEFAULT
	
	EditTextMevki.HintColor = Color.hintColor
	EditTextMevki.Hint = "Bulunduğu mevki değerini giriniz..."
	EditTextMevki.TextSize = 20
	EditTextMevki.TextColor = Colors.White
	EditTextMevki.Typeface = Typeface.DEFAULT
	
	ButtonDogumTarihi.Text = "Doğum Tarihi"
	ButtonDogumTarihi.TextColor = Colors.White
	ButtonDogumTarihi.TextSize = 20
	ButtonDogumTarihi.Typeface = Typeface.DEFAULT
	ButtonDogumTarihi.SingleLine = True
	
	ButtonYukle.Visible = False
	ButtonFotoCek.Visible = False
	If Main.Status = "S" Then
		Panel1.Visible = True
	Else
		Panel1.Visible = False
	End If
	EditTextEngelDurumu.Visible = False
	
	DBUtils.ExecuteSpinner(Main.sql, "SELECT cinsiyet_adi FROM Cinsiyet", Null,0,SpinnerCinsiyet)
	spinnerCinsiyet_ItemClick(0,SpinnerCinsiyet.GetItem(0))
	DBUtils.ExecuteSpinner(Main.sql, "SELECT il_adi FROM Iller", Null,0,SpinnerDogumYeri)
	spinnerCinsiyet_ItemClick(0,SpinnerDogumYeri.GetItem(0))
	DBUtils.ExecuteSpinner(Main.sql ,"SELECT gun FROM Gun" ,Null,0,SpinnerGun)
	SpinnerGun_ItemClick(0,SpinnerGun.GetItem(0)) 
	DBUtils.ExecuteSpinner(Main.sql, "SELECT ay FROM Ay", Null,0,SpinnerAy)
	SpinnerAy_ItemClick(0,SpinnerAy.GetItem(0))
	DBUtils.ExecuteSpinner(Main.sql, "SELECT yil FROM Yil", Null, 0, SpinnerYil)
	SpinnerYil_ItemClick(0,SpinnerYil.GetItem(0))
	
#end region
 
#region düzenleme de eski verileri edittextlere doldurma işlemi
	If Main.Status="U" Then
		DenekID = DenekDuzenleSil.id
		EditTextKimlikNo.Text = DenekDuzenleSil.tc
		EditTextIsim.Text = DenekDuzenleSil.isim
		DBUtils.ExecuteSpinner(Main.sql,"SELECT cinsiyet_adi FROM Cinsiyet ",Null,0,SpinnerCinsiyet)
		ButtonDogumTarihi.Text = DenekDuzenleSil.dogum_tarihi
		DBUtils.ExecuteSpinner(Main.sql,"SELECT il_adi FROM Iller ",Null,0,SpinnerDogumYeri)
		EditTextBabaAdi.Text = DenekDuzenleSil.baba_adi
		EditTextEngelDurumu.Text = DenekDuzenleSil.engel_durumu
		EditTextTakimOkul.Text = DenekDuzenleSil.takim_okul
		EditTextBransSinif.Text = DenekDuzenleSil.brans_sinif
		EditTextMevki.Text = DenekDuzenleSil.mevki
		Buffer = DenekDuzenleSil.resim
		Try
			Dim inputStream As InputStream
			Dim bmp As Bitmap
			inputStream.InitializeFromBytesArray(Buffer, 0, Buffer.Length)
			bmp.Initialize2(inputStream)
			inputStream.Close
			ImageView1.SetBackgroundImage(bmp)
			Log("try")
		Catch
			ImageView1.Bitmap = LoadBitmap(File.DirAssets, "FotoKisi.png")
			Log("catch")
		End Try
	End If
#end region

End Sub

Sub InsertBlob 'görünüyü veritabanına kaydeder.
	Dim inputStream As InputStream 
	Dim outputStream As OutputStream 
	inputStream= File.OpenInput(Starter.provider.SharedFolder, tempImageFile)
	outputStream.InitializeToBytesArray(1000)
	File.Copy2(inputStream, outputStream)
	Buffer= outputStream.ToBytesArray
End Sub

Sub TakePicture
	Dim i As Intent 
	i.Initialize("android.media.action.IMAGE_CAPTURE", "")
	File.Delete(Starter.provider.SharedFolder, tempImageFile)
	Dim u As Object = Starter.provider.GetFileUri(tempImageFile)
	i.PutExtra("output", u) 'görüntü bu yola kaydedilecek
'	Log(i)
	Try
		Log("take picture try kısmı")
		StartActivityForResult(i)
	Catch
		ToastMessageShow("Camera is not available.", True)
		Log(LastException)
	End Try
End Sub

'sonuç buraya gelir
Sub ion_Event (MethodName As String, Args() As Object) As Object
	If Args(0) = -1 Then
		Log("ion_Event args(0) = -1 if bloğu ")
		Try
			Dim in As Intent = Args(1)
			If File.Exists(Starter.provider.SharedFolder, tempImageFile) Then
				Log("ion_event File.Exists(Starter.provider.SharedFolder, tempImageFile)")
				lastPicture = LoadBitmapSample(Starter.provider.SharedFolder, tempImageFile, ImageView1.Width, ImageView1.Height)
				ImageView1.Bitmap = lastPicture
			Else If in.HasExtra("data") Then 'bunun yerine küçük resim almaya çalışın
				Log("in.HasExtra(data)")
				Dim jo As JavaObject = in
				lastPicture = jo.RunMethodJO("getExtras", Null).RunMethod("get", Array("data"))
			End If
		Catch
			Log(LastException)
		End Try
	End If
	If lastPicture.IsInitialized Then 
		ImageView1.Bitmap = lastPicture
		Log("ion_event lastPicture.IsInitialized if bloğu ")
	End If
	Return Null
End Sub

Sub StartActivityForResult(ii As Intent)
	Log("StartActivityForResult")
	Dim jo As JavaObject = GetBA
	ion = jo.CreateEvent("anywheresoftware.b4a.IOnActivityResult", "ion", Null)
	jo.RunMethod("startActivityForResult", Array As Object(ion, ii))
End Sub

Sub GetBA As Object
	Log("GetBA")
	Dim jo As JavaObject
	Dim cls As String = Me
	cls = cls.SubString("class ".Length)
	jo.InitializeStatic(cls)
	Return jo.GetField("processBA")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub ID
	Dim sf As StringFunctions
	sf.initialize
	
	rs = Main.sql.ExecQuery("SELECT * FROM Denek ORDER BY denek_id DESC")
	If rs.RowCount>0 Then 
		rs.Position = 0
		DenekID = sf.Right("00" &sf.Trim(sf.Val(sf.Right(rs.GetString("denek_id"),3))+1),3)
	Else
		DenekID="001"
	End If
	
End Sub

Sub ButtonDenekOk_Click
	If EditTextKimlikNo.Text="" Then
		Msgbox("TC Kimlik numarası boş bırakılamaz","Bildirim Mesajı")
		Return
	End If
	
	If ImageView1.Bitmap = Null Then 
		Msgbox("Denek Fotoğrafı çekiniz","Bildirim Mesajı")
		Return
	End If
	
	Dim sayi As Long = EditTextKimlikNo.Text
	If sayi > 99999999999 Or sayi < 10000000000 Then
		Log(sayi)
		Msgbox("Geçerli bir TC giriniz..","Bildirim Mesajı")
		Return
	End If
	
	If Main.Status = "S" Then
		' veri daha önceden eklenmiş mi kontrolü
		Dim rs As ResultSet = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_tc ='" & EditTextKimlikNo.Text&"'")
		If rs.RowCount >0 Then
			Msgbox("Bu TC kimlik numarasına sahip denek eklendi","")
			Return
		Else
			result = Msgbox2("Aşağıda ismi ve soy ismi yazılı kişiyi denek olarak eklemek istiyor musunuz?:" &EditTextIsim.Text, "Onay Mesajı", "Evet", "", "Hayır",Null)
			If result= DialogResponse.POSITIVE Then
				ID
				If kayitTürü = "FotoCek" Then
					InsertBlob
					Main.sql.ExecNonQuery2("INSERT INTO Denek VALUES(?,?,?,?,?,?,?,?,?,?,?,?)", Array As Object (DenekID,EditTextKimlikNo.Text,EditTextIsim.Text, secilenCinsiyet, secilenDogumTarihi, secilenDogumYeri, EditTextBabaAdi.Text, EditTextEngelDurumu.Text, EditTextTakimOkul.Text, EditTextBransSinif.Text,EditTextMevki.Text,Buffer))
				Else
					Main.sql.ExecNonQuery2("INSERT INTO Denek VALUES(?,?,?,?,?,?,?,?,?,?,?,?)", Array As Object (DenekID,EditTextKimlikNo.Text,EditTextIsim.Text, secilenCinsiyet, secilenDogumTarihi, secilenDogumYeri, EditTextBabaAdi.Text, EditTextEngelDurumu.Text, EditTextTakimOkul.Text, EditTextBransSinif.Text,EditTextMevki.Text,Buffer))
				End If
				Log("tc eklendi: "&EditTextKimlikNo.Text)
			Else If result= DialogResponse.NEGATIVE Then
				ToastMessageShow("Denek ekleme sayfasına yönlendiriliyorsunuz...",False)
				Return
			End If
		End If	
		rs.Close
	Else if Main.Status = "U" Then
		'Main.sql.ExecNonQuery("UPDATE Denek SET denek_tc = '"&EditTextKimlikNo.Text&"', denek_isim = '"&EditTextIsim.Text&"', denek_dogumTarihi ='"&EditTextDogumTarihi.Text&"', denek_babaAdi = '"&EditTextBabaAdi.Text&"', denek_engelDurumu='"&EditTextEngelDurumu.Text&"',denek_takimOkul= '"&EditTextTakimOkul.Text&"', denek_bransSinif= '"&EditTextBransSinif.Text&"', denek_mevki= '"&EditTextMevki.Text&"' WHERE denek_id= '"&DenekID&"' ")
		result = Msgbox2("Aşağıda ismi ve soy ismi yazılı kişiyi güncellemek istiyor musunuz?:" &EditTextIsim.Text, "Onay Mesajı", "Evet", "", "Hayır",Null)
		If result= DialogResponse.POSITIVE Then
			If kayitTürü = "FotoCek" Then
				InsertBlob
				Main.sql.ExecNonQuery2("UPDATE Denek SET denek_tc = ?, denek_isim = ? ,cinsiyet_adi =?, denek_dogumTarihi=?, il_adi=?, denek_babaAdi=?, denek_engelDurumu=?, denek_takimOkul=?, denek_bransSinif=?, denek_mevki=?, denek_image=? WHERE denek_id =" &DenekID, Array As Object(EditTextKimlikNo.Text,EditTextIsim.Text, secilenCinsiyet, secilenDogumTarihi, secilenDogumYeri, EditTextBabaAdi.Text, EditTextEngelDurumu.Text, EditTextTakimOkul.Text, EditTextBransSinif.Text,EditTextMevki.Text,Buffer))
			Else
				Main.sql.ExecNonQuery2("UPDATE Denek SET denek_tc = ?, denek_isim = ? ,cinsiyet_adi =?, denek_dogumTarihi=?, il_adi=?, denek_babaAdi=?, denek_engelDurumu=?, denek_takimOkul=?, denek_bransSinif=?, denek_mevki=?, denek_image=? WHERE denek_id =" &DenekID, Array As Object(EditTextKimlikNo.Text,EditTextIsim.Text, secilenCinsiyet, secilenDogumTarihi, secilenDogumYeri, EditTextBabaAdi.Text, EditTextEngelDurumu.Text, EditTextTakimOkul.Text, EditTextBransSinif.Text,EditTextMevki.Text,Buffer))
			End If
		Else If result= DialogResponse.NEGATIVE Then
			ToastMessageShow("Denek güncelleme sayfasına yönlendiriliyorsunuz...",False)
			Return
		End If
	Else
		Log(LastException)
	End If
	
	ToastMessageShow("Denek Listesine Yönlendiriliyorsunuz...",False)
	StartActivity(DenekListele)
	Activity.Finish
	
End Sub

Sub spinnerCinsiyet_ItemClick (Position As Int, Value As Object)
	Try
		secilenCinsiyet= Value
	Catch
		Log(LastException)
	End Try
End Sub

Sub spinnerDogumYeri_ItemClick (Position As Int, Value As Object)
	Try
		secilenDogumYeri= Value
	Catch
		Log(LastException)
	End Try
End Sub

Sub ButtonFotoCek_Click
	kayitTürü ="FotoCek"
	TakePicture
End Sub

Sub ButtonDogumTarihi_Click
	Panel2.Visible = True
End Sub

Sub ButtonYukle_Click
	kayitTürü = "ResimSec"
	ImageChooser.Initialize("imgChooser")
	ImageChooser.Show("image/*","Choose Image")
End Sub

Sub imgChooser_Result(Success As Boolean, Dir As String, FileName As String)
	If Success Then
		Log("img_Chooser_Result Succcess ")

		Dim bmp As Bitmap
		bmp.Initialize(Dir,FileName)
		lastPicture = bmp
		ImageView1.Bitmap = lastPicture
	
		Dim inputStream As InputStream
		inputStream = File.OpenInput(Dir,FileName)
		Dim outputStream As OutputStream
		outputStream.InitializeToBytesArray(1000)
		File.Copy2(inputStream,outputStream)
		Buffer = outputStream.ToBytesArray

	Else
		ToastMessageShow("Resim Seçilmedi", True)
	End If
End Sub

Sub ImageView1_Click
	Dim result As Int
	result = Msgbox2("Fotoğraf Yükleyin veya çekin", "Fotoğraf", "Fotoğraf Çek", "", "Fotoğraf Yükle",Null)
	If result = DialogResponse.POSITIVE Then
		ButtonFotoCek_Click
	Else if result = DialogResponse.NEGATIVE Then
		ButtonYukle_Click
	End If
End Sub

Sub PanelFotoCek_Click
	ImageView1_Click
End Sub

Sub Panel1_Click
	Panel1.Visible = False
	ImageView1_Click
End Sub

Sub SpinnerGun_ItemClick (Position As Int, Value As Object)
	Try
		secilenGun = Value
	Catch
		Log(LastException)
	End Try
End Sub

Sub SpinnerAy_ItemClick (Position As Int, Value As Object)
	Try
		If Value == "Ocak" Then
			secilenAy = 1
		Else if Value == "Şubat" Then
			secilenAy = 2
		Else if Value == "Mart" Then
			secilenAy = 3
		Else if Value == "Nisan" Then
			secilenAy = 4
		Else if Value == "Mayıs" Then
			secilenAy = 5
		Else if Value == "Haziran" Then
			secilenAy = 6
		Else if Value == "Temmuz" Then
			secilenAy = 7
		Else if Value == "Ağustos" Then
			secilenAy = 8
		Else if Value == "Eylül" Then
			secilenAy = 9
		Else if Value == "Ekim" Then
			secilenAy = 10
		Else if Value == "Kasım" Then
			secilenAy = 11
		Else if Value == "Aralık" Then
			secilenAy = 12
		End If
	Catch
		secilenAy = 6
		Log(LastException)
	End Try
End Sub

Sub SpinnerYil_ItemClick (Position As Int, Value As Object)
	Try
		secilenYil = Value
	Catch
		Log(LastException)
	End Try
	
End Sub

Sub ButtonTarihAyar_Click
	Panel2.Visible = False
	Dim Dd As DateDialog
'	Dd.ShowCalendar = False
'	Dd.Year = DateTime.GetYear(DateTime.Now)

	If secilenYil == 1950 Or secilenYil == 1951 Then
		If secilenAy == 2 Then
			If secilenGun == 29 Or secilenGun == 30 Or secilenGun == 31 Then
				ToastMessageShow($" Şubat ayı ${secilenYil} yılında 28 gündür"$, True)
				secilenGun = 28
			End If
		Else if secilenAy == 4 Or secilenAy == 6 Or secilenAy == 9 Or secilenAy == 11 Then 
			If secilenGun == 31 Then
				ToastMessageShow($"${secilenYil} yılında ${secilenAy}. ay 30 gündür"$, True)
				secilenGun = 30
			End If

		End If
	End If
	
	Dim yilSubatHesabi() As Int = Array As Int(1952,1953,1954,1955,1956,1957,1958,1959,1960,1961,1962,1963,1964,1965,1966,1967,1968,1969,1970,1971,1972,1973,1974,1975,1976,1977,1978,1979,1980,1981,1982,1983,1984,1985,1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020,2021,2022,2023,2024,2025,2026,2027,2028,2029)
	For i=0 To yilSubatHesabi.Length-1
		If secilenYil == yilSubatHesabi(i) Then
			If secilenAy == 2 Then
				If i Mod 4 == 0 Then
					If secilenGun == 30 Or secilenGun == 31 Then
						ToastMessageShow($" Şubat ayı ${yilSubatHesabi(i)} yılında 29 gündür"$, True)
						secilenGun = 29
					End If
				Else
					If secilenGun == 29 Or secilenGun == 30 Or secilenGun == 31 Then
						ToastMessageShow($" Şubat ayı ${yilSubatHesabi(i)} yılında 28 gündür"$, True)
						secilenGun = 28
					End If
				End If
			Else if secilenAy == 4 Or secilenAy == 6 Or secilenAy == 9 Or secilenAy == 11 Then
				If secilenGun == 31 Then
					ToastMessageShow($" ${yilSubatHesabi(i)} yılında ${secilenAy}. ay 30 gündür"$, True)
					secilenGun = 30
				End If
			End If
		End If
	Next

	Dim secilen As String = $"${secilenAy}/${secilenGun}/${secilenYil}"$
	Dd.Year = DateTime.GetYear(DateTime.DateParse(secilen))
	Dd.Month = DateTime.GetMonth(DateTime.DateParse(secilen))
	Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.DateParse(secilen))
	
	Dim result As Int = Dd.Show("Tarih seçiniz", "SPORT EXPERT TARİH SEÇİM PANELİ", "Evet", "İptal","", Null)
	If result = DialogResponse.POSITIVE Then
		secilenDogumTarihi = Dd.DayOfMonth & "/" & Dd.Month & "/" & Dd.Year
		ButtonDogumTarihi.Text = secilenDogumTarihi
	Else If result = DialogResponse.CANCEL Then
		ButtonDogumTarihi.Text = ""
		ToastMessageShow("Seçim yapılmadı",True)
	End If
End Sub

Sub checkBoxEngelDurumu_CheckedChange(Checked As Boolean)
	If CheckBoxEngelDurumu.Checked Then
		EditTextEngelDurumu.Visible = True
	Else
		EditTextEngelDurumu.Visible = False
	End If
End Sub