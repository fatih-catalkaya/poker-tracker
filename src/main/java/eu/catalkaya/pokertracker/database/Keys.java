/*
 * This file is generated by jOOQ.
 */
package eu.catalkaya.pokertracker.database;


import eu.catalkaya.pokertracker.database.tables.Login;
import eu.catalkaya.pokertracker.database.tables.Player;
import eu.catalkaya.pokertracker.database.tables.Transactions;
import eu.catalkaya.pokertracker.database.tables.records.LoginRecord;
import eu.catalkaya.pokertracker.database.tables.records.PlayerRecord;
import eu.catalkaya.pokertracker.database.tables.records.TransactionsRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in the
 * default schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<LoginRecord> CONSTRAINT_4 = Internal.createUniqueKey(Login.LOGIN, DSL.name("CONSTRAINT_4"), new TableField[] { Login.LOGIN.ID }, true);
    public static final UniqueKey<PlayerRecord> CONSTRAINT_8 = Internal.createUniqueKey(Player.PLAYER, DSL.name("CONSTRAINT_8"), new TableField[] { Player.PLAYER.ID }, true);
    public static final UniqueKey<TransactionsRecord> CONSTRAINT_F = Internal.createUniqueKey(Transactions.TRANSACTIONS, DSL.name("CONSTRAINT_F"), new TableField[] { Transactions.TRANSACTIONS.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<TransactionsRecord, PlayerRecord> CONSTRAINT_FE = Internal.createForeignKey(Transactions.TRANSACTIONS, DSL.name("CONSTRAINT_FE"), new TableField[] { Transactions.TRANSACTIONS.PLAYER_ID }, Keys.CONSTRAINT_8, new TableField[] { Player.PLAYER.ID }, true);
}
