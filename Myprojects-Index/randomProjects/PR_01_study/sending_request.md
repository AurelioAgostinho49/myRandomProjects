curl`
`--header` "Content-Type: application/json" _type of archieve that will be posted (created)
`--request` POST _the request (can be Create, Read, Update and Delete)
`--data` '{
	`"headline": "Test Blog Entry from REST Services", "articleBody": "This article was posted via REST services provided by Liferay DXP."``
	}' - the data you will send

`http://localhost:8080/o/headless-delivery/v1.0/sites/*20122*/blog-postings` - the endpoint, remember to change the ID

`-u` test@liferay.com:learn - your key

## Returns a list of blogs entries

`curl`
"http://localhost:8080/o/headless-delivery/v1.0/sites/20122/blog-postings/"
`-u` 'test@liferay.com:learn'

## Returns the blog entry property

`curl` `"http://localhost:8080/o/headless-delivery/v1.0/blog-postings/35215` * that is the entry ID"
`-u` test@liferay.com:learn

## Deleting a blog entry

`curl` `-X` DELETE `"http://localhost:8080/o/headless-delivery/v1.0/blog-postings/35215"` `-u` test@liferay.com:learn


### Summary of parameters

`--header` define o tipo de conteudo a ser enviado 
`--request` define which action you will require
`--data` define the data you will send

===

`-X` define the action`
`-u` stands for user

