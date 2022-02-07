package com.example.mythirdtry;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//global class
public class MyApplication extends Application {

    private static List<Dyr> dyrList = new ArrayList<Dyr>();
    private static int nextId= 10;


    public MyApplication() {
        fyllListe();
    }

    private void fyllListe() {
        Dyr n1 = new Dyr(0,"Ku","https://imengine.public.prod.tun.infomaker.io/?uuid=67317b6a-5f70-582c-9638-2e4c8f63c93c&function=cropresize&type=preview&source=false&q=75&width=1600&height=839&x=1.0E-5&y=0.12088&crop_w=0.99999&crop_h=0.76007&z=0");
        Dyr n2 = new Dyr(1,"Sau","https://imengine.public.prod.tun.infomaker.io/?uuid=4a378682-eaaa-5faa-a1c4-dfe61d113471&function=cropresize&type=preview&source=false&q=75&width=1600&height=839&x=1.0E-5&y=0.10507&crop_w=0.99999&crop_h=0.77861&z=0");
        Dyr n3 = new Dyr(2,"Gris","https://imengine.public.prod.tun.infomaker.io/?uuid=69d0dcdf-ec10-58aa-8dab-7094902f82d9&function=cropresize&type=preview&source=false&q=75&width=1600&height=839&x=1.0E-5&y=0.1109&crop_w=0.99999&crop_h=0.78008&z=0");
        Dyr n4 = new Dyr(3,"Hest","https://www.vetinst.no/sykdom-og-agens/virusarteritt-eva-hos-hest/_/image/2869cbf6-af3b-4112-95f7-3ddd30b74234:e09fbc77e4ad4fc3e4143ce32f9a32ebf99c211d/max-2400/virusarteritt%20hos%20hest%20-%20COLOURBOX2163506_2000px.jpg");
        Dyr n5 = new Dyr(4,"Giraff","https://media.wwf.no/assets/article_images/Dyr/_1600x1067_crop_center-center_none/Large_WW230638.jpg");
        Dyr n6 = new Dyr(5,"Nesehorn","https://media.snl.no/media/68261/standard_compressed_Stumpneshorn.jpg");
        Dyr n7 = new Dyr(6,"Struts","https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Ostriches_cape_point.jpg/250px-Ostriches_cape_point.jpg");
        Dyr n8 = new Dyr(7,"Panda","https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Grosser_Panda.JPG/250px-Grosser_Panda.JPG");
        Dyr n9 = new Dyr(8,"Leopard","https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/African_leopard%2C_Panthera_pardus_pardus%2C_near_Lake_Panic%2C_Kruger_National_Park%2C_South_Africa_%2819448654130%29.jpg/250px-African_leopard%2C_Panthera_pardus_pardus%2C_near_Lake_Panic%2C_Kruger_National_Park%2C_South_Africa_%2819448654130%29.jpg");
        Dyr n10 = new Dyr(9,"Gorilla","https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Male_gorilla_in_SF_zoo.jpg/250px-Male_gorilla_in_SF_zoo.jpg");

        dyrList.addAll(Arrays.asList(new Dyr[]{n1,n2,n3,n4,n5,n6,n7,n8,n9}));
    }

    public static List<Dyr> getDyrList() {
        return dyrList;
    }

    public static void setDyrList(List<Dyr> dyrList) {
        MyApplication.dyrList = dyrList;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        MyApplication.nextId = nextId;
    }
}
