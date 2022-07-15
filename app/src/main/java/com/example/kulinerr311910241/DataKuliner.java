package com.example.kulinerr311910241;

import java.util.ArrayList;

public class DataKuliner {

    public static String[][] data = new String[][]{
            {"Sate Ayam", "Sate ayam adalah makanan khas Indonesia. Sate Ayam dibuat dari daging ayam. Pada umumnya sate ayam dimasak dengan cara dipanggang dengan menggunakan arang dan disajikan dengan pilihan bumbu kacang atau bumbu kecap. Sate ini biasanya disajikan bersama dengan lontong atau nasi.", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/Sate_ayam-1.JPG/220px-Sate_ayam-1.JPG"},
            {"Jamur Goreng", "Jamur goreng terbuat dari jamur yang digoreng dan dilumuri dengan adonan encer.Di Amerika Serikat dan beberapa negara lain, hidangan tersebut sering disajikan sebagai hidangan pembuka atau makanan ringan.", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Fried_mushrooms.jpg/250px-Fried_mushrooms.jpg"},
            {"Ketoprak", "Ketoprak adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah dijumpai. Biasanya ketoprak dijajakan menggunakan kereta dorong di jalan-jalan atau kaki lima.\n" + "\n" +
                    "Bahan-bahan utamanya adalah tahu, bihun, mentimun, taoge, dan bisa juga memakai telur rebus yang dilengkapi dengan saus kacang, kecap manis, dan taburan bawang merah goreng. Dapat pula dihidangkan dengan tambahan kerupuk atau emping melinjo. Beberapa versi ada pula yang menyertakan tempe sebagai komponennya. Alat yang digunakan untuk mengolah ketoprak tidaklah sulit, yakni hanya butuh ulekan dan pisau.", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Gado_gado.jpg/250px-Gado_gado.jpg"},
            {"Kerak Telor", "Kerak telur adalah makanan asli daerah Jakarta (Betawi), dengan bahan-bahan beras ketan putih, telur ayam atau bebek, ebi (udang kering yang diasinkan) yang disangrai kering ditambah bawang merah goreng, lalu diberi bumbu yang dihaluskan berupa kelapa sangrai, cabai merah, kencur, jahe, merica butiran, garam dan gula pasir. Kerak telor dapat ditemukan pada hari biasa. Anda bisa menemukan kerak telor di sekitar Kota Tua, Jakarta Barat. Menurut sejarah, Kerak Telor sudah ada dari zaman kolonial Belanda, kerak telor diciptakan oleh masyarakat Betawi secara tak sengaja Pada tahun 1970-an.", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Gado_gado.jpg/250px-Gado_gado.jpg"},
            {"Tahu Gimbal", "Tahu gimbal adalah makanan khas Kota Semarang.Makanan ini terdiri dari tahu goreng, rajangan kol mentah, lontong, taoge, telur, dan gimbal (udang yang digoreng dengan tepung) dan dicampur dengan bumbu kacang yang khas karena menggunakan petis udang. Beda dengan saus kacang untuk pecel Madiun yang agak kental. Saus bumbu kacang untuk tahu gimbal agak sedikit encer.", "https://asset.kompas.com/crops/Swes-R1r6lHHXkAAUovg4nkuI7g=/82x0:927x563/750x500/data/photo/2017/05/07/3807318302.jpeg"},
            {"Tahu Petis", "Tahu petis adalah jajanan khas kota Semarang berupa tahu goreng yang dimakan dengan petis (saus berwarna hitam kental yang biasanya terbuat dari udang) yang dioleskan/disisipkan di tengahtengah tahu. Seperti tahu pong tetapi rasanya tidak asin, yaitu berasal dari tahu putih yang digoreng sampai warna kecokelatan tanpa dibumbui atau dibumbui dengan larutan garam dan bawang putih saja.Sedangkan petisnya berasa manis agak sedikit asin. Agar menggugah selera tahu petis biasanya dimakan dengan cabai rawit.", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Tahu_petis.jpg/220px-Tahu_petis.jpg"},
            {"Tahu Gejrot", "Tahu gejrot adalah makanan khas Cirebon, Indonesia yang terbuat dari tahu dan bumbu lainnya. Tahu gejrot terdiri dari tahu yang sudah digoreng kemudian dipotong agak kecil lalu dimakan dengan kuah yang bumbunya cabai, bawang putih, bawang merah, gula. Biasanya disajikan di layah kecil. Tahu gejrot juga merupakan jajanan khas daerah Cirebon yang digemari di kalangan anak-anak dan orang dewasa, karena sensasi rasanya yang khas. Tahu gejrot ialah tahu yang dipotong kecil-kecil kemudian ditaruh di atas piring kecil dan tahu yang digunakan ialah tahu sumedang. Cara memakannya pun unik, yakni dengan satu lidi kecil kemudian tusuk bagian tahu yang telah dipotong-potong itu.Saat ini tahu gejrot telah menyebar ke seluruh Indonesia seperti Jakarta, Malang, Depok, Surabaya, dan beberapa tempat di kota-kota besar lainnya di Indonesia.", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Tahugejrot_Hariadhi.jpg/180px-Tahugejrot_Hariadhi.jpg"}
    };

    public static ArrayList<ModelKuliner> ambilDataKuliner() {
        ArrayList<ModelKuliner> dataKuliner = new ArrayList<>();
        for (String[] varData : data) {
            ModelKuliner model = new ModelKuliner();
            model.setNama(varData[0]);
            model.setTentang(varData[1]);
            model.setFoto(varData[2]);

        dataKuliner.add(model);
    }
    return dataKuliner;

    }

}



