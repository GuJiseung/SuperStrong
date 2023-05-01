.class public final Lg5/z$a;
.super Lv4/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lv4/a0;

.field public final b:Lv4/s;


# direct methods
.method public constructor <init>(Lv4/a0;Lv4/s;)V
    .locals 0

    invoke-direct {p0}, Lv4/a0;-><init>()V

    iput-object p1, p0, Lg5/z$a;->a:Lv4/a0;

    iput-object p2, p0, Lg5/z$a;->b:Lv4/s;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-object v0, p0, Lg5/z$a;->a:Lv4/a0;

    invoke-virtual {v0}, Lv4/a0;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b()Lv4/s;
    .locals 1

    iget-object v0, p0, Lg5/z$a;->b:Lv4/s;

    return-object v0
.end method

.method public final c(Lf5/f;)V
    .locals 1

    iget-object v0, p0, Lg5/z$a;->a:Lv4/a0;

    invoke-virtual {v0, p1}, Lv4/a0;->c(Lf5/f;)V

    return-void
.end method
