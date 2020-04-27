package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PokemonButtleController {
	List<Player> playerList = new ArrayList<>();

	@RequestMapping(value = "/pokeEntry", method = RequestMethod.GET)
	public ModelAndView pokeEntry(ModelAndView mav) {
		mav.setViewName("pokeEntry");
		return mav;
	}

	@RequestMapping(value = "/turnDecision")
	public ModelAndView turnDecision(
			ModelAndView mav,
			@RequestParam("playerName1") String playerName1,
			@RequestParam("selectPoke1") String poke1,
			@RequestParam("playerName2") String playerName2,
			@RequestParam("selectPoke2") String poke2) {

		Map<String, Pokemon> pokemon = new HashMap<>(); //ポケモンインスタンス用Map
		pokemon.put("pikachu", new Pikachu());
		pokemon.put("zenigame", new Zenigame());
		Map<String, String> pokePath = new HashMap<>(); //ポケモン画像パス用Map
		pokePath.put("pikachu", "/images/pika.png");
		pokePath.put("zenigame", "/images/zeni.png");

		playerList.add(new Player(playerName1, pokemon.get(poke1), pokePath.get(poke1)));
		playerList.add(new Player(playerName2, pokemon.get(poke2), pokePath.get(poke2)));

		mav.setViewName("skillSelect");
		mav.addObject("playerList", playerList);

		return mav;
	}

	@RequestMapping(value = "/butlle", method = RequestMethod.POST)
	public ModelAndView pokemonButtle(ModelAndView mav,
			@RequestParam("selectSkill1") Integer skill1,
			@RequestParam("selectSkill2") Integer skill2
			) {
		playerList.get(1).getusePoke().attack(playerList.get(0).getusePoke(),skill2);
		playerList.get(0).getusePoke().setHp(playerList.get(0).getusePoke().getHp()-10);

		mav.setViewName("skillSelect");
		mav.addObject("playerList",playerList);
		return mav;
	}
}
