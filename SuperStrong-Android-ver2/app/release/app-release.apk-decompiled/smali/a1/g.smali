.class public final La1/g;
.super La1/l;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/util/ArrayList;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/util/ArrayList;

.field public final synthetic g:La1/f;


# direct methods
.method public constructor <init>(La1/f;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, La1/g;->g:La1/f;

    iput-object p2, p0, La1/g;->a:Ljava/lang/Object;

    iput-object p3, p0, La1/g;->b:Ljava/util/ArrayList;

    const/4 p1, 0x0

    iput-object p1, p0, La1/g;->c:Ljava/lang/Object;

    iput-object p1, p0, La1/g;->d:Ljava/util/ArrayList;

    iput-object p4, p0, La1/g;->e:Ljava/lang/Object;

    iput-object p5, p0, La1/g;->f:Ljava/util/ArrayList;

    invoke-direct {p0}, La1/l;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, La1/g;->g:La1/f;

    iget-object v2, p0, La1/g;->a:Ljava/lang/Object;

    if-eqz v2, :cond_0

    iget-object v3, p0, La1/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v2, v3, v0}, La1/f;->s(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_0
    iget-object v2, p0, La1/g;->c:Ljava/lang/Object;

    if-eqz v2, :cond_1

    iget-object v3, p0, La1/g;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v2, v3, v0}, La1/f;->s(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_1
    iget-object v2, p0, La1/g;->e:Ljava/lang/Object;

    if-eqz v2, :cond_2

    iget-object v3, p0, La1/g;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v2, v3, v0}, La1/f;->s(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_2
    return-void
.end method

.method public final e(La1/i;)V
    .locals 0

    invoke-virtual {p1, p0}, La1/i;->y(La1/i$d;)V

    return-void
.end method
