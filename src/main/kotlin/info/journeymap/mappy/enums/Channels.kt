package info.journeymap.mappy.enums

/**
 * An enum representing each type of channel that may be configured, for easier reference.
 *
 * @param value A human-readable representation of the given channel.
 */
enum class Channels(val value: String) {
    /** The channel intended for running bot commands in. **/
    BOT_COMMANDS("bot-commands"),

    /** The channel used for bot logs. **/
    BOT_LOGS("bot-logs"),

    /** The channel used for moderator chat. **/
    MODS("mods"),

    /** The channel used general server info. **/
    INFO("info")
}
