package patterns.behavioral.memento;
public class App {

    public static void main(String[] args) {

        Hafiza hafiza = new Hafiza();
        NotePad notePad = new NotePad();

        notePad.ekle("MERT");
        notePad.ekle("BARAN");

        versiyonKaydet(hafiza, notePad);
        hataliNoktaKoy(notePad);
        geriAl(hafiza,notePad);




    }

    private static void geriAl(Hafiza hafiza, NotePad notePad) {
        notePad.geriDon(hafiza.sonVersiyonuGetir());
        notePad.yazdir();
    }

    private static void hataliNoktaKoy(NotePad notePad) {
        notePad.ekle(".");
        notePad.yazdir();
    }

    private static void versiyonKaydet(Hafiza hafiza, NotePad notePad) {
        NotePadMemento memento = notePad.kaydet();
        hafiza.ekle(memento);

        notePad.yazdir();
    }
}
