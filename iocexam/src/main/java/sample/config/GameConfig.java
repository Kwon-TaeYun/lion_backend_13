package sample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import sample.bean.Dice;
import sample.bean.Game;
import sample.bean.Player;

import java.util.List;
@PropertySource({"classpath:game.properties"})
public class GameConfig {
    @Bean
    public Dice dice(@Value("${face}") int face) {
//        return new Dice(6);
        Dice dice = new Dice();
        dice.setFace(face);
        return dice;
    }

    @Bean
    public Player kang(Dice dice){
//        Player player = new Player(dice);   //생성자를 통한 주입
        Player player = new Player();
        player.setDice(dice);        //설정자를 통한 주입
        player.setName("강경미");
        return player;
    }

    @Bean
    public Player kim(Dice dice){
//        Player player = new Player(dice);
        Player player = new Player();
        player.setDice(dice);        //설정자를 통한 주입
        player.setName("김둘리");
        return player;
    }

    @Bean
    public Player hong(Dice dice){
//        Player player = new Player(dice);
        Player player = new Player();
        player.setDice(dice);        //설정자를 통한 주입
        player.setName("홍길동");
        return player;
    }
    @Bean
    public Player jo(Dice dice){
//        Player player = new Player(dice);
        Player player = new Player();
        player.setDice(dice);        //설정자를 통한 주입
        player.setName("조은희");
        return player;
    }

    @Bean
    public Player lee(Dice dice){
//        Player player = new Player(dice);
        Player player = new Player();
        player.setDice(dice);        //설정자를 통한 주입
        player.setName("이또치");
        return player;
    }
    @Bean
    public Player doo(Dice dice){
//        Player player = new Player(dice);
        Player player = new Player();
        player.setDice(dice);        //설정자를 통한 주입
        player.setName("도상원");
        return player;
    }

    @Bean
    public Game game(List<Player> playerList){
//        return new Game(playerList);    //생성자를 통한 주입
        Game game = new Game();
        game.setList(playerList);    //설정자를 통한 주입
        return game;
    }
}
