module de.oppermann.bastian.safetrade {
  requires net.kyori.adventure.text.serializer.legacy;
  requires net.milkbowl.vault;
  requires org.bukkit;
  exports de.oppermann.bastian.safetrade;
  opens de.oppermann.bastian.safetrade.listener to org.bukkit;
}
