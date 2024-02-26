<!DOCTYPE html>
<html>
    <head>
        <title>Leo Official Website</title>
    </head>
    <body>
    <h1>Welcome!</h1>
    <ul>
        <#--  list menuItems as item     -->
        <#list menuItems as item>
        <li><a href="${item.url}">${item.label}</a></li>
        </#list>
    </ul>
    <footer>
        ${currentYear} Leo Web. All rights reserved.
    </footer>
    </body>
</html>