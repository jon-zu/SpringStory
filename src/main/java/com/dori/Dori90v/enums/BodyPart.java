package com.dori.Dori90v.enums;

import java.util.Arrays;

public enum BodyPart {
    BPBase(0),
    Hair(0),
    Hat(1),
    FaceAccessory(2),
    EyeAccessory(3),
    Earrings(4),
    Top(5),
    Overall(5), // Top and overall share the same body part
    Bottom(6),
    Shoes(7),
    Gloves(8),
    Cape(9),
    Shield(10), // Includes things such as katara, 2ndary
    Weapon(11),
    Ring1(12),
    Ring2(13),
    PetWear1(14),
    Ring3(15),
    Ring4(16),
    Pendant(17),
    TamingMob(18),
    Saddle(19),
    MobEquip(20),
    Medal(21),
    Belt(22),
    Shoulder(23),
    PetWear2(24),
    PetWear3(25),
    PocketItem(26),
    Android_OLD(27),
    MechanicalHeart_OLD(28),
    Badge(29),
    Emblem(30),
    Extended0(31),
    ExtendedPendant(31),
    Extended1(32),
    Extended2(33),
    Extended3(34),
    Extended4(35),
    Extended5(36),
    Extended6(37),
    MonsterBook(55),
    BPEnd(100),
    CBPBase(101), // CASH
    CashWeapon(111),
    PetConsumeHPItem(200),
    PetConsumeMPItem(201),
    CBPEnd(1000),
    EvanBase(1000),
    EvanHat(1000),
    EvanPendant(1001),
    EvanWing(1002),
    EvanShoes(1003),
    EvanEnd(1004),
    APBase(1200),
    APHat(1200),
    APCape(1201),
    APFaceAccessory(1202),
    APTop(1203),
    APOverall(1203),
    APBottom(1204),
    APShoes(1205),
    APGloves(1206),
    APEnd(1207),
    DUBase(1300),
    DUHat(1300),
    DUCape(1301),
    DUFaceAccessory(1302),
    DUTop(1303),
    DUOverall(1303),
    DUGloves(1304),
    DUEnd(1305),
    MBPBase(5100),
    MBPHat(5101),
    MBPCape(5102),
    MBPTop(5103),
    MBPOverall(5103),
    MBPGloves(5104),
    MBPShoes(5105),
    MBPWeapon(5106),
    MBPEnd(5107),
    SlotIndexNotDefined(15440);

    private final int val;

    BodyPart(int val) {
        this.val = val;
    }

    public static BodyPart getByVal(int bodyPartVal) {
        return Arrays.stream(values()).filter(bp -> bp.getVal() == bodyPartVal).findAny().orElse(null);
    }

    public int getVal() {
        return val;
    }
}