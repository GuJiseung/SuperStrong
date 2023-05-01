.class public final Lcom/bumptech/glide/g;
.super Landroid/content/ContextWrapper;
.source "SourceFile"


# static fields
.field public static final k:Lcom/bumptech/glide/a;


# instance fields
.field public final a:Ll1/b;

.field public final b:Lcom/bumptech/glide/j;

.field public final c:La1/f0;

.field public final d:Lcom/bumptech/glide/b$a;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "La2/f<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/bumptech/glide/m<",
            "**>;>;"
        }
    .end annotation
.end field

.field public final g:Lk1/m;

.field public final h:Lcom/bumptech/glide/h;

.field public final i:I

.field public j:La2/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/bumptech/glide/a;

    invoke-direct {v0}, Lcom/bumptech/glide/a;-><init>()V

    sput-object v0, Lcom/bumptech/glide/g;->k:Lcom/bumptech/glide/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ll1/b;Lcom/bumptech/glide/j;La1/f0;Lcom/bumptech/glide/c;Ll/b;Ljava/util/List;Lk1/m;Lcom/bumptech/glide/h;I)V
    .locals 0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/bumptech/glide/g;->a:Ll1/b;

    iput-object p3, p0, Lcom/bumptech/glide/g;->b:Lcom/bumptech/glide/j;

    iput-object p4, p0, Lcom/bumptech/glide/g;->c:La1/f0;

    iput-object p5, p0, Lcom/bumptech/glide/g;->d:Lcom/bumptech/glide/b$a;

    iput-object p7, p0, Lcom/bumptech/glide/g;->e:Ljava/util/List;

    iput-object p6, p0, Lcom/bumptech/glide/g;->f:Ljava/util/Map;

    iput-object p8, p0, Lcom/bumptech/glide/g;->g:Lk1/m;

    iput-object p9, p0, Lcom/bumptech/glide/g;->h:Lcom/bumptech/glide/h;

    iput p10, p0, Lcom/bumptech/glide/g;->i:I

    return-void
.end method
