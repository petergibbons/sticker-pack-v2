package com.demo.sticker;

import java.util.ArrayList;
import java.util.List;

public class StickersDataFactory {

    public static List<Sticker> getAllStickerReference() {
        String[] stickerURLRef = {
                "https://firebasestorage.googleapis.com/v0/b/android-sticker-template-61244.appspot.com/o/KCLogo.png?alt=media&token=0c807f98-59b6-46e1-a79e-6cb78ffc1607",
                "https://firebasestorage.googleapis.com/v0/b/android-sticker-template-61244.appspot.com/o/BBQribs.png?alt=media&token=0c807f98-59b6-46e1-a79e-6cb78ffc1607",
                "https://firebasestorage.googleapis.com/v0/b/android-sticker-template-61244.appspot.com/o/KCLogo.png?alt=media&token=0c807f98-59b6-46e1-a79e-6cb78ffc1607",
                "https://firebasestorage.googleapis.com/v0/b/android-sticker-template-61244.appspot.com/o/Kauffman.png?alt=media&token=bacc3d8e-c68f-4e20-958d-6dec8559f555"
        };
        List<Sticker> stickerList = new ArrayList<>();
        for (int i = 0; i < stickerURLRef.length; i++) {
            stickerList.add(new Sticker(stickerURLRef[i]));
        }
        return stickerList;
    }
}