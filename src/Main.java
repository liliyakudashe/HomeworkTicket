import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Дан класс User, который содержит поля с именем и возрастом. Необходимо реализовать следующий метод:
        //1. На входе коллекция пользователей
        //2. Необходимо удалить все дубли (одинаковое имя и возраст)
        //3. Отсортировать по возрасту и имени
        //4. Вернуть самого старого пользователя

        User mariya = new User("Мария", 25);
        User nikolai = new User("Николай", 75);
        User evgeniya = new User("Евгения", 13);
        User nataliya = new User("Наталья", 54);
        User aleksandr = new User("Александр", 82);
        User vladimir = new User("Владимир", 33);
        User olga = new User("Ольга", 18);
        User ekaterina = new User("Екатерина", 99);
        User evgeni = new User("Евгений", 4);
        User igor = new User("Игорь", 21);

        Set<User> users = new HashSet<>();
        users.add(mariya);
        users.add(nikolai);
        users.add(evgeniya);
        users.add(nataliya);
        users.add(aleksandr);
        users.add(vladimir);
        users.add(olga);
        users.add(ekaterina);
        users.add(evgeni);
        users.add(igor);

        // Напишите программу на Java для подсчета количества конкретных слов в строке, используя HashMap
        String st = "Гарри встал на освободившееся место перед окошком и уставился на змею. " +
                "Он бы не удивился, если бы оказалось, что та умерла от скуки, ведь змея была абсолютно одна, " +
                "и ее окружали лишь глупые люди, целый день стучавшие по стеклу, чтобы заставить ее двигаться." +
                " Это было даже хуже, чем жить в чулане, единственным посетителем которого была тетя Петунья, " +
                "барабанящая в дверь, чтобы тебя разбудить." +
                " По крайней мере, Гарри мог выходить из чулана и бродить по всему дому.\n";
        String[] words = st.split(" ");
        HashMap<String, Integer> keyValue = new HashMap<String, Integer>();
        for (int i = 0; i <= words.length - 1; i++) {
            if (keyValue.containsKey(words[i])) {
                int counter = keyValue.get(words[i]);
                keyValue.put(words[i], counter + 1);
            }
        }
    }
}
