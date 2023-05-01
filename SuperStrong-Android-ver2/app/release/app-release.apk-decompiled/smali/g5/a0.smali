.class public final Lg5/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg5/a0$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/reflect/Method;

.field public final b:Lv4/q;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final e:Lv4/p;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final f:Lv4/s;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:[Lg5/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lg5/x<",
            "*>;"
        }
    .end annotation
.end field

.field public final k:Z


# direct methods
.method public constructor <init>(Lg5/a0$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lg5/a0$a;->b:Ljava/lang/reflect/Method;

    iput-object v0, p0, Lg5/a0;->a:Ljava/lang/reflect/Method;

    iget-object v0, p1, Lg5/a0$a;->a:Lg5/d0;

    iget-object v0, v0, Lg5/d0;->c:Lv4/q;

    iput-object v0, p0, Lg5/a0;->b:Lv4/q;

    iget-object v0, p1, Lg5/a0$a;->n:Ljava/lang/String;

    iput-object v0, p0, Lg5/a0;->c:Ljava/lang/String;

    iget-object v0, p1, Lg5/a0$a;->r:Ljava/lang/String;

    iput-object v0, p0, Lg5/a0;->d:Ljava/lang/String;

    iget-object v0, p1, Lg5/a0$a;->s:Lv4/p;

    iput-object v0, p0, Lg5/a0;->e:Lv4/p;

    iget-object v0, p1, Lg5/a0$a;->t:Lv4/s;

    iput-object v0, p0, Lg5/a0;->f:Lv4/s;

    iget-boolean v0, p1, Lg5/a0$a;->o:Z

    iput-boolean v0, p0, Lg5/a0;->g:Z

    iget-boolean v0, p1, Lg5/a0$a;->p:Z

    iput-boolean v0, p0, Lg5/a0;->h:Z

    iget-boolean v0, p1, Lg5/a0$a;->q:Z

    iput-boolean v0, p0, Lg5/a0;->i:Z

    iget-object v0, p1, Lg5/a0$a;->v:[Lg5/x;

    iput-object v0, p0, Lg5/a0;->j:[Lg5/x;

    iget-boolean p1, p1, Lg5/a0$a;->w:Z

    iput-boolean p1, p0, Lg5/a0;->k:Z

    return-void
.end method
