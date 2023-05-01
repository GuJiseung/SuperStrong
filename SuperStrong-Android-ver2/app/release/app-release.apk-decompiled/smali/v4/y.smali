.class public final Lv4/y;
.super Lv4/a0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lv4/s;

.field public final synthetic b:Lf5/h;


# direct methods
.method public constructor <init>(Lv4/s;Lf5/h;)V
    .locals 0

    iput-object p1, p0, Lv4/y;->a:Lv4/s;

    iput-object p2, p0, Lv4/y;->b:Lf5/h;

    invoke-direct {p0}, Lv4/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-object v0, p0, Lv4/y;->b:Lf5/h;

    invoke-virtual {v0}, Lf5/h;->j()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public final b()Lv4/s;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lv4/y;->a:Lv4/s;

    return-object v0
.end method

.method public final c(Lf5/f;)V
    .locals 1

    iget-object v0, p0, Lv4/y;->b:Lf5/h;

    invoke-interface {p1, v0}, Lf5/f;->g(Lf5/h;)Lf5/f;

    return-void
.end method
