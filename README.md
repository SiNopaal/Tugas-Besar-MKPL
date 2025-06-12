# Java CI/CD Pipeline – Tugas Besar Manajemen Konfigurasi dan Evolusi PL

Proyek ini merupakan implementasi pipeline **CI/CD** menggunakan **GitHub Actions** untuk mata kuliah *Manajemen Konfigurasi dan Evolusi Perangkat Lunak*. Aplikasi ini dibangun menggunakan **Java dengan Maven**, dan pipeline mencakup komponen:

- ✅ Continuous Integration
- ✅ Continuous Testing
- ✅ Continuous Inspection
- ✅ Continuous Delivery

---

## 👥 Anggota Kelompok
| Nama                             | NIM              | Tanggung Jawab                         |
|----------------------------------|------------------|----------------------------------------|
| Putra Pratama Okta Riano         | 2211104068        | Continuous Integration (`mvn install`) |
| Allaya Daffa Zhillal             | 2211104090        | Continuous Testing (`mvn test`)        |
| Naufal Maulana Izzuddin          | 2211104091        | Continuous Inspection (`checkstyle`)   |

---

## ⚙️ Teknologi yang Digunakan
- Java 17
- Maven
- GitHub Actions
- Checkstyle 9.3
- JUnit 5

---

## 🔄 CI/CD Workflow

📁 File konfigurasi workflow:  

.github/workflows/java-ci-cd.yml


### 🔧 Alur CI/CD:
1. **Build & Test & Inspect**
   - `mvn clean install` → membangun proyek
   - `mvn test` → menjalankan unit test
   - `mvn checkstyle:check` → memeriksa kualitas kode

2. **Deploy**
   - Membuat tag otomatis (misal `v1`, `v2`, dst)
   - Mengunggah `.jar` hasil build ke tab **Releases** GitHub

---

## 🚀 Hasil CI/CD

- ✅ Log eksekusi: [Tab Actions di GitHub](../../actions)
- 📦 File hasil build (`.jar`): [Tab Releases](../../releases)

---

## 🎥 Video Demonstrasi

📺 [Link Video Penjelasan & Demo](https://youtu.be/link-demo-di-sini)

> Video berisi penjelasan alur workflow dan demonstrasi proses CI/CD dari awal hingga deploy.

---

## 📁 Struktur Proyek

Tubes-Kretek-Java/
├── src/
│ ├── main/java/com/example/app/App.java
│ └── test/java/com/example/app/AppTest.java
├── pom.xml
├── .github/
│ └── workflows/java-ci-cd.yml


---

## ✅ Catatan Tambahan
- Workflow hanya berjalan untuk branch `main`.
- `checkstyle` mengikuti aturan dari `sun_checks.xml`.
- Token `GITHUB_TOKEN` diberi akses `contents: write` agar dapat membuat release.

---

## 📝 Lisensi
Proyek ini dibuat untuk keperluan pembelajaran dan tugas mata kuliah MKPL. Bebas dimodifikasi sesuai kebutuhan akademik.
