**Throwable** : Exception hiyerarşinin en üstündeki sınıftır. 
Tüm Exception sınıfları ondan kalıtım alır.

**Error** : Programdaki ciddi hatalı temsil eder.
JVM tarafından iletilen uygulama dışında oluşan hatalardır.
Bu tip hatalar da "Unchecked Exceptions" tipindedir.
Örneğin veritabanı sunucusuna bağlanmaya çalışınca bağlantı
hatası verirse bunu ancak çalışma zamanında anlayabiliriz.

**Exception** : Kullanıcı tanımlı Exception sınıfları dahil 
olmak üzere tüm Exception alt sınıflarının ATA sınıfıdır. 
"RuntimeException" dışındaki tüm Exception hataları "Checked 
Exceptions" tipindedir. Bu hata tipleri daha derleme 
aşamasında belirtilir. Bu hatalara göz önününde bulundurarak 
bir kod yazmamızı bizden bekler.

**RuntimeException** : Geçersiz ya da hatalı bir işlem 
sonucunda uygulamada oluşan hatalardır. Bunlar da JVM 
tarafından fırlatılır. "Unchecked Exceptions" kategorisine 
girer. Çünkü, ancak çalışma zamanında ortaya çıkarlar. 
Derleme aşamasında bu hataları yakalama şansımız yoktur. 
Örneğin null bir nesne üzerinden bir fonksiyon çağırmak 
veya sayı formatına uygun olmayan bir veriyi sayıya 
çevirmeye çalışmak gibi hataları örnek verebiliriz.