
import java.util.*;

/*Fikstür Oluşturucu
Java ile girilen takımlar için rastgele maç fikstürü oluşturan bir sınıf yazılmalı.
Kurallar :
* Çift Devreli Lig usülü uygulanacaktır.
* Her takım diğer takımlarla kendi evinde ve deplasmanda olmak üzere iki maç yapacaktır.
* Listenin sol tarafı ev sahibini sağ tarafı deplasman takımını gösterir.
* Eğer tek sayıda takım listesi girilirse, çift sayıya tamamlanacak şekilde
"Bay" adında bir takım daha eklenmeli. Bay ile eşleşen takımlar o hafta maç yapmayacağı anlamına gelir.
Takım sayısı çift senaryosu

Takımlar
- Galatasaray
- Bursaspor
- Fenerbahçe
- Beşiktaş
- Başakşehir
- Trabzonspor */
public class Main {
    public static void main(String[] args) {

        LinkedList<String> teams = new LinkedList<>();

        teams.add("Beşiktaş");
        teams.add("Fenerbahce");
        teams.add("Galatasaray");
        teams.add("Trabzonspor");
        teams.add("Eskişehirspor");
        teams.add("Gençlerbirliği");
        teams.add("Şalvarspor");

        for (String team : teams) {
            System.out.println("- " + team);
        }
        if (teams.size() % 2 != 0) {
            teams.add("BAY");
        }
        int matchPerRound = teams.size() / 2;

        Collections.shuffle(teams);

        int matchNum = (teams.size() * (teams.size() - 1));
        int roundNum = matchNum / (teams.size() / 2);

        String[] host = new String[matchNum / 2];
        String[] away = new String[matchNum / 2];

        for (int i = 0, a = 0; i < teams.size() - 1; i++) {
            for (int j = 0; j < teams.size() / 2; j++) {
                if (teams.get(j) != null && teams.get(teams.size() - 1 - j) != null) {
                    host[a] = teams.get(j);
                    away[a] = teams.get(teams.size() - 1 - j);
                    a++;
                }
            }
            Collections.rotate(teams.subList(1, teams.size()), 1);
        }

        int e = 0;
        for (int i = 0, a = 0; i < roundNum / 2; ) {

            System.out.println("\n" + (++i) + ". Hafta");
            for (int j = 0; j < matchPerRound; j++, a++) {
                System.out.println(host[a] + " vs " + away[a]);
            }
            e = i;
        }

        for (int i = 0, a = 0; i < roundNum / 2; i++) {
            System.out.println("\n" + (++e) + ". Hafta");
            for (int j = 0; j < matchPerRound; j++, a++) {
                System.out.println(host[a] + " vs " + away[a]);
            }
        }
    }
}
