# admin-api
### openapi.yamlの生成
プロジェクトルートから以下のコマンドを実行してアプリケーションを起動する。
```bash
export DB_PASSWORD=postgres
export DB_URL=jdbc:postgresql://localhost:5432/postgres
export DB_USERNAME=postgres
./gradlew bootRun --console=plain | sed -u 's/\\n/\n/g' | sed -u 's/\\t/\t/g'
```
以下(アプリを起動したターミナルとは別のターミナルを使用)のコマンドを実行してAPIドキュメント（openapi.yaml）を取得する。
```bash
curl -s --noproxy localhost http://localhost:8080/v3/api-docs.yaml > build/../openapi.yaml
```

### openapi.htmlの生成
```bash
npm install redoc-cli # 初回のみ
npx redoc-cli bundle build/../openapi.yaml -o openapi.html --options.expandResponses=all
```
