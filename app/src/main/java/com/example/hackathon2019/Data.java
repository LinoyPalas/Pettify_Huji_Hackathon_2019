package com.example.hackathon2019;

import java.util.ArrayList;

public class Data {
    ArrayList<Animal> allAnimals;

    Data(){
        allAnimals = new ArrayList<Animal>(20);
        Animal a1 = new Animal("dog", "south", 0, true,
                1,true,"מצפה רמון", "0544678985","יד 4",
                "https://d3m9l0v76dty0.cloudfront.net/system/photos/2091201/extra_large/ebff7ce75fd8b985f8c0bc593b704e03.jpg",
                "\"דני\\nכלב קטן ומתוק, שמחפש משפחה אוהבת.דני כלב נוח וקל לטיפול. אוהב אנשים וחיות אחרות.");
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

        Animal a5 = new Animal("dog", "north", 0, false, 1,
                false, "קיסריה", "054487684" , "חדרה אוהבת חיות",
                "https://d3m9l0v76dty0.cloudfront.net/system/photos/2090853/extra_large/def1d6b7fa983fd18401138679a2ce8f.jpg",
                "לולה\nכלבה דלמטית מקסימה, מתאימה לדירה ולא דורשת הרבה טיפול אוהבת להתבודד מחפשת בית חם."
);
        allAnimals.add(a5);

        Animal a6 = new Animal("dog", "center", 2, true, 1,
                true, "יבנה", "054587684" , "יד 4",
                "https://d3m9l0v76dty0.cloudfront.net/system/photos/2090719/extra_large/4440a89342b62374963d3fb4d1be6427.jpg",
                "טאקינקבה\nבת שנה, כלבת רועים מעורבת בת שנה, עדינה מאוד וחששנית.\nכלבה שצריכה זמן להיפתח זקוקה לבעלים סבלניים ועדינים כמוה, שיחנכו, יאהבו ויתנו לה בית חם"
);
        allAnimals.add(a6);

        Animal a7 = new Animal("dog", "south",2,true,2,
                false,"אילת","054587684" ,"אילת אוהבת חיות",
                "https://d3m9l0v76dty0.cloudfront.net/system/photos/2090758/extra_large/018165e482bbed4e027d5d6b064cebf3.jpg",
                "קוקו\n כלב ביגל קטן ומתוק, מחפש בית אוהב שיטפל וישחק איתו"
);
        allAnimals.add(a7);

        Animal a8 = new Animal("dog", "north", 1, true, 2,
                false, "צפת","054587684" ,"חדרה אוהבת חיות",
                "https://d3m9l0v76dty0.cloudfront.net/system/photos/2090883/extra_large/7b8b4ceef4664cd482fd3d7ac89a0174.jpg",
                "רובי\nכלבה מעורבת בת 4 חודשים, שובבה ונמרצת.\nגורה שובת לב רוצה להתחיל פרק חדש עם בעלים אחראיים שיודעים לחנך ובעיקר לאהוב "
);
        allAnimals.add(a8);

        Animal a9 = new Animal("dog","center",
                2, false,1, true,"תל אביב",
                "054587684" ,"תנו לחיות לחיות",
                "https://d3m9l0v76dty0.cloudfront.net/system/photos/2090911/extra_large/d4e31bb67251895732eb4f7a33eaa3fb.jpg",
                "מוניק\nבת 7 שנים כלבה מעורבת בינונית בגודלה בת 7 שנים, מחונכת וחכמה.\nכלבה בוגרת שרגילה לחיים בבית עם כלבה נוספת (מרגו) והיא תשמח למצוא בית יחד איתה עם בעלים אוהבים ואחראיים "
);
        allAnimals.add(a9);

        Animal a10 = new Animal("dog", "south", 2, true, 2,
                true,"אשקלון", "054587684" ,"יד 4",
                "https://d3m9l0v76dty0.cloudfront.net/system/photos/2091017/large/948423ca1499f39e3616ad50ad56e22f.jpg",
                "לוק\nבן 7 חודשים, מעורב ובנינו בגודלו.\nכלב מתוק שמתחיל את חייו ומחפש מישהו שיעניק לו ביטחון ובית לכל החיים. זקוק עדיין לחינוך ולהרבה פעילות "
);
        allAnimals.add(a10);

        Animal a11 = new Animal("cat","north", 2,true,2,
                false,"צפת", "054-8944123", "יד 4 - נהריה אוהבת חיות",
                "https://img.wcdn.co.il/f_auto",
                "ג'וטו\nחתול מתוק שעברת התעללות ונמצא כרגע באומנה במרכז האומנה בנהריה.");
        allAnimals.add(a11);


        Animal a12 = new Animal("cat","center",2,true,1,
                false,"תל אביב","054-8944123","צער בעלי חיים",
                "http://cdn.babamail.co.il/Images/2014/12/24/784e822f-4b1a-42a1-9330-46ba0795c641.jpg",
                "בוני\nחתול זכר. עבר תאונה קשה וכעת מחפש מקום חם שיאהב אותו!"
);
        allAnimals.add(a12);

        Animal a13 = new Animal("cat","south",1,false,1,
                true,"באר שבע","054-8944123","באר שבע אוהבת חיות",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/Siamese_cat.JPG/250px-Siamese_cat.JPG",
                "רוקט\nחתול מהמם וקטן , ננטש ברחוב וכעת מחפש משפחה שתרצה להכניס אותו לחייה");
        allAnimals.add(a13);

        Animal a14 = new Animal("cat","norh", 1,false,2,
                true,"נהריה","054-8944123","נהריה אוהבת חיות",
                "https://www.dailybuzz.co.il/wp-content/uploads/2016/10/mn1.png",
                "קינדי\nהקטן הגיע אלינו בגיל צעיר מאוד וכעת מחפש בית חם לגדול בו!"
);
        allAnimals.add(a14);

        Animal a15 = new Animal("cat","center",1,true,1,
                true,"חולון","054-8944123","צער בעלי חיים",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0aElj5iYkC8iywAMJJ719QFVDh5QVOFp0yKwUHyiLqX9R6hMb",
                "טופי\nהגיעה אלינו בגיל מעט מבוגר וכעת מחפש בית חם לגדול בו!");

        allAnimals.add(a15);

        Animal a16 = new Animal("hamster","south",1,true,1,
                true,"אילת","054-8944123","צער בעלי חיים סניף אילת",
            "https://www.ken-hatuki.co.il/wp-content/uploads/2013/03/HamsterREX468x362-main_Full.jpg",
            "אוגי\nאוגר קטן בשם שחף ומתוק שמחפש בית חם שיאהב אותו"
            );
        allAnimals.add(a16);

        Animal a17 = new Animal("lizard","north", 1,false,1,
            false,"כפר בלום","054-8944123","צער בעלי חיים רמת הגולן",
            "https://www.tiuli.com/image/11b2213f3396c4e4fc0639ee33f9fdb0.jpg?&width=830&height=470",
            "נטלי\nלטאה קטן ולא מלכלכלת שלא דורשת הרבה יחס");
        allAnimals.add(a17);

        Animal a18 = new Animal("snake","center",1,false,2,
            false,"יהוד","054-8944123","מכלאת חיות - יהוד",
            "https://www.hashikma-holon.co.il/wp-content/uploads/2018/06/c7269ecb5462f23744119df16554272a-e1529398191949.jpg",
            "נוני\nנחש מסוג פיתון מתאים לבתים עם גינה, רצוי להשאיר בכלוב."
            );
        allAnimals.add(a18);

        Animal a19 = new Animal("turtle","south",0,false,0,
                true,"מצפה רמון","054-8944123","צער בעלי חיים - אזור הדרום",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/Testudo_graeca02.jpg/250px-Testudo_graeca02.jpg",
                "ציון\nצב בשם שבי שנמצא נטוש עם גב שבור , עבר טיפול ארוך ומחפש כעת בית חם להיקלט בו"
);
        allAnimals.add(a19);

        Animal a20 = new Animal("parrot","north",0,true,0,
                true,"חיפה","054-8944123","חיה אוהבת חיות",
                "http://www.biopet.co.il/app/uploads/2016/02/dwf.png",
                "רוברט\nתוכי ידידותי שננטש באזור חיפה, מחפש מקום חם");
        allAnimals.add(a20);




    }




}
