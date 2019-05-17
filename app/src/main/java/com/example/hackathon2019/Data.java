package com.example.hackathon2019;

import java.util.ArrayList;

public class Data {
    ArrayList<Animal> allAnimals;

    Data(){
        allAnimals=new ArrayList<>(20);

        Animal a1 = new Animal("dog", "south", 0, true,
                1,true,"מצפה רמון", "0544678985","יד 4",
                "https://d3m9l0v76dty0.cloudfront.net/system/photos/2091201/extra_large/ebff7ce75fd8b985f8c0bc593b704e03.jpg",
                "\"דני\nכלב קטן ומתוק, שמחפש משפחה אוהבת.דני כלב נוח וקל לטיפול. אוהב אנשים וחיות אחרות.");
        allAnimals.add(a1);

        Animal a2 = new Animal("dog",
                "north", 1, true,2, true, "עכו",
                "0545899840" ,
                "יד 4",
                "https://d3m9l0v76dty0.cloudfront.net/system/photos/2090698/extra_large/90124f7588b9abd06de6257de35afae7.jpg",
                "בלה\nגורה מעורבת בת 3 חודשים בעלת פרווה קצרה שצפויה להיות בינונית בגודלה.\nכלבה חכמה שרק מתחילה את חייה רוצה לחלוק אותם עם אנשים בעלי ניסיון בחינוך גורים"
);
        allAnimals.add(a2);

        Animal a3 = new Animal("dog",
                "center", 1, true, 2, true, "תל אביב",
                "054587684" , "צער בעלי חיים",
                 "https://d3m9l0v76dty0.cloudfront.net/system/photos/2090630/extra_large/7f16cf563ef35f5d62f2bac08b68175c.jpg",
                 "באדי\nכלב מעורב בן 4 שנים, מחונך וממושמע.\nכלב טוב שרגיל לבית מחפש התחלה חדשה עם בעלים אוהבים שיעניקו לו בית חם לכל חייו"
);
        allAnimals.add(a3);

        Animal a4 = new Animal("dog", "south", 0, false, 2,
                true,
                "מצפה רמון", "054997684" , "תנו לחיות לחיות",
                 "https://d3m9l0v76dty0.cloudfront.net/system/photos/2090799/extra_large/9e1f21c12ccdbe1daba26592f51f9151.jpg",
                 "ג'סי כלבה מעורבת בת 3 שנים, מאוד עדינה וחששנית.\nכלבה חמודה שברגע שהיא מכירה ונפתחת מראה אופי מדהים, זקוקה לבעלים סבלניים. ");
        allAnimals.add(a4);

//        Animal a5 = new Animal();
//        allAnimals.add(a5);
//

    }




}
