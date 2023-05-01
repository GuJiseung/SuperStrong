.class public final Lk1/m$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ln1/a;

.field public final b:Ln1/a;

.field public final c:Ln1/a;

.field public final d:Ln1/a;

.field public final e:Lk1/o;

.field public final f:Lk1/q$a;

.field public final g:Lf2/a$c;


# direct methods
.method public constructor <init>(Ln1/a;Ln1/a;Ln1/a;Ln1/a;Lk1/o;Lk1/q$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lk1/m$b$a;

    invoke-direct {v0, p0}, Lk1/m$b$a;-><init>(Lk1/m$b;)V

    const/16 v1, 0x96

    invoke-static {v1, v0}, Lf2/a;->a(ILf2/a$b;)Lf2/a$c;

    move-result-object v0

    iput-object v0, p0, Lk1/m$b;->g:Lf2/a$c;

    iput-object p1, p0, Lk1/m$b;->a:Ln1/a;

    iput-object p2, p0, Lk1/m$b;->b:Ln1/a;

    iput-object p3, p0, Lk1/m$b;->c:Ln1/a;

    iput-object p4, p0, Lk1/m$b;->d:Ln1/a;

    iput-object p5, p0, Lk1/m$b;->e:Lk1/o;

    iput-object p6, p0, Lk1/m$b;->f:Lk1/q$a;

    return-void
.end method
