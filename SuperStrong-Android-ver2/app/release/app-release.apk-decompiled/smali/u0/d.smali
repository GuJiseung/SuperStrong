.class public final Lu0/d;
.super Lu0/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lu0/a$a;->b:Lu0/a$a;

    invoke-direct {p0, v0}, Lu0/d;-><init>(Lu0/a;)V

    return-void
.end method

.method public constructor <init>(Lu0/a;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lu0/a;-><init>()V

    .line 2
    iget-object v0, p0, Lu0/a;->a:Ljava/util/LinkedHashMap;

    iget-object p1, p1, Lu0/a;->a:Ljava/util/LinkedHashMap;

    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method
