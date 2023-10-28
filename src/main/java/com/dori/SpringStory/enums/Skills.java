package com.dori.SpringStory.enums;

import java.util.Arrays;

public enum Skills {
    NONE(-1),
    BEGINNER_THREE_SNAILS(1000),
    BEGINNER_RECOVERY(1001),
    BEGINNER_NIMBLE_FEET(1002),
    NOVICE_SOUL_OF_CRAFTMAN(1003),
    NOVICE_MONSTER_RIDING(1004),
    NOVICE_MAXLEVEL_ECHOBUFF(1005),
    NOVICE_DAMAGEMETER(1006),
    NOVICE_MULTI_PET(8),
    NOVICE_MAKER(1007),
    NOVICE_BAMBOO(1009),
    NOVICE_INVINCIBLE(1010),
    NOVICE_BERSERK(1011),
    NOVICE_BLESS_OF_NYMPH(12),
    DISABLE_NOVICE_EVENT_RIDING(1013),
    DISABLE_NOVICE_EVENT_RIDING_DASH(1014),
    DISABLE_NOVICE_EVENT_RIDING_REACTOR(1015),
    DISABLE_NOVICE_YETI_EVENT_RIDING(1017),
    DISABLE_NOVICE_YETI_EVENT_RIDING2(1018),
    DISABLE_NOVICE_BROOM_EVENT_RIDING(1019),
    NOVICE_MASSACRE(1020),
    NOVICE_WOODENHORSE_EVENT_RIDING(1025),
    NOVICE_FLYING_SKILL(1026),
    NOVICE_KROKO_EVENT_RIDING(1027),
    NOVICE_NAKED_EVENT_RIDING(1028),
    NOVICE_PINK_SCOOTER_EVENT_RIDING(1029),
    NOVICE_FLYING_CLOUD_EVENT_RIDING(1030),
    NOVICE_BALROG_EVENT_RIDING(1031),
    NOVICE_KART_EVENT_RIDING(1033),
    NOVICE_ZD_TIGER_EVENT_RIDING(1034),
    NOVICE_MISTBALROG_EVENT_RIDING(1035),
    NOVICE_LIONS_EVENT_RIDING(1036),
    NOVICE_UNICORN_EVENT_RIDING(1037),
    NOVICE_LOWRIDER_EVENT_RIDING(1038),
    NOVICE_REDTRUCK_EVENT_RIDING(1039),
    NOVICE_GARGOYLES_EVENT_RIDING(1040),
    NOVICE_SPACE_EVENT_RIDING(1046),
    NOVICE_SPACE_EVENT_RIDING_DASH(1047),
    NOVICE_SPACE_EVENT_RIDING_REACTOR(1048),
    NOVICE_CHICKEN_EVENT_RIDING(1054),
    NOVICE_HOLLY_BIRD_EVENT_RIDING(1042),
    NOVICE_ORANGE_MUSHROOM_EVENT_RIDING(1044),
    NOVICE_NIGHTMARE_EVENT_RIDING(1049),
    NOVICE_YETI_EVENT_RIDING(1050),
    NOVICE_OSTRICH_EVENT_RIDING(1051),
    NOVICE_BEAR_BALOON_EVENT_RIDING(1052),
    NOVICE_TRANS_ROBOT_EVENT_RIDING(1053),
    NOVICE_MOTORBIKE_EVENT_RIDING(1063),
    NOVICE_POWERED_SUIT_EVENT_RIDING(1064),
    NOVICE_VISITOR_EVENT_RIDING(1065),
    NOBLELESS_VISITOR_EVENT_RIDING(10001065),
    ARAN_VISITOR_EVENT_RIDING(20001065),
    EVAN_VISITOR_EVENT_RIDING(20011065),
    CITIZEN_VISITOR_EVENT_RIDING(30001065),
    NOVICE_VISITOR_OWL_RIDING(1069),
    NOBLELESS_VISITOR_OWL_RIDING(10001069),
    ARAN_VISITOR_OWL_RIDING(20001069),
    EVAN_VISITOR_OWL_RIDING(20011069),
    CITIZEN_VISITOR_OWL_RIDING(30001069),
    NOVICE_VISITOR_MOTHERSHIP_RIDING(1070),
    NOBLELESS_VISITOR_MOTHERSHIP_RIDING(10001070),
    ARAN_VISITOR_MOTHERSHIP_RIDING(20001070),
    EVAN_VISITOR_MOTHERSHIP_RIDING(20011070),
    CITIZEN_VISITOR_MOTHERSHIP_RIDING(30001070),
    NOVICE_VISITOR_OS3_A_RIDING(1071),
    NOBLELESS_VISITOR_OS3_A_RIDING(10001071),
    ARAN_VISITOR_OS3_A_RIDING(20001071),
    EVAN_VISITOR_OS3_A_RIDING(20011071),
    CITIZEN_VISITOR_OS3_A_RIDING(30001071),
    NOVICE_VISITOR_MORPH_SKILL_NORMAL(1066),
    NOVICE_VISITOR_MORPH_SKILL_SKILL(1067),
    NOBLELESS_VISITOR_MORPH_SKILL_NORMAL(10001066),
    NOBLELESS_VISITOR_MORPH_SKILL_SKILL(10001067),
    ARAN_VISITOR_MORPH_SKILL_NORMAL(20001066),
    ARAN_VISITOR_MORPH_SKILL_SKILL(20001067),
    EVAN_VISITOR_MORPH_SKILL_NORMAL(20011066),
    EVAN_VISITOR_MORPH_SKILL_SKILL(20011067),
    CITIZEN_VISITOR_MORPH_SKILL_NORMAL(30001066),
    CITIZEN_VISITOR_MORPH_SKILL_SKILL(30001067),
    NOVICE_HASTE(8000),
    NOVICE_MYSTIC_DOOR(8001),
    NOVICE_SHARP_EYES(8002),
    NOVICE_HYPER_BODY(8003),
    NOVICE_MONSTER_HANDICAP_BEGIN(9000),
    NOVICE_MONSTER_HANDICAP_END(9002),
    WARRIOR_IRON_BODY(1001003),
    WARRIOR_POWER_STRIKE(1001004),
    WARRIOR_SLASH_BLAST(1001005),
    WARRIOR_MHP_INC(1000006),
    FIGHTER_WEAPON_MASTERY(1100000),
    FIGHTER_FINAL_ATTACK(1100002),
    FIGHTER_WEAPON_BOOSTER(1101004),
    FIGHTER_FURY(1101006),
    FIGHTER_POWER_GUARD(1101007),
    FIGHTER_GROUND_SMASH(1101008),
    FIGHTER_IMPROVE_BASIC(1100009),
    CRUSADER_UPGRADE_MP_RECOVERY(1110000),
    CRUSADER_COMBO_ATTACK(1111002),
    CRUSADER_PANIC(1111003),
    CRUSADER_COMA(1111005),
    CRUSADER_MAGIC_CRASH(1111007),
    CRUSADER_SHOUT(1111008),
    CRUSADER_CHANCE_ATTACK(1110009),
    CRUSADER_BRANDISH(1111010),
    HERO_MAPLE_HERO(1121000),
    HERO_MONSTER_MAGNET(1121001),
    HERO_STANCE(1121002),
    HERO_ADVANCED_COMBO(1120003),
    HERO_HARD_SKIN(1120004),
    HERO_RUSH(1121006),
    HERO_BRAVE_SLASH(1121008),
    HERO_ENRAGE(1121010),
    HERO_HEROS_WILL(1121011),
    HERO_COMBAT_MASTERY(1120012),
    PAGE_WEAPON_MASTERY(1200000),
    PAGE_FINAL_ATTACK(1200002),
    PAGE_WEAPON_BOOSTER(1201004),
    PAGE_THREATEN(1201006),
    PAGE_POWER_GUARD(1201007),
    PAGE_GROUND_SMASH(1201008),
    PAGE_IMPROVE_BASIC(1200009),
    WHITE_KNIGHT_SHIELD_MASTERY(1210001),
    WHITE_KNIGHT_CHARGE_BLOW(1211002),
    WHITE_KNIGHT_FIRE_CHARGE(1211004),
    WHITE_KNIGHT_ICE_CHARGE(1211006),
    WHITE_KNIGHT_LIGHTNING_CHARGE(1211008),
    WHITE_KNIGHT_MAGIC_CRASH(1211009),
    WHITE_KNIGHT_HP_RECOVERY(1211010),
    WHITE_KNIGHT_COMBAT_ORDERS(1211011),
    PALADIN_MAPLE_HERO(1221000),
    PALADIN_STANCE(1221002),
    PALADIN_DIVINE_CHARGE(1221004),
    PALADIN_HARD_SKIN(1220005),
    PALADIN_BLOCKING(1220006),
    PALADIN_RUSH(1221007),
    PALADIN_BLAST(1221009),
    PALADIN_ADVANCED_CHARGE(1220010),
    PALADIN_SANCTUARY(1221011),
    PALADIN_HEROS_WILL(1221012),
    PALADIN_BLESSING_ARMOR(1220013),
    SPEARMAN_WEAPON_MASTERY(1300000),
    SPEARMAN_FINAL_ATTACK(1300002),
    SPEARMAN_WEAPON_BOOSTER(1301004),
    SPEARMAN_IRON_WALL(1301006),
    SPEARMAN_HYPER_BODY(1301007),
    SPEARMAN_GROUND_SMASH(1301008),
    SPEARMAN_IMPROVE_BASIC(1300009),
    DRAGONKNIGHT_ELEMENT_RESISTANCE(1310000),
    DRAGONKNIGHT_DRAGON_BURSTER(1311001),
    DRAGONKNIGHT_DRAGON_THRESHER(1311003),
    DRAGONKNIGHT_SACRIFICE(1311005),
    DRAGONKNIGHT_DRAGON_ROAR(1311006),
    DRAGONKNIGHT_MAGIC_CRASH(1311007),
    DRAGONKNIGHT_DRAGON_BLOOD(1311008),
    DRAGONKNIGHT_DRAGON_JUDGEMENT(1310009),
    DARKKNIGHT_MAPLE_HERO(1321000),
    DARKKNIGHT_MONSTER_MAGNET(1321001),
    DARKKNIGHT_STANCE(1321002),
    DARKKNIGHT_RUSH(1321003),
    DARKKNIGHT_HARD_SKIN(1320005),
    DARKKNIGHT_DARK_FORCE(1320006),
    DARKKNIGHT_BEHOLDER(1321007),
    DARKKNIGHT_BEHOLDERS_HEALING(1320008),
    DARKKNIGHT_BEHOLDERS_BUFF(1320009),
    DARKKNIGHT_HEROS_WILL(1321010),
    DARKKNIGHT_BEHOLDERS_REVENGE(1320011),
    MAGICIAN_MAGIC_GUARD(2001002),
    MAGICIAN_MAGIC_ARMOR(2001003),
    MAGICIAN_ENERGY_BOLT(2001004),
    MAGICIAN_MAGIC_CLAW(2001005),
    MAGICIAN_MMP_INC(2000006),
    WIZARD1_MP_EATER(2100000),
    WIZARD1_MEDITATION(2101001),
    WIZARD1_TELEPORT(2101002),
    WIZARD1_SLOW(2101003),
    WIZARD1_FIRE_ARROW(2101004),
    WIZARD1_POISON_BREATH(2101005),
    WIZARD1_SPELL_MASTERY(2100006),
    MAGE1_PARTIAL_RESISTANCE(2110000),
    MAGE1_ELEMENT_AMPLIFICATION(2110001),
    MAGE1_EXPLOSION(2111002),
    MAGE1_POISON_MIST(2111003),
    MAGE1_SEAL(2111004),
    MAGE1_MAGIC_BOOSTER(2111005),
    MAGE1_MAGIC_COMPOSITION(2111006),
    MAGE1_TELEPORT_MASTERY(2111007),
    MAGE1_ELEMENTAL_RESET(2111008),
    ARCHMAGE1_MAPLE_HERO(2121000),
    ARCHMAGE1_BIGBANG(2121001),
    ARCHMAGE1_MANA_REFLECTION(2121002),
    ARCHMAGE1_FIRE_DEMON(2121003),
    ARCHMAGE1_INFINITY(2121004),
    ARCHMAGE1_IFRIT(2121005),
    ARCHMAGE1_PARALYZE(2121006),
    ARCHMAGE1_METEOR(2121007),
    ARCHMAGE1_HEROS_WILL(2121008),
    ARCHMAGE1_MASTER_MAGIC(2120009),
    WIZARD2_MP_EATER(2200000),
    WIZARD2_MEDITATION(2201001),
    WIZARD2_TELEPORT(2201002),
    WIZARD2_SLOW(2201003),
    WIZARD2_COLD_BEAM(2201004),
    WIZARD2_THUNDER_BOLT(2201005),
    WIZARD2_SPELL_MASTERY(2200006),
    MAGE2_PARTIAL_RESISTANCE(2210000),
    MAGE2_ELEMENT_AMPLIFICATION(2210001),
    MAGE2_ICE_STRIKE(2211002),
    MAGE2_THUNDER_SPEAR(2211003),
    MAGE2_SEAL(2211004),
    MAGE2_MAGIC_BOOSTER(2211005),
    MAGE2_MAGIC_COMPOSITION(2211006),
    MAGE2_TELEPORT_MASTERY(2211007),
    MAGE2_ELEMENTAL_RESET(2211008),
    ARCHMAGE2_MAPLE_HERO(2221000),
    ARCHMAGE2_BIGBANG(2221001),
    ARCHMAGE2_MANA_REFLECTION(2221002),
    ARCHMAGE2_ICE_DEMON(2221003),
    ARCHMAGE2_INFINITY(2221004),
    ARCHMAGE2_ELQUINES(2221005),
    ARCHMAGE2_CHAIN_LIGHTNING(2221006),
    ARCHMAGE2_BLIZZARD(2221007),
    ARCHMAGE2_HEROS_WILL(2221008),
    ARCHMAGE2_MASTER_MAGIC(2220009),
    CLERIC_MP_EATER(2300000),
    CLERIC_TELEPORT(2301001),
    CLERIC_HEAL(2301002),
    CLERIC_INVINCIBLE(2301003),
    CLERIC_BLESS(2301004),
    CLERIC_HOLY_ARROW(2301005),
    CLERIC_SPELL_MASTERY(2300006),
    PRIEST_ELEMENT_RESISTANCE(2310000),
    PRIEST_DISPEL(2311001),
    PRIEST_MYSTIC_DOOR(2311002),
    PRIEST_HOLY_SYMBOL(2311003),
    PRIEST_SHINING_RAY(2311004),
    PRIEST_DOOM(2311005),
    PRIEST_SUMMON_DRAGON(2311006),
    PRIEST_TELEPORT_MASTERY(2311007),
    PRIEST_HOLY_FOCUS(2310008),
    BISHOP_MAPLE_HERO(2321000),
    BISHOP_BIGBANG(2321001),
    BISHOP_MANA_REFLECTION(2321002),
    BISHOP_BAHAMUT(2321003),
    BISHOP_INFINITY(2321004),
    BISHOP_HOLY_SHIELD(2321005),
    BISHOP_RESURRECTION(2321006),
    BISHOP_ANGELS_RAY(2321007),
    BISHOP_GENESIS(2321008),
    BISHOP_HEROS_WILL(2321009),
    BISHOP_MASTER_MAGIC(2320010),
    ARCHER_CRITICAL_SHOT(3000001),
    ARCHER_AMAZON_EYE(3000002),
    ARCHER_FOCUS(3001003),
    ARCHER_ARROW_BLOW(3001004),
    ARCHER_DOUBLE_SHOT(3001005),
    HUNTER_BOW_MASTERY(3100000),
    HUNTER_FINAL_ATTACK_BOW(3100001),
    HUNTER_BOW_BOOSTER(3101002),
    HUNTER_POWER_KNOCKBACK(3101003),
    HUNTER_SOUL_ARROW_BOW(3101004),
    HUNTER_ARROW_BOMB(3101005),
    HUNTER_IMPROVE_BASIC(3100006),
    RANGER_THRUST(3110000),
    RANGER_MORTAL_BLOW(3110001),
    RANGER_PUPPET(3111002),
    RANGER_FIRE_SHOT(3111003),
    RANGER_ARROW_RAIN(3111004),
    RANGER_SILVER_HAWK(3111005),
    RANGER_STRAFE(3111006),
    RANGER_DODGE(3110007),
    BOWMASTER_MAPLE_HERO(3121000),
    BOWMASTER_SHARP_EYES(3121002),
    BOWMASTER_DRAGON_PULSE(3121003),
    BOWMASTER_STORM_ARROW(3121004),
    BOWMASTER_BOW_EXPERT(3120005),
    BOWMASTER_PHOENIX(3121006),
    BOWMASTER_HAMSTRING(3121007),
    BOWMASTER_CONCENTRATION(3121008),
    BOWMASTER_HEROS_WILL(3121009),
    BOWMASTER_VENGEANCE(3120010),
    BOWMASTER_MARKMAN_SHIP(3120011),
    CROSSBOWMAN_CROSSBOW_MASTERY(3200000),
    CROSSBOWMAN_FINAL_ATTACK_CROSSBOW(3200001),
    CROSSBOWMAN_CROSSBOW_BOOSTER(3201002),
    CROSSBOWMAN_POWER_KNOCKBACK(3201003),
    CROSSBOWMAN_SOUL_ARROW_CROSSBOW(3201004),
    CROSSBOWMAN_IRON_ARROW(3201005),
    CROSSBOWMAN_IMPROVE_BASIC(3200006),
    SNIPER_THRUST(3210000),
    SNIPER_MORTAL_BLOW(3210001),
    SNIPER_PUPPET(3211002),
    SNIPER_ICE_SHOT(3211003),
    SNIPER_ARROW_ERUPTION(3211004),
    SNIPER_GOLDEN_EAGLE(3211005),
    SNIPER_STRAFE(3211006),
    SNIPER_DODGE(3210007),
    CROSSBOWMASTER_MAPLE_HERO(3221000),
    CROSSBOWMASTER_PIERCING(3221001),
    CROSSBOWMASTER_SHARP_EYES(3221002),
    CROSSBOWMASTER_DRAGON_PULSE(3221003),
    CROSSBOWMASTER_CROSSBOW_EXPERT(3220004),
    CROSSBOWMASTER_FREEZER(3221005),
    CROSSBOWMASTER_BLIND(3221006),
    CROSSBOWMASTER_SNIPING(3221007),
    CROSSBOWMASTER_HEROS_WILL(3221008),
    CROSSBOWMASTER_MARKMAN_SHIP(3220009),
    CROSSBOWMASTER_ULTIMATE_STRAFE(3220010),
    ROGUE_NIMBLE_BODY(4000000),
    ROGUE_KEEN_EYES(4000001),
    ROGUE_DISORDER(4001002),
    ROGUE_DARK_SIGHT(4001003),
    ROGUE_DOUBLE_STAB_DAGGER(4001334),
    ROGUE_LUCKY_SEVEN(4001344),
    ASSASSIN_JAVELIN_MASTERY(4100000),
    ASSASSIN_CRITICAL_THROW(4100001),
    ASSASSIN_JAVELIN_BOOSTER(4101003),
    ASSASSIN_HASTE(4101004),
    ASSASSIN_DRAIN(4101005),
    ASSASSIN_SHADOW_RESISTANCE(4100006),
    HERMIT_ALCHEMIST(4110000),
    HERMIT_MESO_UP(4111001),
    HERMIT_SHADOW_PARTNER(4111002),
    HERMIT_SHADOW_WEB(4111003),
    HERMIT_SHADOW_MESO(4111004),
    HERMIT_AVENGER(4111005),
    HERMIT_FLASH_JUMP(4111006),
    HERMIT_SHADOW_MIRROR(4111007),
    NIGHTLORD_MAPLE_HERO(4121000),
    NIGHTLORD_FAKE(4120002),
    NIGHTLORD_SHOWDOWN(4121003),
    NIGHTLORD_NINJA_AMBUSH(4121004),
    NIGHTLORD_VENOM(4120005),
    NIGHTLORD_SPIRIT_JAVELIN(4121006),
    NIGHTLORD_TRIPLE_THROW(4121007),
    NIGHTLORD_NINJA_STORM(4121008),
    NIGHTLORD_HEROS_WILL(4121009),
    NIGHTLORD_EXPERT_JAVELIN(4120010),
    THIEF_DAGGER_MASTERY(4200000),
    THIEF_DAGGER_BOOSTER(4201002),
    THIEF_HASTE(4201003),
    THIEF_STEAL(4201004),
    THIEF_SAVAGE_BLOW_DAGGER(4201005),
    THIEF_SHADOW_RESISTANCE(4200006),
    THIEFMASTER_SHIELD_MASTERY(4210000),
    THIEFMASTER_CHAKRA(4211001),
    THIEFMASTER_ASSAULTER(4211002),
    THIEFMASTER_PICKPOCKET(4211003),
    THIEFMASTER_THIEVES(4211004),
    THIEFMASTER_MESO_GUARD(4211005),
    THIEFMASTER_MESO_EXPLOSION(4211006),
    THIEFMASTER_SHADOW_MIRROR(4211007),
    THIEFMASTER_SHADOW_PARTNER(4211008),
    THIEFMASTER_FLASH_JUMP(4211009),
    SHADOWER_MAPLE_HERO(4221000),
    SHADOWER_ASSASSINATION(4221001),
    SHADOWER_FAKE(4220002),
    SHADOWER_SHOWDOWN(4221003),
    SHADOWER_NINJA_AMBUSH(4221004),
    SHADOWER_VENOM(4220005),
    SHADOWER_SMOKE_SHELL(4221006),
    SHADOWER_BOOMERANG_STEP(4221007),
    SHADOWER_HEROS_WILL(4221008),
    SHADOWER_GRID(4220009),
    DUAL1_DUAL_MASTERY(4300000),
    DUAL1_TRIPLE_STAB(4301001),
    DUAL1_DUAL_BOOSTER(4301002),
    DUAL2_SELF_HASTE(4311001),
    DUAL2_FATAL_BLOW(4311002),
    DUAL2_SLASH_STORM(4311003),
    DUAL2_SHADOW_RESISTANCE(4310004),
    DUAL3_HUSTLE_DASH(4321000),
    DUAL3_HUSTLE_RUSH(4321001),
    DUAL3_FLASH_BANG(4321002),
    DUAL3_FLASH_JUMP(4321003),
    DUAL4_BLOODY_STORM(4331000),
    DUAL4_ADVANCED_DARK_SIGHT(4330001),
    DUAL4_MIRROR_IMAGING(4331002),
    DUAL4_OWL_DEATH(4331003),
    DUAL4_UPPER_STAB(4331004),
    DUAL4_FLYING_ASSAULTER(4331005),
    DUAL5_MAPLE_HERO(4341000),
    DUAL5_VENOM(4340001),
    DUAL5_FINAL_CUT(4341002),
    DUAL5_MONSTER_BOMB(4341003),
    DUAL5_SUDDEN_RAID(4341004),
    DUAL5_ASSASSINATION(4341005),
    DUAL5_DUMMY_EFFECT(4341006),
    DUAL5_THORNS_EFFECT(4341007),
    DUAL5_HEROS_WILL(4341008),
    PIRATE_QUICKMOTION(5000000),
    PIRATE_STRAIGHT(5001001),
    PIRATE_SOMERSAULT(5001002),
    PIRATE_DOUBLE_FIRE(5001003),
    PIRATE_DASH(5001005),
    INFIGHTER_KNUCKLE_MASTERY(5100001),
    INFIGHTER_BACKSPIN_BLOW(5101002),
    INFIGHTER_DOUBLE_UPPER(5101003),
    INFIGHTER_SCREW_PUNCH(5101004),
    INFIGHTER_MP_RECOVERY(5101005),
    INFIGHTER_KNUCKLE_BOOSTER(5101006),
    INFIGHTER_OAK_CASK(5101007),
    INFIGHTER_MHP_INC(5100009),
    INFIGHTER_CRITICAL_PUNCH(5100008),
    BUCCANEER_STUN_MASTERY(5110000),
    BUCCANEER_ENERGY_CHARGE(5110001),
    BUCCANEER_ENERGY_BURSTER(5111002),
    BUCCANEER_ENERGY_DRAIN(5111004),
    BUCCANEER_TRANSFORM(5111005),
    BUCCANEER_SHOCKWAVE(5111006),
    BUCCANEER_DICE(5111007),
    BUCCANEER_INFIGHTING_MASTERY(5110008),
    VIPER_MAPLE_HERO(5121000),
    VIPER_DRAGON_STRIKE(5121001),
    VIPER_ENERGY_ORB(5121002),
    VIPER_SUPER_TRANSFORM(5121003),
    VIPER_DEMOLITION(5121004),
    VIPER_SNATCH(5121005),
    VIPER_FIST(5121007),
    VIPER_HEROS_WILL(5121008),
    VIPER_WIND_BOOSTER(5121009),
    VIPER_TIME_LEAP(5121010),
    VIPER_COUNTER_ATTACK(5120011),
    GUNSLINGER_GUN_MASTERY(5200000),
    GUNSLINGER_INVISIBLE_SHOT(5201001),
    GUNSLINGER_THROWING_BOMB(5201002),
    GUNSLINGER_GUN_BOOSTER(5201003),
    GUNSLINGER_FAKE_SHOT(5201004),
    GUNSLINGER_WINGS(5201005),
    GUNSLINGER_BACKSTEP_SHOT(5201006),
    GUNSLINGER_CRITICAL_SHOT(5200007),
    VALKYRIE_TRIPLE_FIRE(5210000),
    VALKYRIE_OCTOPUS(5211001),
    VALKYRIE_GABIOTA(5211002),
    VALKYRIE_FIRE_BURNER(5211004),
    VALKYRIE_COOLING_EFFECT(5211005),
    VALKYRIE_HOMING(5211006),
    VALKYRIE_DICE(5211007),
    CAPTAIN_MAPLE_HERO(5221000),
    CAPTAIN_PROPERTY_UPGRADE(5220001),
    CAPTAIN_SUPPORT_OCTOPUS(5220002),
    CAPTAIN_AIR_STRIKE(5221003),
    CAPTAIN_RAPID_FIRE(5221004),
    CAPTAIN_BATTLESHIP(5221006),
    CAPTAIN_BATTLESHIP_D(5221999),
    CAPTAIN_BATTLESHIP_CANNON(5221007),
    CAPTAIN_BATTLESHIP_TORPEDO(5221008),
    CAPTAIN_MIND_CONTROL(5221009),
    CAPTAIN_HEROS_WILL(5221010),
    CAPTAIN_ADVANCED_HOMING(5220011),
    CAPTAIN_COUNTER_ATTACK(5220012),
    MANAGER_ANTIMACRO(8001000),
    MANAGER_TELEPORT(8001001),
    ADMIN_HASTE(9001000),
    ADMIN_DRAGON_ROAR(9001001),
    ADMIN_TELEPORT(9001002),
    ADMIN_DISPEL(9101000),
    ADMIN_SUPER_HASTE(9101001),
    ADMIN_HOLY_SYMBOL(9101002),
    ADMIN_BLESS(9101003),
    ADMIN_HIDE(9101004),
    ADMIN_RESURRECTION(9101005),
    ADMIN_HYPER_BODY(9101008),
    ADMIN_ANTIMACRO(9001009),
    NOBLESSE_THROW_SNAIL(10001000),
    NOBLESSE_REGENERATION(10001001),
    NOBLESSE_MOVING_WITH_ACTIVITY(10001002),
    NOBLESSE_SOUL_OF_CRAFTMAN(10001003),
    NOBLESSE_MONSTER_RIDING(10001004),
    NOBLESSE_MAXLEVEL_ECHOBUFF(10001005),
    NOBLESSE_DAMAGEMETER(10001006),
    NOBLESSE_MAKER(10001007),
    NOBLESSE_BAMBOO(10001009),
    NOBLESSE_INVINCIBLE(10001010),
    NOBLESSE_BERSERK(10001011),
    NOBLESSE_BLESS_OF_NYMPH(10000012),
    NOBLESSE_TUTOR(10001013),
    DISABLE_NOBLESSE_EVENT_RIDING(10001014),
    DISABLE_NOBLESSE_EVENT_RIDING_DASH(10001015),
    DISABLE_NOBLESSE_EVENT_RIDING_REACTOR(10001016),
    NOBLESSE_MULTI_PET(10000018),
    DISABLE_NOBLESSE_YETI_EVENT_RIDING(10001019),
    NOBLESSE_MASSACRE(10001020),
    DISABLE_NOBLESSE_YETI_EVENT_RIDING2(10001022),
    DISABLE_NOBLESSE_BROOM_EVENT_RIDING(10001023),
    NOBLESSE_WOODENHORSE_EVENT_RIDING(10001025),
    NOBLESSE_FLYING_SKILL(10001026),
    NOBLESSE_KROKO_EVENT_RIDING(10001027),
    NOBLESSE_NAKED_EVENT_RIDING(10001028),
    NOBLESSE_PINK_SCOOTER_EVENT_RIDING(10001029),
    NOBLESSE_FLYING_CLOUD_EVENT_RIDING(10001030),
    NOBLESSE_BALROG_EVENT_RIDING(10001031),
    NOBLESSE_KART_EVENT_RIDING(10001033),
    NOBLESSE_ZD_TIGER_EVENT_RIDING(10001034),
    NOBLESSE_MISTBALROG_EVENT_RIDING(10001035),
    NOBLESSE_LIONS_EVENT_RIDING(10001036),
    NOBLESSE_UNICORN_EVENT_RIDING(10001037),
    NOBLESSE_LOWRIDER_EVENT_RIDING(10001038),
    NOBLESSE_REDTRUCK_EVENT_RIDING(10001039),
    NOBLESSE_GARGOYLES_EVENT_RIDING(10001040),
    NOBLESSE_SPACE_EVENT_RIDING(10001046),
    NOBLESSE_SPACE_EVENT_RIDING_DASH(10001047),
    NOBLESSE_SPACE_EVENT_RIDING_REACTOR(10001048),
    NOBLESSE_CHICKEN_EVENT_RIDING(10001054),
    NOBLESSE_HOLLY_BIRD_EVENT_RIDING(10001042),
    NOBLESSE_ORANGE_MUSHROOM_EVENT_RIDING(10001044),
    NOBLESSE_NIGHTMARE_EVENT_RIDING(10001049),
    NOBLESSE_YETI_EVENT_RIDING(10001050),
    NOBLESSE_OSTRICH_EVENT_RIDING(10001051),
    NOBLESSE_BEAR_BALOON_EVENT_RIDING(10001052),
    NOBLESSE_TRANS_ROBOT_EVENT_RIDING(10001053),
    NOBLESSE_MOTORBIKE_EVENT_RIDING(10001063),
    NOBLESSE_POWERED_SUIT_EVENT_RIDING(10001064),
    NOBLESSE_HASTE(10008000),
    NOBLESSE_MYSTIC_DOOR(10008001),
    NOBLESSE_SHARP_EYES(10008002),
    NOBLESSE_HYPER_BODY(10008003),
    STRIKER_QUICKMOTION(15000000),
    STRIKER_STRAIGHT(15001001),
    STRIKER_SOMERSAULT(15001002),
    STRIKER_DASH(15001003),
    STRIKER_LIGHTNING(15001004),
    STRIKER_KNUCKLE_MASTERY(15100001),
    STRIKER_KNUCKLE_BOOSTER(15101002),
    STRIKER_SCREW_PUNCH(15101003),
    STRIKER_ENERGY_CHARGE(15100004),
    STRIKER_ENERGY_BURSTER(15101005),
    STRIKER_LIGHTNING_CHARGE(15101006),
    STRIKER_MHP_INC(15100007),
    STRIKER_CRITICAL_PUNCH(15110000),
    STRIKER_ENERGY_DRAIN(15111001),
    STRIKER_TRANSFORM(15111002),
    STRIKER_SHOCKWAVE(15111003),
    STRIKER_FIST(15111004),
    STRIKER_WIND_BOOSTER(15111005),
    STRIKER_SPARK(15111006),
    STRIKER_SHARK_WAVE(15111007),
    SOULMASTER_IRON_BODY(11001001),
    SOULMASTER_POWER_STRIKE(11001002),
    SOULMASTER_SLASH_BLAST(11001003),
    SOULMASTER_SOUL(11001004),
    SOULMASTER_MHP_INC(11000005),
    SOULMASTER_SWORD_MASTERY(11100000),
    SOULMASTER_SWORD_BOOSTER(11101001),
    SOULMASTER_FINAL_ATTACK_SWORD(11101002),
    SOULMASTER_FURY(11101003),
    SOULMASTER_SOUL_BLADE(11101004),
    SOULMASTER_SOUL_RUSH(11101005),
    SOULMASTER_UPGRADE_MP_RECOVERY(11110000),
    SOULMASTER_COMBO_ATTACK(11111001),
    SOULMASTER_PANIC_SWORD(11111002),
    SOULMASTER_COMA_SWORD(11111003),
    SOULMASTER_BRANDISH(11111004),
    SOULMASTER_ADVANCED_COMBO(11110005),
    SOULMASTER_SOUL_DRIVER(11111006),
    SOULMASTER_SOUL_CHARGE(11111007),
    FLAMEWIZARD_MAGIC_GUARD(12001001),
    FLAMEWIZARD_MAGIC_ARMOR(12001002),
    FLAMEWIZARD_MAGIC_CLAW(12001003),
    FLAMEWIZARD_FLAME(12001004),
    FLAMEWIZARD_MMP_INC(12000005),
    FLAMEWIZARD_MEDITATION(12101000),
    FLAMEWIZARD_SLOW(12101001),
    FLAMEWIZARD_FIRE_ARROW(12101002),
    FLAMEWIZARD_TELEPORT(12101003),
    FLAMEWIZARD_MAGIC_BOOSTER(12101004),
    FLAMEWIZARD_ELEMENTAL_RESET(12101005),
    FLAMEWIZARD_FIRE_PILLAR(12101006),
    FLAMEWIZARD_SPELL_MASTERY(12100007),
    FLAMEWIZARD_ELEMENT_RESISTANCE(12110000),
    FLAMEWIZARD_ELEMENT_AMPLIFICATION(12110001),
    FLAMEWIZARD_SEAL(12111002),
    FLAMEWIZARD_METEOR(12111003),
    FLAMEWIZARD_IFRIT(12111004),
    FLAMEWIZARD_FLAME_GEAR(12111005),
    FLAMEWIZARD_FIRE_STRIKE(12111006),
    WINDBREAKER_CRITICAL_SHOT(13000000),
    WINDBREAKER_AMAZON_EYE(13000001),
    WINDBREAKER_FOCUS(13001002),
    WINDBREAKER_DOUBLE_SHOT(13001003),
    WINDBREAKER_STORM(13001004),
    WINDBREAKER_BOW_MASTERY(13100000),
    WINDBREAKER_BOW_BOOSTER(13101001),
    WINDBREAKER_FINAL_ATTACK_BOW(13101002),
    WINDBREAKER_SOUL_ARROW_BOW(13101003),
    WINDBREAKER_THRUST(13100004),
    WINDBREAKER_STORM_BREAK(13101005),
    WINDBREAKER_WIND_WALK(13101006),
    WINDBREAKER_ARROW_RAIN(13111000),
    WINDBREAKER_STRAFE(13111001),
    WINDBREAKER_STORM_ARROW(13111002),
    WINDBREAKER_BOW_EXPERT(13110003),
    WINDBREAKER_PUPPET(13111004),
    WINDBREAKER_ALBATROSS(13111005),
    WINDBREAKER_WIND_SPEAR(13111006),
    WINDBREAKER_WIND_SHOT(13111007),
    NIGHTWALKER_NIMBLE_BODY(14000000),
    NIGHTWALKER_KEEN_EYES(14000001),
    NIGHTWALKER_DISORDER(14001002),
    NIGHTWALKER_DARK_SIGHT(14001003),
    NIGHTWALKER_LUCKY_SEVEN(14001004),
    NIGHTWALKER_DARKNESS(14001005),
    NIGHTWALKER_JAVELIN_MASTERY(14100000),
    NIGHTWALKER_CRITICAL_THROW(14100001),
    NIGHTWALKER_JAVELIN_BOOSTER(14101002),
    NIGHTWALKER_HASTE(14101003),
    NIGHTWALKER_FLASH_JUMP(14101004),
    NIGHTWALKER_VANISH(14100005),
    NIGHTWALKER_VAMPIRE(14101006),
    NIGHTWALKER_SHADOW_PARTNER(14111000),
    NIGHTWALKER_SHADOW_WEB(14111001),
    NIGHTWALKER_AVENGER(14111002),
    NIGHTWALKER_ALCHEMIST(14110003),
    NIGHTWALKER_VENOM(14110004),
    NIGHTWALKER_TRIPLE_THROW(14111005),
    NIGHTWALKER_POISON_BOMB(14111006),
    LEGEND_THROW_SNAIL(20001000),
    LEGEND_REGENERATION(20001001),
    LEGEND_MOVING_WITH_ACTIVITY(20001002),
    LEGEND_SOUL_OF_CRAFTMAN(20001003),
    LEGEND_MONSTER_RIDING(20001004),
    LEGEND_MAXLEVEL_ECHOBUFF(20001005),
    LEGEND_DAMAGEMETER(20001006),
    LEGEND_MAKER(20001007),
    LEGEND_BAMBOO(20001009),
    LEGEND_INVINCIBLE(20001010),
    LEGEND_BERSERK(20001011),
    LEGEND_BLESS_OF_NYMPH(20000012),
    LEGEND_TUTOR(20001013),
    LEGEND_DOUBLE_SWING(20000014),
    LEGEND_TRIPLE_SWING(20000015),
    LEGEND_FINAL_BLOW(20000016),
    LEGEND_COMBO_ABILITY(20000017),
    LEGEND_COMBO_CRITICAL(20000018),
    DISABLE_LEGEND_YETI_EVENT_RIDING(20001019),
    LEGEND_MASSACRE(20001020),
    DISABLE_LEGEND_YETI_EVENT_RIDING2(20001022),
    DISABLE_LEGEND_BROOM_EVENT_RIDING(20001023),
    LEGEND_MULTI_PET(20000024),
    LEGEND_WOODENHORSE_EVENT_RIDING(20001025),
    LEGEND_FLYING_SKILL(20001026),
    LEGEND_KROKO_EVENT_RIDING(20001027),
    LEGEND_NAKED_EVENT_RIDING(20001028),
    LEGEND_PINK_SCOOTER_EVENT_RIDING(20001029),
    LEGEND_FLYING_CLOUD_EVENT_RIDING(20001030),
    LEGEND_BALROG_EVENT_RIDING(20001031),
    LEGEND_KART_EVENT_RIDING(20001033),
    LEGEND_ZD_TIGER_EVENT_RIDING(20001034),
    LEGEND_MISTBALROG_EVENT_RIDING(20001035),
    LEGEND_LIONS_EVENT_RIDING(20001036),
    LEGEND_UNICORN_EVENT_RIDING(20001037),
    LEGEND_LOWRIDER_EVENT_RIDING(20001038),
    LEGEND_REDTRUCK_EVENT_RIDING(20001039),
    LEGEND_GARGOYLES_EVENT_RIDING(20001040),
    LEGEND_SPACE_EVENT_RIDING(20001046),
    LEGEND_SPACE_EVENT_RIDING_DASH(20001047),
    LEGEND_SPACE_EVENT_RIDING_REACTOR(20001048),
    LEGEND_CHICKEN_EVENT_RIDING(20001054),
    LEGEND_HOLLY_BIRD_EVENT_RIDING(20001042),
    LEGEND_ORANGE_MUSHROOM_EVENT_RIDING(20001044),
    LEGEND_NIGHTMARE_EVENT_RIDING(20001049),
    LEGEND_YETI_EVENT_RIDING(20001050),
    LEGEND_OSTRICH_EVENT_RIDING(20001051),
    LEGEND_BEAR_BALOON_EVENT_RIDING(20001052),
    LEGEND_TRANS_ROBOT_EVENT_RIDING(20001053),
    LEGEND_MOTORBIKE_EVENT_RIDING(20001063),
    LEGEND_POWERED_SUIT_EVENT_RIDING(20001064),
    LEGEND_HASTE(20008000),
    LEGEND_MYSTIC_DOOR(20008001),
    LEGEND_SHARP_EYES(20008002),
    LEGEND_HYPER_BODY(20008003),
    ARAN_COMBO_ABILITY(21000000),
    ARAN_COMBAT_STEP(21001001),
    ARAN_DOUBLE_SWING(21000002),
    ARAN_POLEARM_BOOSTER(21001003),
    ARAN_POLEARM_MASTERY(21100000),
    ARAN_TRIPLE_SWING(21100001),
    ARAN_FINAL_CHARGE(21100002),
    ARAN_BODY_PRESSURE(21101003),
    ARAN_COMBO_SMASH(21100004),
    ARAN_COMBO_DRAIN(21100005),
    ARAN_COMBO_CRITICAL(21110000),
    ARAN_SMART_KNOCKBACK(21111001),
    ARAN_FULL_SWING(21110002),
    ARAN_FINAL_TOSS(21110003),
    ARAN_COMBO_FENRIR(21110004),
    ARAN_SNOW_CHARGE(21111005),
    ARAN_ROLLING_SPIN(21110006),
    ARAN_FULL_SWING_DS(21110007),
    ARAN_FULL_SWING_TS(21110008),
    ARAN_MAPLE_HERO(21121000),
    ARAN_HIGH_MASTERY(21120001),
    ARAN_OVER_SWING(21120002),
    ARAN_FREEZE_STANDING(21121003),
    ARAN_HIGH_DEFENSE(21120004),
    ARAN_FINAL_BLOW(21120005),
    ARAN_COMBO_TEMPEST(21120006),
    ARAN_COMBO_BARRIER(21120007),
    ARAN_HEROS_WILL(21121008),
    ARAN_OVER_SWING_DS(21120009),
    ARAN_OVER_SWING_TS(21120010),
    EVANJR_THROW_SNAIL(20011000),
    EVANJR_REGENERATION(20011001),
    EVANJR_MOVING_WITH_ACTIVITY(20011002),
    EVANJR_SOUL_OF_CRAFTMAN(20011003),
    EVANJR_MONSTER_RIDING(20011004),
    EVANJR_MAXLEVEL_ECHOBUFF(20011005),
    EVANJR_DAMAGEMETER(20011006),
    EVANJR_MAKER(20011007),
    EVANJR_BAMBOO(20011009),
    EVANJR_INVINCIBLE(20011010),
    EVANJR_BERSERK(20011011),
    EVANJR_BLESS_OF_NYMPH(20010012),
    DISABLE_EVANJR_YETI_EVENT_RIDING2(20011018),
    DISABLE_EVANJR_BROOM_EVENT_RIDING(20011019),
    EVANJR_MASSACRE(20011020),
    EVANJR_MULTI_PET(20011024),
    EVANJR_WOODENHORSE_EVENT_RIDING(20011025),
    EVANJR_FLYING_SKILL(20011026),
    EVANJR_KROKO_EVENT_RIDING(20011027),
    EVANJR_NAKED_EVENT_RIDING(20011028),
    EVANJR_PINK_SCOOTER_EVENT_RIDING(20011029),
    EVANJR_FLYING_CLOUD_EVENT_RIDING(20011030),
    EVANJR_BALROG_EVENT_RIDING(20011031),
    EVANJR_KART_EVENT_RIDING(20011033),
    EVANJR_ZD_TIGER_EVENT_RIDING(20011034),
    EVANJR_MISTBALROG_EVENT_RIDING(20011035),
    EVANJR_HOLLY_BIRD_EVENT_RIDING(20011042),
    EVANJR_ORANGE_MUSHROOM_EVENT_RIDING(20011044),
    EVANJR_NIGHTMARE_EVENT_RIDING(20011049),
    EVANJR_YETI_EVENT_RIDING(20011050),
    EVANJR_OSTRICH_EVENT_RIDING(20011051),
    EVANJR_BEAR_BALOON_EVENT_RIDING(20011052),
    EVANJR_TRANS_ROBOT_EVENT_RIDING(20011053),
    EVANJR_MOTORBIKE_EVENT_RIDING(20011063),
    EVANJR_POWERED_SUIT_EVENT_RIDING(20011064),
    EVANJR_LIONS_EVENT_RIDING(20011036),
    EVANJR_UNICORN_EVENT_RIDING(20011037),
    EVANJR_LOWRIDER_EVENT_RIDING(20011038),
    EVANJR_REDTRUCK_EVENT_RIDING(20011039),
    EVANJR_GARGOYLES_EVENT_RIDING(20011040),
    EVANJR_SPACE_EVENT_RIDING(20011046),
    EVANJR_SPACE_EVENT_RIDING_DASH(20011047),
    EVANJR_SPACE_EVENT_RIDING_REACTOR(20011048),
    EVANJR_CHICKEN_EVENT_RIDING(20011054),
    EVANJR_HASTE(20018000),
    EVANJR_MYSTIC_DOOR(20018001),
    EVANJR_SHARP_EYES(20018002),
    EVANJR_HYPER_BODY(20018003),
    EVAN_DRAGON_SOUL(22000000),
    EVAN_MAGIC_MISSILE(22001001),
    EVAN_FIRECIRCLE(22101000),
    EVAN_TELEPORT(22101001),
    EVAN_LIGHTING_BOLT(22111000),
    EVAN_MAGIC_GUARD(22111001),
    EVAN_ICE_BREATH(22121000),
    EVAN_ELEMENTAL_RESET(22121001),
    EVAN_SPELL_MASTERY(22120002),
    EVAN_MAGIC_FLAIR(22131000),
    EVAN_MAGIC_SHIELD(22131001),
    EVAN_MAGIC_CRITICAL(22140000),
    EVAN_DRAGON_THRUST(22141001),
    EVAN_MAGIC_BOOSTER(22141002),
    EVAN_SLOW(22141003),
    EVAN_ELEMENT_AMPLIFICATION(22150000),
    EVAN_BREATH(22151001),
    EVAN_KILLING_WING(22151002),
    EVAN_MAGIC_REGISTANCE(22151003),
    EVAN_DRAGON_FURY(22160000),
    EVAN_EARTHQUAKE(22161001),
    EVAN_GHOST_LETTERING(22161002),
    EVAN_RECOVERY_AURA(22161003),
    EVAN_MAPLE_HERO(22171000),
    EVAN_MAGIC_MASTERY(22170001),
    EVAN_ILLUSION(22171002),
    EVAN_FLAME_WHEEL(22171003),
    EVAN_HEROS_WILL(22171004),
    EVAN_ONIX_BLESSING(22181000),
    EVAN_BLAZE(22181001),
    EVAN_DARK_FOG(22181002),
    EVAN_SOUL_STONE(22181003),
    CITIZEN_CRISTAL_THROW(30001000),
    CITIZEN_SNEAK(30001001),
    CITIZEN_EFFICIENCY(30000002),
    CITIZEN_SOUL_OF_CRAFTMAN(30001003),
    CITIZEN_MONSTER_RIDING(30001004),
    CITIZEN_MAXLEVEL_ECHOBUFF(30001005),
    CITIZEN_DAMAGEMETER(30001006),
    CITIZEN_MAKER(30001007),
    CITIZEN_BAMBOO(30001009),
    CITIZEN_INVINCIBLE(30001010),
    CITIZEN_BERSERK(30001011),
    CITIZEN_BLESS_OF_NYMPH(30000012),
    CITIZEN_TUTOR(30001013),
    CITIZEN_MASSACRE(30001020),
    CITIZEN_CRITICAL(30000022),
    CITIZEN_MULTI_PET(30001024),
    CITIZEN_WOODENHORSE_EVENT_RIDING(30001025),
    CITIZEN_FLYING_SKILL(30001026),
    CITIZEN_KROKO_EVENT_RIDING(30001027),
    CITIZEN_NAKED_EVENT_RIDING(30001028),
    CITIZEN_PINK_SCOOTER_EVENT_RIDING(30001029),
    CITIZEN_FLYING_CLOUD_EVENT_RIDING(30001030),
    CITIZEN_BALROG_EVENT_RIDING(30001031),
    CITIZEN_KART_EVENT_RIDING(30001033),
    CITIZEN_ZD_TIGER_EVENT_RIDING(30001034),
    CITIZEN_MISTBALROG_EVENT_RIDING(30001035),
    CITIZEN_HOLLY_BIRD_EVENT_RIDING(30001042),
    CITIZEN_ORANGE_MUSHROOM_EVENT_RIDING(30001044),
    CITIZEN_NIGHTMARE_EVENT_RIDING(30001049),
    CITIZEN_YETI_EVENT_RIDING(30001050),
    CITIZEN_OSTRICH_EVENT_RIDING(30001051),
    CITIZEN_BEAR_BALOON_EVENT_RIDING(30001052),
    CITIZEN_TRANS_ROBOT_EVENT_RIDING(30001053),
    CITIZEN_MOTORBIKE_EVENT_RIDING(30001063),
    CITIZEN_POWERED_SUIT_EVENT_RIDING(30001064),
    CITIZEN_HASTE(30008000),
    CITIZEN_MYSTIC_DOOR(30008001),
    CITIZEN_SHARP_EYES(30008002),
    CITIZEN_HYPER_BODY(30008003),
    WILDHUNTER_CAPTURE(30001061),
    WILDHUNTER_SUMMON_MONSTER(30001062),
    MECHANIC_RUSH(30001068),
    BMAGE_TRIPLE_BLOW(32001000),
    BMAGE_FINISH_ATTACK(32001001),
    BMAGE_TELEPORT(32001002),
    BMAGE_AURA_DARK(32001003),
    BMAGE_FINISH_ATTACK1(32001007),
    BMAGE_FINISH_ATTACK2(32001008),
    BMAGE_FINISH_ATTACK3(32001009),
    BMAGE_FINISH_ATTACK4(32001010),
    BMAGE_FINISH_ATTACK5(32001011),
    BMAGE_QUAD_BLOW(32101000),
    BMAGE_DARK_BOW(32101001),
    BMAGE_AURA_BLUE(32101002),
    BMAGE_AURA_YELLOW(32101003),
    BMAGE_BLOOD_DRAIN(32101004),
    BMAGE_STAFF_BOOSTER(32101005),
    BMAGE_SPELL_MASTERY(32100006),
    BMAGE_AURA_BLUE_ADVANCED(32110000),
    BMAGE_STAFF_MASTERY(32110001),
    BMAGE_DEATH_BLOW(32111002),
    BMAGE_DARK_SPEAR(32111003),
    BMAGE_CONVERSION(32111004),
    BMAGE_SUPER_BODY(32111005),
    BMAGE_REVIVE(32111006),
    BMAGE_SUPER_BODY_DARK(32110007),
    BMAGE_SUPER_BODY_YELLOW(32110008),
    BMAGE_SUPER_BODY_BLUE(32110009),
    BMAGE_TELEPORT_MASTERY(32111010),
    BMAGE_ADVENCED_DARK_CHAIN(32111011),
    BMAGE_AURA_DARK_ADVANCED(32120000),
    BMAGE_AURA_YELLOW_ADVANCED(32120001),
    BMAGE_FINISH_BLOW(32121002),
    BMAGE_CYCLONE(32121003),
    BMAGE_NEMESIS(32121004),
    BMAGE_STANCE(32121005),
    BMAGE_SHELTER(32121006),
    BMAGE_MAPLE_HERO(32121007),
    BMAGE_HEROS_WILL(32121008),
    BMAGE_ENERGIZE(32120009),
    WILDHUNTER_RAPID_SHOOT(33001000),
    WILDHUNTER_JAGUAR_RIDING(33001001),
    WILDHUNTER_DOUBLE_JUMP(33001002),
    WILDHUNTER_CROSSBOW_BOOSTER(33001003),
    WILDHUNTER_CROSSBOW_MASTERY(33100000),
    WILDHUNTER_BOMB_SHOOT(33101001),
    WILDHUNTER_JAGUAR_NUCKBACK(33101002),
    WILDHUNTER_SOUL_ARROW_CROSSBOW(33101003),
    WILDHUNTER_MINE(33101004),
    WILDHUNTER_SWALLOW(33101005),
    WILDHUNTER_SWALLOW_DUMMY_BUFF(33101006),
    WILDHUNTER_SWALLOW_DUMMY_ATTACK(33101007),
    WILDHUNTER_MINE_DUMMY_SUMMONED(33101008),
    WILDHUNTER_FINAL_ATTACK(33100009),
    WILDHUNTER_RIDING_MASTERY(33110000),
    WILDHUNTER_FIVE_SHOOT(33111001),
    WILDHUNTER_CROSS_ROAD(33111002),
    WILDHUNTER_TRAP(33111003),
    WILDHUNTER_BLIND(33111004),
    WILDHUNTER_SILVER_HAWK(33111005),
    WILDHUNTER_CLAW_CUT(33111006),
    WILDHUNTER_CROSSBOW_EXPERT(33120000),
    WILDHUNTER_FLASH_RAIN(33121001),
    WILDHUNTER_ELRECTRONICSHOCK(33121002),
    WILDHUNTER_SNIPING(33121003),
    WILDHUNTER_SHARP_EYES(33121004),
    WILDHUNTER_NERVEGAS(33121005),
    WILDHUNTER_MOREWILD(33121006),
    WILDHUNTER_MAPLE_HERO(33121007),
    WILDHUNTER_HEROS_WILL(33121008),
    WILDHUNTER_WILD_SHOOT(33121009),
    WILDHUNTER_WILD_INSTINCT(33120010),
    MECHANIC_FLAMETHROWER(35001001),
    MECHANIC_FLAMETHROWER_DUMMY(35000001),
    MECHANIC_HN07(35001002),
    MECHANIC_DRILL_RUSH(35001003),
    MECHANIC_GATLING(35001004),
    MECHANIC_GUN_MASTERY(35100000),
    MECHANIC_GATLING_ROBOT_G007(35101001),
    MECHANIC_EARTH_SLUG(35101003),
    MECHANIC_ROCKET_BOOSTER(35101004),
    MECHANIC_ROCKET_BOOSTER_DUMMY(35100004),
    MECHANIC_OPEN_GATE(35101005),
    MECHANIC_BOOSTER(35101006),
    MECHANIC_PERFECT_ARMOR(35101007),
    MECHANIC_WEAPONMASTERY(35100008),
    MECHANIC_FLAMETHROWER_UP(35101009),
    MECHANIC_FLAMETHROWER_UP_DUMMY(35100009),
    MECHANIC_GATLING_UP(35101010),
    MECHANIC_SATELITE(35111001),
    MECHANIC_TESLA_COIL(35111002),
    MECHANIC_SIEGE1(35111004),
    MECHANIC_SIEGE1_DUMMY(35110004),
    MECHANIC_VELOCITY_CONTROLER(35111005),
    MECHANIC_SATELITE2(35111009),
    MECHANIC_SATELITE3(35111010),
    MECHANIC_HEALING_ROBOT_H_LX(35111011),
    MECHANIC_DICE(35111013),
    MECHANIC_METAL_FIST_MASTERY(35110014),
    MECHANIC_ROCKET_PUNCH(35111015),
    MECHANIC_HN07_UPGRADE(35120000),
    MECHANIC_MASTERY(35120001),
    MECHANIC_ROBOROBO_UPGRADE(35120002),
    MECHANIC_SG88(35121003),
    MECHANIC_CANON(35121004),
    MECHANIC_SIEGE2(35121005),
    MECHANIC_SIEGE2_DUMMY(35120005),
    MECHANIC_SAFETY(35121006),
    MECHANIC_MAPLE_HERO(35121007),
    MECHANIC_HEROS_WILL(35121008),
    MECHANIC_ROBOROBO(35121009),
    MECHANIC_AR01(35121010),
    MECHANIC_ROBOROBO_DUMMY(35121011),
    MECHANIC_LASER(35121012),
    MECHANIC_SIEGE2_SPECIAL(35121013),
    MECHANIC_SIEGE2_SPECIAL_DUMMY(35120013),
    UNRECORDED_DEADLYATTACK(90000000),
    UNRECORDED_STUN(90001001),
    UNRECORDED_SLOW(90001002),
    UNRECORDED_POISON(90001003),
    UNRECORDED_BLIND(90001004),
    UNRECORDED_SEAL(90001005),
    UNRECORDED_FREEZE(90001006),
    GUILD_MESOUP(91000000),
    GUILD_EXPERIENCEUP(91000001),
    GUILD_DEFENCEUP(91000002),
    GUILD_ATTNMAGUP(91000003),
    GUILD_AGILITYUP(91000004),
    GUILD_BUSINESSEFFICENYUP(91000005),
    GUILD_REGULARSUPPORT(91000006),
    AURA_ALL(0),
    AURA_DARK_BLUE(1),
    AURA_DARK_YELLOW(2),
    AURA_BLUE_YELOW(3);

    private final int id;

    Skills(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static Skills getSkillById(int skillID){
        return Arrays.stream(Skills.values())
                .filter(skill -> skill.getId() == skillID)
                .findFirst()
                .orElse(NONE);
    }
}
