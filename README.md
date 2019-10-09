## 说明

## 资料

## 工具

fiddler抓包工具 windows用

## 毕设相关
前端配置
cd /opt/code/sell_fe_buyer/config

vim index.js 修改里面的

sellUrl、openidUrl、wechatPayUrl

然后回到前端项目的根目录

cd ..

npm run build

构建好的文件在dist目录下

ls -al dist/

cp -r dist/* /opt/data/wwwroot/sell/

全部yes覆盖

Nginx服务器不用重启

