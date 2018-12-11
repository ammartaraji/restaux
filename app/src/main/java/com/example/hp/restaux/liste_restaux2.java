package com.example.hp.restaux;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


public class liste_restaux2 extends AppCompatActivity {
    protected ListView maListViewPerso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_restaux2);

        // Récupération de la "ListView" créée dans le fichier activity_main.xml
        maListViewPerso = findViewById(R.id.listviewperso);

        // Création de la "ArrayList" qui nous permettra de remplir la "ListView"
        ArrayList<HashMap<String, String>> listItem = new ArrayList<>();

        // On déclare la "HashMap" qui contiendra les informations pour un item
        HashMap<String, String> map;

        // Création d'une "HashMap" pour insérer les informations du premier item de notre "ListView"
        map = new HashMap<>();
        // On insère un élément "titre" que l'on récupérera dans le "TextView titre" créé dans le fichier affichage_item.xml
        map.put("titre", "le Hero");
        // On insère un élément "description" que l'on récupérera dans le "TextView description" créé dans le fichier affichage_item.xml
        map.put("rating","rating");
        // On insère la "référence" à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans le "ImageView" créé dans le fichier affichage_item.xml
        map.put("img", String.valueOf(R.drawable.c1));
        // Enfin on ajoute cette "HashMap" dans la "ArrayList"
        listItem.add(map);


        // On refait la manip plusieurs fois avec des données différentes pour former les items de notre "ListView"

        map = new HashMap<>();
        map.put("titre", "Etoile bleu");

        map.put("img", String.valueOf(R.drawable.c2));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "Restaurant Znak");

        map.put("img", String.valueOf(R.drawable.c3));
        listItem.add(map);


        map = new HashMap<>();
        map.put("titre", "Acrade");

        map.put("img", String.valueOf(R.drawable.c4));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "Zarga");

        map.put("img", String.valueOf(R.drawable.restau03_mini));
        listItem.add(map);

        // Création d'un SimpleAdapter qui se chargera de mettre les items présents dans notre liste (listItem) dans la vue affichage_item
        SimpleAdapter adapter = new SimpleAdapter (this.getBaseContext(),
                listItem,
                R.layout.activity_list_item,
                new String[] {"img", "titre" },
                new int[] {R.id.img, R.id.titre});

        // On attribue à notre "ListView" l'adapter que l'on vient de créer
        maListViewPerso.setAdapter(adapter);

        maListViewPerso.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            @SuppressWarnings("unchecked")
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                // On récupère la "HashMap" contenant les infos de notre item (titre, description, img)
                HashMap<String, String> map = (HashMap<String, String>) maListViewPerso.getItemAtPosition(position);

                // On crée une boite de dialogue
                AlertDialog.Builder adb = new AlertDialog.Builder(liste_restaux2.this);
                // On attribue un titre à notre boite de dialogue
                adb.setTitle("Sélection Item");
                // On insère un message à notre boite de dialogue, et ici on affiche le titre de l'item cliqué
                adb.setMessage("Votre choix : " + map.get("titre"));
                // On indique que l'on veut le bouton "ok" à notre boite de dialogue
                adb.setPositiveButton("Ok", null);
                // On affiche la boite de dialogue
                adb.show();
                return true;
            }
        });

        maListViewPerso.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            @SuppressWarnings("unchecked")
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch( position )
                {
                    case 0:  Intent newActivity = new Intent( liste_restaux2.this , infos.class);
                        startActivity(newActivity);
                        break;
                    /**case 1:  Intent newActivity2 = new Intent(liste_restaux.this, nems.class);
                     startActivity(newActivity2);
                     break;
                     case 2:  Intent newActivity3 = new Intent(liste_restaux.this, tradi.class);
                     startActivity(newActivity3);
                     break;
                     case 3:  Intent newActivity4 = new Intent(liste_restaux.this, pizaa.class);
                     startActivity(newActivity4);
                     break;
                     case 4:  Intent newActivity5 = new Intent(liste_restaux.this, sushis.class);
                     startActivity(newActivity5);
                     break;*/
                }

            }
        });
    }
}
